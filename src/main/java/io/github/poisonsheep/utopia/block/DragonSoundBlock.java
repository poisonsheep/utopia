package io.github.poisonsheep.utopia.block;

import io.github.poisonsheep.utopia.tileentity.AllTileEntityRegistries;
import io.github.poisonsheep.utopia.tileentity.DragonChestBlockEntity;
import io.github.poisonsheep.utopia.tileentity.DragonSoundEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class DragonSoundBlock extends BaseEntityBlock {

    public DragonSoundBlock(){
        super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).noOcclusion().strength(0.8F));
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DragonChestBlockEntity(pos,state);
    }

    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type){
        return createTickerHelper(type,AllTileEntityRegistries.DRAGON_SOUND_ENTITY.get(), DragonSoundEntity::commonTick);
    }
}
