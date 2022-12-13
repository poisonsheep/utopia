package io.github.poisonsheep.utopia.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;

public class DragonBlock extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("dragon", 0, 1);

    public DragonBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().sound(SoundType.WET_GRASS).requiresCorrectToolForDrops().strength(0.2F).friction(0.9F));
        this.registerDefaultState(this.defaultBlockState().setValue(STATE, 0));
    }


    //添加物体的状态state
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState>builder){
        builder.add(STATE);
    }
}
