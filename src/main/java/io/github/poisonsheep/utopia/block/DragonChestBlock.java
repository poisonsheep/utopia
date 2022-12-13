package io.github.poisonsheep.utopia.block;

import io.github.poisonsheep.utopia.tileentity.AllTileEntityRegistries;
import io.github.poisonsheep.utopia.tileentity.DragonChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class DragonChestBlock extends BaseEntityBlock {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public static final DirectionProperty FACE = HorizontalDirectionalBlock.FACING;

    public DragonChestBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD).dynamicShape().sound(SoundType.WOOD).requiresCorrectToolForDrops().noOcclusion().strength(0.4F));
        this.registerDefaultState(this.stateDefinition.any().setValue(OPEN, false).setValue(FACE,Direction.NORTH));
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DragonChestBlockEntity(pos, state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {

        builder.add(OPEN, FACE);
    }

    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, AllTileEntityRegistries.DRAGON_CHEST_BLOCK.get(), DragonChestBlockEntity::commonTick);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACE, context.getHorizontalDirection());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACE, rot.rotate(state.getValue(FACE)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACE)));
    }

}

