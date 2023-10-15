package net.mcreator.ceshi.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class Suijidaima_shijianProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double b = 0;
		double c = 0;
		if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
						? ((Slot) _slt.get(Mth.nextInt(new Random(), 0, 2))).getItem()
						: ItemStack.EMPTY);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(3)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				a = Mth.nextInt(new Random(), 0, 2);
				if (Math.random() < 0.5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.JINGQUEYOUYADAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) a)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.LUANQIBAZAODEDAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) a)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				b = Mth.nextInt(new Random(), 0, 2);
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					b = b;
				} else {
					b = Mth.nextInt(new Random(), 0, 2);
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
							.asItem()) {
						b = b;
					} else {
						b = Mth.nextInt(new Random(), 0, 2);
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
								.asItem()) {
							b = b;
						} else {
							if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
									.asItem()) {
								b = 0;
							} else {
								if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
										.asItem()) {
									b = 1;
								} else {
									b = 2;
								}
							}
						}
					}
				}
				if (Math.random() < 0.5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.YOUDIANQIQIAODEDAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) b)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.WUXIANDIGUIDEDAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) b)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					c = 0;
				} else {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						c = 1;
					} else {
						c = 2;
					}
				}
				if (Math.random() < 0.5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.MEIYOUZHUSHIDAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) c)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.ZHONGGUIZHONGJUDEDAIMA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) c)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}
}
