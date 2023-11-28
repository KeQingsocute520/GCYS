package gregicality.science.common.metatileentities.dev;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.ColourMultiplier;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.util.GTUtility;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;

//public class MetaTileEntityDebugStructureWriter extends TieredMetaTileEntity implements {

    //private static final HashMap<MetaTileEntityDebugStructureWriter, BoundHighliter> bondingBoxes = new HashMap<>(1);
    //private final BoundHighliter boundingBox = new BoundHighliter();
    //private final short[] numbers = new short[6];

    //private boolean transpose = false;
    //private boolean showHighlightBox = true;
    //private String[] result = new String[] { "Undefined" };

    //public MetaTileEntityDebugStructureWriter(ResourceLocation metaTileEntityId, int tier) {
      //  super(metaTileEntityId, tier);
    //}

    //@Override
    //public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
      //  return new MetaTileEntityDebugStructureWriter(metaTileEntityId, getTier());
    //}

   // @Override
   // @SideOnly(Side.CLIENT)
   // public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
   //     super.renderMetaTileEntity(renderState, translation, pipeline);
   //     ColourMultiplier multiplier = new ColourMultiplier(GTUtility.convertRGBtoOpaqueRGBA_CL(getPaintingColorForRendering()));
  //      IVertexOperation[] coloredPipeline = ArrayUtils.add(pipeline, multiplier);
   // }

  //  @Override
  //  public void update() {
  //      super.update();
  //      if (aMetaT)
  //  }

//}
