
package net.mcreator.ceshi.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.procedures.Ddaizi_yinpinProcedure;
import net.mcreator.ceshi.procedures.Daizi_guanbiProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class YibangrenzhinangguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public YibangrenzhinangguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(PrimogemcraftModMenus.YIBANGRENZHINANGGUI, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(143);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 9, 20) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 27, 20) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 45, 20) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 63, 20) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 81, 20) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 99, 20) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 117, 20) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 135, 20) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 153, 20) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 171, 20) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 189, 20) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 207, 20) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 225, 20) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 243, 20) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 261, 20) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 279, 20) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 297, 20) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 9, 38) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 27, 38) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 45, 38) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 63, 38) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 81, 38) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 99, 38) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 117, 38) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 135, 38) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 153, 38) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 171, 38) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 189, 38) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 207, 38) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 225, 38) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 243, 38) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 261, 38) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 279, 38) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 297, 38) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 9, 56) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 27, 56) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 45, 56) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 63, 56) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 81, 56) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 99, 56) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 117, 56) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 135, 56) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 153, 56) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 171, 56) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 189, 56) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 207, 56) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 225, 56) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 243, 56) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 261, 56) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 279, 56) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 297, 56) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 9, 74) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 27, 74) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 45, 74) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 63, 74) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 81, 74) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 99, 74) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 117, 74) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 135, 74) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 153, 74) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 171, 74) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 189, 74) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 207, 74) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 225, 74) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 243, 74) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 261, 74) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 279, 74) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 297, 74) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 9, 92) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 27, 92) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 45, 92) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 63, 92) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 81, 92) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 99, 92) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 117, 92) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 135, 92) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 153, 92) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 171, 92) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 189, 92) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 207, 92) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 225, 92) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 243, 92) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 261, 92) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 279, 92) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 297, 92) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 9, 110) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 27, 110) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 45, 110) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 63, 110) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 81, 110) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 99, 110) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 117, 110) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 135, 110) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 153, 110) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 171, 110) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 189, 110) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 207, 110) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 225, 110) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 243, 110) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 261, 110) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 279, 110) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 297, 110) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 9, 128) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 27, 128) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 45, 128) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 63, 128) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 81, 128) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 99, 128) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 117, 128) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 135, 128) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 153, 128) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 171, 128) {
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 189, 128) {
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 207, 128) {
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 225, 128) {
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 243, 128) {
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 261, 128) {
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 279, 128) {
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 297, 128) {
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 9, 151) {
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 27, 151) {
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 45, 151) {
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 9, 169) {
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 27, 169) {
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 45, 169) {
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 9, 187) {
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 27, 187) {
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 45, 187) {
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 9, 205) {
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 27, 205) {
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 45, 205) {
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 261, 151) {
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 279, 151) {
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 297, 151) {
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 261, 169) {
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 279, 169) {
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 297, 169) {
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 261, 187) {
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 279, 187) {
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 297, 187) {
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 261, 205) {
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 279, 205) {
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 297, 205) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 74 + 8 + sj * 18, 73 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 74 + 8 + si * 18, 73 + 142));

		Ddaizi_yinpinProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 143) {
				if (!this.moveItemStackTo(itemstack1, 143, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 143, false)) {
				if (index < 143 + 27) {
					if (!this.moveItemStackTo(itemstack1, 143 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 143, 143 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);

		Daizi_guanbiProcedure.execute(world, x, y, z);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
