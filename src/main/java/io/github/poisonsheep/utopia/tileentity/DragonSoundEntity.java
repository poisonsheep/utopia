package io.github.poisonsheep.utopia.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DragonSoundEntity extends BlockEntity {

    public DragonSoundEntity( BlockPos pos, BlockState state) {
        super(AllTileEntityRegistries.DRAGON_SOUND_ENTITY.get(),pos,state);
    }

    public static void commonTick(Level level, BlockPos pos,BlockState state, DragonSoundEntity entity){
        entity.tick();
    }

    public void tick(){

    }
    @Override
    public void saveAdditional(CompoundTag tag){

    }
    public void load(CompoundTag tag){

    }

}



