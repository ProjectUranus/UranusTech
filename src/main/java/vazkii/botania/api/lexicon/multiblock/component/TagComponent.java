/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jun 27, 2015, 7:20:09 PM (GMT)]
 */
package vazkii.botania.api.lexicon.multiblock.component;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class TagComponent extends MultiblockComponent {

	private final Tag<Block> tag;
	private final Random random = new Random();

	public TagComponent(BlockPos relPos, Block block, Tag<Block> tag) {
		super(relPos, block.getDefaultState());
		this.tag = tag;
	}

	@Override
	public BlockState getBlockState() {
		if (tag.values().isEmpty()) {
			return super.getBlockState();
		} else {
			return tag.getRandom(random).getDefaultState();
		}
	}

	@Override
	public boolean matches(World world, BlockPos pos) {
		return tag.contains(world.getBlockState(pos).getBlock());
	}

	@Override
	public MultiblockComponent copy() {
		return new TagComponent(getRelativePosition(), getBlockState().getBlock(), tag);
	}

}
