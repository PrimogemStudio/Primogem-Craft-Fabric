
package net.mcreator.ceshi.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Axtsx4Procedure;
import net.mcreator.ceshi.procedures.Axtsx3Procedure;
import net.mcreator.ceshi.procedures.Axtsx2Procedure;
import net.mcreator.ceshi.procedures.Axtsx1Procedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public abstract class AxttItem extends ArmorItem {
	public AxttItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 5, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.AIXUBINGYUSUIXIE.get()), new ItemStack(Items.IRON_INGOT));
			}

			@Override
			public String getName() {
				return "axtt";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AxttItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A79\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7b[0.5]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u624B\u6301\u9539\u7C7B\u5DE5\u5177\u65F6\uFF1A"));
			list.add(new TextComponent("\u00A7b \u2022 \u00A774\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u6062\u590D\u5C11\u91CF\u751F\u547D\u503C"));
			list.add(new TextComponent("\u00A7c \u2022 \u00A772\u5957\u88C5\uFF1A\u906D\u9047\u706B\u7130\u6216\u5CA9\u6D46\u65F6\u63D0\u4F9B\u77ED\u65F6\u95F4\u98DE\u884C\u80FD\u529B"));
			list.add(new TextComponent("\u00A74 - \u00A7c\u4E0D\u6EE1\u8DB3\u6761\u4EF6\u65F6\u5C06\u53D6\u6D88\u589E\u76CA"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u54C0\u53D9\u51B0\u7389\u76D4\u7532\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/axtt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Axtsx1Procedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends AxttItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A79\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7b[0.5]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u624B\u6301\u9550\u7C7B\u5DE5\u5177\u65F6\uFF1A"));
			list.add(new TextComponent("\u00A7e \u2022 \u00A772\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u63D0\u4F9B\u5C11\u91CF\u4F24\u5BB3\u5438\u6536"));
			list.add(new TextComponent("\u00A7a \u2022 \u00A772\u5957\u88C5\uFF1A\u63D0\u5347\u5C11\u91CF\u751F\u547D\u503C\u4E0A\u9650"));
			list.add(new TextComponent("\u00A74 - \u00A7c\u4E0D\u6EE1\u8DB3\u6761\u4EF6\u65F6\u5C06\u53D6\u6D88\u90E8\u5206\u589E\u76CA"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u54C0\u53D9\u51B0\u7389\u76D4\u7532\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/axtt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Axtsx2Procedure.execute(entity, itemstack);
		}
	}

	public static class Leggings extends AxttItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A79\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7b[0.5]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u624B\u6301\u5251\u7C7B\u5DE5\u5177\u65F6\uFF1A"));
			list.add(new TextComponent("\u00A7d \u2022 \u00A772\u5957\u88C5\uFF1A\u96E8\u6216\u96F7\u96E8\u5929\u83B7\u5F97\u5C11\u91CF\u529B\u91CF\u548C\u901F\u5EA6\u7684\u589E\u76CA"));
			list.add(new TextComponent("\u00A7f \u2022 \u00A772\u00A7kbuzhidaoxiesha"));
			list.add(new TextComponent("\u00A74 - \u00A7c\u4E0D\u6EE1\u8DB3\u6761\u4EF6\u65F6\u5C06\u53D6\u6D88\u90E8\u5206\u589E\u76CA"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u54C0\u53D9\u51B0\u7389\u76D4\u7532\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/axtt__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Axtsx3Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		}
	}

	public static class Boots extends AxttItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A79\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7b[0.5]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u624B\u6301\u65A7\u7C7B\u5DE5\u5177\u65F6\uFF1A"));
			list.add(new TextComponent("\u00A7b \u2022 \u00A772\u5957\u88C5\uFF1A\u514D\u75AB\u7F13\u6162\u6548\u679C"));
			list.add(new TextComponent("\u00A7a \u2022 \u00A772\u5957\u88C5\uFF1A\u83B7\u5F97\u8DF3\u8DC3\u63D0\u5347\u589E\u76CA"));
			list.add(new TextComponent("\u00A74 - \u00A7c\u4E0D\u6EE1\u8DB3\u6761\u4EF6\u65F6\u5C06\u53D6\u6D88\u90E8\u5206\u589E\u76CA"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u54C0\u53D9\u51B0\u7389\u76D4\u7532\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/axtt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Axtsx4Procedure.execute(entity, itemstack);
		}
	}
}
