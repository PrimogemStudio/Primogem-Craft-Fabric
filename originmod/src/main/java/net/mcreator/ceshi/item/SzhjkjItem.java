
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

import net.mcreator.ceshi.procedures.SzkjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public abstract class SzhjkjItem extends ArmorItem {
	public SzhjkjItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 203;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 7, 8, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.SHENGZHANGDUANPIAN.get()), new ItemStack(Items.NETHERITE_INGOT));
			}

			@Override
			public String getName() {
				return "szhjkj";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SzhjkjItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7d[2]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u63D0\u4F9B\u9971\u548C\u6548\u679C"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u751F\u547D\u503C\u4E0A\u9650\u5927\u5E45\u63D0\u5347"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/szhjt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SzkjsxProcedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends SzhjkjItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7d[2]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u63D0\u4F9B\u9971\u548C\u6548\u679C"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u751F\u547D\u503C\u4E0A\u9650\u5927\u5E45\u63D0\u5347"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/szhjt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SzkjsxProcedure.execute(entity, itemstack);
		}
	}

	public static class Leggings extends SzhjkjItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7d[2]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u63D0\u4F9B\u9971\u548C\u6548\u679C"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u751F\u547D\u503C\u4E0A\u9650\u5927\u5E45\u63D0\u5347"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/szhjt__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SzkjsxProcedure.execute(entity, itemstack);
		}
	}

	public static class Boots extends SzhjkjItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7d[2]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u95F4\u6B47\u6027\u63D0\u4F9B\u9971\u548C\u6548\u679C"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u751F\u547D\u503C\u4E0A\u9650\u5927\u5E45\u63D0\u5347"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/szhjt__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SzkjsxProcedure.execute(entity, itemstack);
		}
	}
}
