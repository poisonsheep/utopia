package io.github.poisonsheep.utopia.tileentity;


import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

public class DragonChestBlockEntity extends BlockEntity {

    public int ticksExisted;

    public DragonChestBlockEntity(BlockPos pos, BlockState state) {
        super(AllTileEntityRegistries.DRAGON_CHEST_BLOCK.get(), pos, state);
    }


    //存储数据用
    @Override
    public void saveAdditional(CompoundTag tag){
        super.saveAdditional(tag);
    }
    @Override
    public void load(CompoundTag tag){
        super.saveAdditional(tag);
    }

    public static void commonTick(Level level,BlockPos pos,BlockState state,DragonChestBlockEntity entity){
        entity.tick();
    }
    public void tick() {
        //判断是否在服务端
        if(!level.isClientSide&&ticksExisted%5==0){
            float i = this.getBlockPos().getX();
            float j = this.getBlockPos().getY();
            float k = this.getBlockPos().getZ();

            //for(循环变量类型 循环变量名称:要被遍历的对象)循环体
            for (LivingEntity entity :level.getEntitiesOfClass(LivingEntity.class,new AABB((double)i-10F,(double)j-10F,(double)k-10F,(double)i+10.0F,(double)j+10.0F,(double)k+10.0F))){
                entity.hurt(DamageSource.OUT_OF_WORLD,5);
            }
        }
        ticksExisted++;
    }



}

