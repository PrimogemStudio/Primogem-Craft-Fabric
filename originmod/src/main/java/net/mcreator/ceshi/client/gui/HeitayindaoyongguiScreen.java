
package net.mcreator.ceshi.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.ceshi.world.inventory.HeitayindaoyongguiMenu;
import net.mcreator.ceshi.network.HeitayindaoyongguiButtonMessage;
import net.mcreator.ceshi.PrimogemcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class HeitayindaoyongguiScreen extends AbstractContainerScreen<HeitayindaoyongguiMenu> {
	private final static HashMap<String, Object> guistate = HeitayindaoyongguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_heitaanniu;
	ImageButton imagebutton_heitaanniu1;
	ImageButton imagebutton_heitaanniu2;

	public HeitayindaoyongguiScreen(HeitayindaoyongguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("primogemcraft:textures/screens/heitayindaoyonggui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.primogemcraft.heitayindaoyonggui.label_xiao_hao_1_ge_sui_ji_cuo_wu_dai_ma_zhuang_zhi_xuan_ze_1"), 15, 16, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.primogemcraft.heitayindaoyonggui.label_xiao_hao_16_ge_yu_zhou_sui_pian_huo_de_ge_sui_ji_qi_wu"), 15, 61, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.primogemcraft.heitayindaoyonggui.label_xiao_hao_da_liang_yu_zhou_sui_pian_wei_gong_ju_huo_kui_jia_gai_lu_tian"), 15, 106, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.primogemcraft.heitayindaoyonggui.label_ge_cuo_wu_dai_ma"), 15, 25, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.primogemcraft.heitayindaoyonggui.label_jia_bao_cang_fu_mo"), 15, 115, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_heitaanniu = new ImageButton(this.leftPos + 96, this.topPos + 34, 56, 20, 0, 0, 20, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heitaanniu.png"), 56, 40, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new HeitayindaoyongguiButtonMessage(0, x, y, z));
				HeitayindaoyongguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heitaanniu", imagebutton_heitaanniu);
		this.addRenderableWidget(imagebutton_heitaanniu);
		imagebutton_heitaanniu1 = new ImageButton(this.leftPos + 96, this.topPos + 79, 56, 20, 0, 0, 20, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heitaanniu1.png"), 56, 40, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new HeitayindaoyongguiButtonMessage(1, x, y, z));
				HeitayindaoyongguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heitaanniu1", imagebutton_heitaanniu1);
		this.addRenderableWidget(imagebutton_heitaanniu1);
		imagebutton_heitaanniu2 = new ImageButton(this.leftPos + 96, this.topPos + 124, 56, 20, 0, 0, 20, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heitaanniu2.png"), 56, 40, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new HeitayindaoyongguiButtonMessage(2, x, y, z));
				HeitayindaoyongguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heitaanniu2", imagebutton_heitaanniu2);
		this.addRenderableWidget(imagebutton_heitaanniu2);
	}
}
