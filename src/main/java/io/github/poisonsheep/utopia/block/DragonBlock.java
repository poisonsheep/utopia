package io.github.poisonsheep.utopia.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DragonBlock extends Block {
    public DragonBlock(){
        super(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().sound(SoundType.WET_GRASS).noCollission().requiresCorrectToolForDrops().strength(0.2F).friction(0.9F));
    }

}
