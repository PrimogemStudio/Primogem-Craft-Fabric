package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class GUIwupxianzhiProcedure {
	public static ItemStack execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return ItemStack.EMPTY;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "kill");
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("\u00A7c\u8017\u5B50\u5C3E\u6C41"), (false));
		(itemstack).shrink(64);
		return itemstack;
	}
}
