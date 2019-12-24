/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jun 27, 2015, 2:42:32 PM (GMT)]
 */
package vazkii.botania.api.lexicon.multiblock.component;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A component of a multiblock, the normal one
 * is just a block.
 */
public class MultiblockComponent {

	protected BlockPos relPos;
	protected final BlockState state;
	protected final BlockEntity tileEntity;
	private final boolean doFancyRender;

	public MultiblockComponent(BlockPos relPos, BlockState state) {
		this(relPos, state, null);
	}

	public MultiblockComponent(BlockPos relPos, BlockState state, boolean doFancyRender) {
		this(relPos, state, doFancyRender, null);
	}

	public MultiblockComponent(BlockPos relPos, BlockState state, BlockEntity tileEntity) {
		this(relPos, state, state.getBlock().hasBlockEntity() == (tileEntity != null), tileEntity);
	}

	public MultiblockComponent(BlockPos relPos, BlockState state, boolean doFancyRender, BlockEntity tileEntity) {
		this.relPos = relPos;
		this.state = state;
		this.tileEntity = tileEntity;
		this.doFancyRender = doFancyRender;
	}

	public BlockPos getRelativePosition() {
		return relPos;
	}

	public BlockState getBlockState() {
		return state;
	}

	public boolean matches(World world, BlockPos pos) {
		return world.getBlockState(pos) == state;
	}

	public ItemStack[] getMaterials() {
		return new ItemStack[] { new ItemStack(state.getBlock()) };
	}

	public void rotate(double angle) {
		double x = relPos.getX();
		double z = relPos.getZ();
		double sin = Math.sin(angle);
		double cos = Math.cos(angle);

		double xn = x * cos - z * sin;
		double zn = x * sin + z * cos;
		relPos = new BlockPos((int) Math.round(xn), relPos.getY(), (int) Math.round(zn));
	}

	public MultiblockComponent copy() {
		return new MultiblockComponent(relPos, state, tileEntity);
	}

	public BlockEntity getBlockEntity() {
		return tileEntity;
	}

	@Environment(EnvType.CLIENT)
	public boolean shouldDoFancyRender() {
		return doFancyRender;
	}

}
