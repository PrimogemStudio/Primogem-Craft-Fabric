package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class SuijiqiwuguishuxingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double b = 0;
		double c = 0;
		if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())
				&& !((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())
				&& !((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			ShijianguanbiProcedure.execute(entity);
		} else {
			if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) >= 16) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(3)).remove(16);
					_player.containerMenu.broadcastChanges();
				}
				a = Mth.nextInt(new Random(), 0, 2);
				if (Math.random() < 0.3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.YIYINHEDALETOU.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) a)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.WANSHINANG.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) a)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.XIANGDANGANLAO.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) a)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				b = Mth.nextInt(new Random(), 0, 2);
				if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
						.asItem())) {
					b = Mth.nextInt(new Random(), 0, 2);
					if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
							.asItem())) {
						b = Mth.nextInt(new Random(), 0, 2);
						if (!((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) b)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
								.asItem())) {
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
						} else {
							b = b;
						}
					} else {
						b = b;
					}
				} else {
					b = b;
				}
				if (Math.random() < 0.3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.WAWANXIANGWUCHANGTOU.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) b)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.FENLIEJINBI.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) b)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.FULINJIAO.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) b)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
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
				if (Math.random() < 0.3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PrimogemcraftModItems.CEBUZHUNXIA.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) c)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.YIYIMUGUOSHI.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) c)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.SSANBAMIANTOU.get());
							_setstack.setCount(1);
							((Slot) _slots.get((int) c)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}
}
