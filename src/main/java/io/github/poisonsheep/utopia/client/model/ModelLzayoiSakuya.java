package io.github.poisonsheep.utopia.client.model;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.entity.LzayoiSakuyaEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import javax.swing.text.html.parser.Entity;

public class ModelLzayoiSakuya<T extends LzayoiSakuyaEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LZAYOISAKUYA_LAYER = new ModelLayerLocation(new ResourceLocation(Utopia.MODID, "lzayoisakuya"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone9;
	private final ModelPart bone7;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone4;
	private final ModelPart bone17;
	private final ModelPart bone15;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone22;
	private final ModelPart bone5;
	private final ModelPart bone13;
	private final ModelPart bone8;

	public ModelLzayoiSakuya(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone6 = root.getChild("bone6");
		this.bone9 = root.getChild("bone9");
		this.bone7 = root.getChild("bone7");
		this.bone10 = root.getChild("bone10");
		this.bone11 = root.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.bone4 = root.getChild("bone4");
		this.bone17 = root.getChild("bone17");
		this.bone15 = root.getChild("bone15");
		this.bone18 = root.getChild("bone18");
		this.bone19 = root.getChild("bone19");
		this.bone20 = root.getChild("bone20");
		this.bone22 = root.getChild("bone22");
		this.bone5 = root.getChild("bone5");
		this.bone13 = root.getChild("bone13");
		this.bone8 = root.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6298F, -0.4677F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone23 = bone.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(0.6544F, -4.2171F, -1.0F));

		PartDefinition cube_r2 = bone23.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, -0.115F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0456F, 0.1021F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bone24 = bone.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1F));

		PartDefinition cube_r3 = bone24.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.115F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -4.115F, -0.9F, 0.0F, 0.0F, -0.0436F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.1F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.15F, -0.45F, -0.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0477F, -3.7483F, -1.0511F, 1.7453F, 1.1345F, 1.5708F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.5646F, -0.5555F, 0.6057F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.1F, -2.7346F, 0.7082F, -2.8682F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.2F, 23.9F, 0.1F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.3768F, 0.0814F, 1.1979F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.1323F, -0.1F, 2.6106F, 0.9089F, 2.137F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0363F, -0.117F, 0.9346F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.1323F, -0.1F, -2.9559F, 0.9187F, 2.637F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3732F, 19.3962F, -1.497F, 0.2291F, 1.251F, -0.7403F));

		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(1.5539F, 0.0171F, 0.1782F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4922F, -0.2955F, 0.114F, -1.4743F, 1.19F, -1.65F));

		PartDefinition cube_r9 = bone6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(1.2332F, 0.4135F, 0.0782F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.1332F, -0.2865F, -0.0218F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4922F, -0.2955F, 0.114F, -1.5301F, 0.4931F, -1.7204F));

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 24.1F, 0.0F));

		PartDefinition cube_r10 = bone9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(0.8F, -1.5677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.6F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.4F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.2F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.6F, -1.6677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.8F, -1.5677F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone9.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0702F, -1.7412F, 0.3402F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, 0.5236F));

		PartDefinition cube_r12 = bone9.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7172F, -1.6705F, 0.0702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5172F, -1.6705F, 0.0702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, -3.1416F, 0.0F, -2.7925F));

		PartDefinition cube_r13 = bone9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(0.2702F, -1.6705F, 0.5172F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition cube_r14 = bone9.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(0.0702F, -1.6546F, 0.6073F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, 0.1047F));

		PartDefinition cube_r15 = bone9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5172F, -1.6705F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7172F, -1.6705F, -0.2702F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r16 = bone9.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(0.0702F, -1.6705F, -0.7172F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition cube_r17 = bone9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0702F, -1.5677F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0702F, -1.6677F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0702F, -1.6677F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0702F, -1.6677F, 0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2702F, -1.5677F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2702F, -1.6677F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2702F, -1.6677F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2702F, -1.6677F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r18 = bone9.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(0.2702F, -1.7412F, -0.6402F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, -0.5236F));

		PartDefinition cube_r19 = bone9.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(0.2702F, -1.6546F, -0.9073F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3323F, 0.0F, 0.0F, 1.5708F, -0.1047F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7437F, 20.0682F, 0.0048F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5298F, -1.7014F, 0.6451F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0702F, -1.7014F, 0.6451F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8437F, -0.596F, 0.0736F, -2.4435F, 1.4399F, -1.5708F));

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1278F, 18.6865F, 0.0177F, 0.1719F, 0.0302F, -0.1719F));

		PartDefinition cube_r21 = bone10.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(0.086F, -0.8219F, -2.1311F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.014F, -2.2577F, -0.5326F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1047F, 0.7473F, -0.1531F, -1.9622F, 1.2231F, -1.4849F));

		PartDefinition cube_r22 = bone10.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.014F, -2.4391F, -0.7774F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.014F, -1.1634F, 1.3573F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1047F, 0.7473F, -0.1531F, -1.0459F, 1.2231F, -1.4849F));

		PartDefinition cube_r23 = bone10.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-0.014F, -2.3507F, -0.8171F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1047F, 0.7473F, -0.1531F, -1.4822F, 1.2231F, -1.4849F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r24 = bone11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(0.2702F, 1.9323F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.4702F, 1.8323F, 1.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r25 = bone11.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(0.0079F, 0.3702F, 1.4427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4921F, 0.3702F, 1.9427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.9921F, 0.3702F, 2.4427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, -1.5708F, 0.0F, -0.7854F));

		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-1.3876F, 20.5136F, -0.5202F));

		PartDefinition cube_r26 = bone12.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(0.2702F, 1.9323F, -1.55F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.4702F, 1.8323F, -1.75F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3876F, -0.7459F, 0.5202F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r27 = bone12.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(0.0079F, 0.3702F, -1.9427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4921F, 0.3702F, -2.4427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.9921F, 0.3702F, -2.9427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3876F, -0.7459F, 0.5202F, -1.5708F, 0.0F, -2.3562F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.2F, 23.9F, -0.1F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(0.3768F, 0.0814F, -1.5979F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.1323F, 0.1F, 0.531F, 0.9089F, 1.0046F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(0.0363F, -0.117F, -1.5346F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.1323F, 0.1F, -0.1857F, 0.9187F, 0.5045F));

		PartDefinition bone17 = partdefinition.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1298F, -2.8F, 0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -2.8F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4F, -2.6F, -0.4F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r30 = bone17.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, -0.2F, -0.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2732F, -2.7966F, 0.0492F, 1.557F, 0.0123F, -1.5341F));

		PartDefinition cube_r31 = bone17.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.2F, -0.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2732F, -2.7966F, 0.0492F, 1.557F, -0.0123F, 1.5341F));

		PartDefinition cube_r32 = bone17.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-0.15F, -0.25F, 0.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1347F, -2.5684F, -0.3165F, 2.0769F, 0.22F, -1.0539F));

		PartDefinition cube_r33 = bone17.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-0.15F, -0.25F, 0.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1347F, -2.5684F, -0.3165F, 2.0769F, -0.22F, 1.0539F));

		PartDefinition cube_r34 = bone17.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0805F, -2.0414F, -0.578F, -2.364F, -1.1926F, 1.9805F));

		PartDefinition cube_r35 = bone17.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-0.32F, -0.2F, -0.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.3F, -0.3202F, 0.0F, -1.1345F, 0.0F));

		PartDefinition cube_r36 = bone17.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.3913F, -0.4496F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0202F, -2.0F, -0.25F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone17.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(0.0902F, -0.3F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0702F, -1.9F, -0.4804F, -2.3204F, 1.1926F, -1.9805F));

		PartDefinition cube_r38 = bone17.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(0.22F, -0.2F, -0.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -2.3F, -0.3202F, 0.0F, 1.1345F, 0.0F));

		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1717F, -0.05F, -0.3F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0717F, 0.05F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0083F, -0.25F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0917F, -0.25F, -0.3F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0917F, -0.25F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0083F, -0.25F, 0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0917F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0217F, 0.35F, -0.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5419F, 21.35F, 0.0F));

		PartDefinition cube_r39 = bone15.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.05F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.25F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.35F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0717F, -0.15F, 0.15F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(-3.1419F, 2.55F, 0.1F));

		PartDefinition cube_r40 = bone16.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.15F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6202F, -1.95F, -0.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone16.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.05F, -0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6202F, -2.05F, -0.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone18 = partdefinition.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4F, -1.4F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -1.4F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.8F, 0.0F));

		PartDefinition bone25 = bone18.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(0, 0).addBox(-0.15F, -0.8F, -0.15F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -0.6F, -0.15F));

		PartDefinition bone26 = bone18.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(0, 0).addBox(-0.15F, -0.8F, -0.15F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -0.6F, -0.15F));

		PartDefinition bone19 = partdefinition.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r42 = bone19.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(4, 1).addBox(0.2677F, -0.9298F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(0.5677F, -0.8298F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2677F, 0.4702F, -1.3F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-1.2323F, -0.9298F, -1.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 1).addBox(-1.2323F, -0.9298F, 1.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r43 = bone19.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(4, 3).addBox(-1.1038F, -0.3694F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 2).addBox(-1.1038F, 0.3306F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition cube_r44 = bone19.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6921F, -0.8298F, 1.2427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.3921F, -0.8298F, 0.5427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, -1.5708F, 0.0F, -0.7854F));

		PartDefinition cube_r45 = bone19.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6921F, -0.8298F, -1.9427F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, -1.5708F, 0.0F, -2.3562F));

		PartDefinition cube_r46 = bone19.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4846F, -0.5007F, -1.4F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, -1.5708F, 1.1345F, -1.5708F));

		PartDefinition cube_r47 = bone19.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(4, 4).addBox(-1.3126F, -0.0607F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2323F, 0.0F, 1.5708F, 0.9599F, 1.5708F));

		PartDefinition bone20 = partdefinition.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.3F, -0.5F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.7F, -1.2F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.8F, -1.2F, -0.7F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.8F, -1.2F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.8F, -0.8F, -0.8F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.2F, -0.8F, -0.8F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.9F, -1.2F, -0.7F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -1.3F, -0.5F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -1.4F, 0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -1.1F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -0.9F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -0.7F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.6F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3F, -0.6F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.6F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1F, -0.6F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3F, -0.6F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -0.7F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -0.9F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -1.1F, -0.9F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -1.3F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -1.3F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.6F, -1.4F, -0.7F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -1.4F, -0.7F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.1F, -0.3F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.1F, -0.3F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.1F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.1F, -0.3F, 0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.2F, -0.3F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.2F, -0.3F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.2F, -0.3F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1F, -0.3F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.9F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.7F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.9F, -0.3F, -0.85F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.9F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.7F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.9F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -0.3F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.2F, -0.3F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1F, -0.3F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.2F, -0.3F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.2F, -0.3F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1F, -0.3F, 0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.8F, 0.0F));

		PartDefinition cube_r48 = bone20.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 0).addBox(1.1F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.7F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.5F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, -0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, -1.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, -1.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, -2.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -2.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -1.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -1.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.25F, -0.7F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r49 = bone20.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0).addBox(0.9F, -0.05F, 0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.7F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r50 = bone20.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, 0.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 0.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, 1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 1.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, 1.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 1.6F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.15F, -0.05F, 1.8F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 2.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.25F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r51 = bone20.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.7F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.1F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.25F, -0.7F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r52 = bone20.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -0.05F, 0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.7F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r53 = bone20.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 0).addBox(-1.15F, -0.15F, 0.0F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.85F, 0.35F, -0.3F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.15F, -0.05F, -0.2F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, -1.15F, 1.4F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r54 = bone20.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.2F, -0.85F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r55 = bone20.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(-0.45F, 0.35F, -1.6F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.55F, -0.05F, -1.5F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.65F, -0.05F, -1.5F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.75F, -0.15F, -1.3F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, -1.15F, -1.2F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, -0.2F, -0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3443F, 0.5781F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bone21.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3935F, -0.2F, -0.1585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1065F, -0.2F, -0.0585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, 0.1443F, -0.0234F, 0.0F, 0.1309F, 0.1309F));

		PartDefinition cube_r57 = bone21.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4306F, -0.2F, 0.0912F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, 0.1443F, -0.0234F, 0.0F, -0.3054F, 0.1309F));

		PartDefinition cube_r58 = bone21.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2065F, -0.2F, -0.1585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.2065F, -0.2F, -0.0585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4671F, 0.1443F, -0.0234F, 0.0F, -0.1309F, -0.1222F));

		PartDefinition cube_r59 = bone21.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3306F, 0.1F, -0.0088F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, 0.1443F, -0.0234F, -0.2194F, -0.2143F, 0.9313F));

		PartDefinition cube_r60 = bone21.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9694F, 0.1F, -0.0088F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4671F, 0.1443F, -0.0234F, -0.2194F, 0.2143F, -0.9313F));

		PartDefinition cube_r61 = bone21.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1694F, -0.2F, 0.0912F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4671F, 0.1443F, -0.0234F, 0.0F, 0.3054F, -0.1222F));

		PartDefinition cube_r62 = bone21.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2065F, -0.2F, -0.1585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.2065F, -0.2F, -0.0585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4671F, -0.1557F, -0.0234F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r63 = bone21.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1694F, -0.2F, 0.0912F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4671F, -0.1557F, -0.0234F, 0.0F, 0.3054F, 0.3054F));

		PartDefinition cube_r64 = bone21.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 0).addBox(0.1065F, -0.2F, -0.0585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3935F, -0.2F, -0.1585F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, -0.1557F, -0.0234F, 0.0F, 0.1309F, -0.3054F));

		PartDefinition cube_r65 = bone21.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4306F, -0.2F, 0.0912F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, -0.1557F, -0.0234F, 0.0F, -0.3054F, -0.3054F));

		PartDefinition bone22 = partdefinition.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.475F, 0.025F, 0.7125F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.375F, 0.125F, 2.6125F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.375F, 0.125F, 0.1125F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.175F, -0.075F, -0.1875F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.025F, 22.775F, 0.1875F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3732F, 19.3962F, -1.497F, 0.2291F, -1.251F, 0.7403F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8539F, 0.0171F, 0.1782F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4922F, -0.2955F, 0.114F, -1.4743F, -1.19F, 1.65F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5332F, 0.4135F, 0.0782F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.6332F, -0.2865F, -0.0218F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4922F, -0.2955F, 0.114F, -1.5301F, -0.4931F, 1.7204F));

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4283F, -0.05F, -0.3F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3283F, 0.05F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0083F, -0.25F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0917F, -0.25F, -0.3F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0917F, -0.25F, 0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.0083F, -0.25F, 0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0917F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.2783F, 0.35F, -0.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5419F, 21.35F, 0.0F));

		PartDefinition cube_r68 = bone13.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 0).addBox(0.05F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.05F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.25F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.35F, -0.1F, -0.01F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0717F, -0.15F, 0.15F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(3.1419F, 2.55F, 0.1F));

		PartDefinition cube_r69 = bone14.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.15F, -0.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6202F, -1.95F, -0.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone14.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.05F, -0.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6202F, -2.05F, -0.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7437F, 20.0682F, 0.0048F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone8.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 1).addBox(-0.0702F, -1.7014F, 0.6451F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.3702F, -1.7014F, 0.6451F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8437F, -0.596F, 0.0736F, -2.4435F, -1.4399F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone17.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone18.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone19.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone20.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone22.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}