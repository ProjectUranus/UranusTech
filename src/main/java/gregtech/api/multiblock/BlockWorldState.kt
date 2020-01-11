package gregtech.api.multiblock

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import java.util.function.Predicate

class BlockWorldState {
    var world: BlockView? = null
        private set
    var pos: BlockPos? = null
    var state: BlockState? = null
    var tileEntity: BlockEntity? = null
    var tileEntityInitialized = false
    var matchContext: PatternMatchContext? = null
        private set
    var layerContext: PatternMatchContext? = null
        private set

    fun update(worldIn: BlockView, posIn: BlockPos?, matchContext: PatternMatchContext?, layerContext: PatternMatchContext?) {
        world = worldIn
        pos = posIn
        state = null
        tileEntity = null
        tileEntityInitialized = false
        this.matchContext = matchContext
        this.layerContext = layerContext
    }

    val blockState: BlockState?
        get() {
            if (state == null) {
                state = world!!.getBlockState(pos)
            }
            return state
        }

    val blockEntity: BlockEntity?
        get() {
            if (tileEntity == null && !tileEntityInitialized) {
                tileEntity = world!!.getBlockEntity(pos)
                tileEntityInitialized = true
            }
            return tileEntity
        }

    fun getOffsetState(face: Direction): BlockState {
        if (pos is BlockPos.Mutable) {
            (pos as BlockPos.Mutable).setOffset(face)
            val blockState = world!!.getBlockState(pos)
            (pos as BlockPos.Mutable).setOffset(face.opposite)
            return blockState
        }
        return world!!.getBlockState(pos!!.offset(face))
    }

    companion object {
        fun wrap(predicate: Predicate<BlockWorldState?>): IPatternCenterPredicate {
            return IPatternCenterPredicate { predicate.test(it) }
        }
    }
}
