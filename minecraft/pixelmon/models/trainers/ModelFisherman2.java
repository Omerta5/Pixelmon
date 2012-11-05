// Date: 05/11/2012 18:30:30
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.models.trainers;

import javax.swing.Box;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelFisherman2 extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer leftarm;
    ModelRenderer Mouth;
    ModelRenderer Mouth_2;
    ModelRenderer HeadBase;
    ModelRenderer Piece1;
    ModelRenderer head;
    ModelRenderer Hat;
    ModelRenderer HatTip;
    ModelRenderer HatTop;
    ModelRenderer Handle_Back;
    ModelRenderer Handle_Front;
    ModelRenderer Lid;
    ModelRenderer Fishing_Box_Handle_Top;
    ModelRenderer Box;
  
  public ModelFisherman2()
  {
    textureWidth = 64;
    textureHeight = 64;
    setTextureOffset("HeadBase.Folder1", 0, 0);
    setTextureOffset("Piece1.Folder1", 0, 0);
    
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, -3F, -2F, 7, 12, 3);
      body.setRotationPoint(0F, 3F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm.mirror = true;
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-2F, -2F, -1F, 2, 11, 2);
      rightarm.setRotationPoint(-4F, 2F, -0.5F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.074351F);
      rightarm.mirror = false;
      leftleg.mirror = true;
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 3, 12, 3);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftleg.mirror = false;
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 3, 12, 3);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(0F, -2F, -1F, 2, 11, 2);
      leftarm.setRotationPoint(3F, 2F, -1F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.1487144F);
      Mouth = new ModelRenderer(this, 20, 0);
      Mouth.addBox(-2F, 0F, 0F, 1, 1, 0);
      Mouth.setRotationPoint(1F, -3F, -3.1F);
      Mouth.setTextureSize(64, 64);
      Mouth.mirror = true;
      setRotation(Mouth, 0F, 0F, -0.6320361F);
      Mouth_2 = new ModelRenderer(this, 20, 0);
      Mouth_2.addBox(-1F, 0F, 1F, 2, 1, 0);
      Mouth_2.setRotationPoint(-1F, -2F, -4.1F);
      Mouth_2.setTextureSize(64, 64);
      Mouth_2.mirror = true;
      setRotation(Mouth_2, 0F, 0F, 0F);
    HeadBase = new ModelRenderer(this, "HeadBase");
    HeadBase.setRotationPoint(-0.5F, 0F, 0F);
    setRotation(HeadBase, 0F, 0F, 0F);
    HeadBase.mirror = true;
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Hat = new ModelRenderer(this, 40, 0);
      Hat.addBox(-2F, 0F, -4F, 7, 0, 7);
      Hat.setRotationPoint(-1.5F, -5F, 0F);
      Hat.setTextureSize(64, 64);
      Hat.mirror = true;
      setRotation(Hat, 0F, 0F, 0F);
      HatTop = new ModelRenderer(this, 44, 8);
      HatTop.addBox(-2F, -1F, -2F, 5, 2, 5);
      HatTop.setRotationPoint(-0.5F, -6F, -1F);
      HatTop.setTextureSize(64, 64);
      HatTop.mirror = true;
      setRotation(HatTop, 0F, 0F, 0F);
      HatTip = new ModelRenderer(this, 26, 0);
      HatTip.addBox(-1F, 0F, 0F, 3, 1, 3);
      HatTip.setRotationPoint(-0.5F, -8F, -2F);
      HatTip.setTextureSize(64, 64);
      HatTip.mirror = true;
      setRotation(HatTip, 0F, 0F, 0F);
    Piece1 = new ModelRenderer(this, "Piece1");
    Piece1.setRotationPoint(4F, 2F, 0F);
    setRotation(Piece1, 0F, 0F, 0F);
    Piece1.mirror = true;
      Handle_Back = new ModelRenderer(this, 0, 12);
      Handle_Back.addBox(0F, 0F, 0F, 1, 2, 1);
      Handle_Back.setRotationPoint(1F, 8F, 1F);
      Handle_Back.setTextureSize(64, 64);
      Handle_Back.mirror = true;
      setRotation(Handle_Back, 0F, 0F, 0F);
      Handle_Front = new ModelRenderer(this, 0, 12);
      Handle_Front.addBox(0F, 0F, 0F, 1, 2, 1);
      Handle_Front.setRotationPoint(1F, 8F, -4F);
      Handle_Front.setTextureSize(64, 64);
      Handle_Front.mirror = true;
      setRotation(Handle_Front, 0F, 0F, 0F);
      Box = new ModelRenderer(this, 0, 32);
      Box.addBox(-1F, 0F, -5F, 3, 3, 10);
      Box.setRotationPoint(1F, 11F, -1F);
      Box.setTextureSize(64, 64);
      Box.mirror = true;
      setRotation(Box, 0F, 0F, 0F);
      Lid = new ModelRenderer(this, 17, 4);
      Lid.addBox(-1F, 0F, -5F, 3, 1, 10);
      Lid.setRotationPoint(1F, 10F, -1F);
      Lid.setTextureSize(64, 64);
      Lid.mirror = true;
      setRotation(Lid, 0F, 0F, 0F);
      Fishing_Box_Handle_Top = new ModelRenderer(this, 50, 25);
      Fishing_Box_Handle_Top.addBox(0F, 0F, -3F, 1, 1, 6);
      Fishing_Box_Handle_Top.setRotationPoint(1F, 8F, -1F);
      Fishing_Box_Handle_Top.setTextureSize(64, 64);
      Fishing_Box_Handle_Top.mirror = true;
      setRotation(Fishing_Box_Handle_Top, 0F, 0F, 0F);
      
      HeadBase.addChild(head);
      HeadBase.addChild(Hat);
      HeadBase.addChild(HatTop);
      HeadBase.addChild(HatTip);
      
      Piece1.addChild(Handle_Front);
      Piece1.addChild(Handle_Back);
      Piece1.addChild(Box);
      Piece1.addChild(Lid);
      Piece1.addChild(Fishing_Box_Handle_Top);
      Piece1.addChild(leftarm);  
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    rightarm.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    leftarm.render(f5);
    Mouth.render(f5);
    Mouth_2.render(f5);
    HeadBase.render(f5);
    Piece1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {

  }

}
