package io.github.poisonsheep.utopia.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.lwjgl.system.CallbackI;

public class DominatorBlock extends Block {
//    private static final VoxelShape base = Block.box(0D,0D,7D,2D,4D,2D);
//    private static final VoxelShape top = Block.box(0D,4D,5D,16D,6D,6D);

     private static VoxelShape top= Block.box(0, 4, 5, 16, 10, 11);
     private static VoxelShape base = Block.box(0,0,7,2,4,9);




    public DominatorBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).noOcclusion());
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context){
        return Shapes.or(top,base);
    }
}
