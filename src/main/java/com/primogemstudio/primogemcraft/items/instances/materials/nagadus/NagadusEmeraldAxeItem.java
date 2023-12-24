package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NagadusEmeraldAxeItem extends AxeItem {
    public NagadusEmeraldAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 10f;
            }

            public float getAttackDamageBonus() {
                return 5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.NAGADUS_EMERALD_SLIVER_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        var x = entity.getX();
        var y = entity.getY();
        var z = entity.getZ();
        if (entity.isShiftKeyDown()) {
            if (!world.isClientSide()) {
                world.playSound(null, BlockPos.containing(x, y, z), SoundEvents.DRAGON_FIREBALL_EXPLODE, SoundSource.NEUTRAL, (float) 0.5, (float) 0.5);
            }
            ItemStack _ist = ar.getObject();
            if (_ist.hurt((int) (ar.getObject().getMaxDamage() * 0.1), RandomSource.create(), null)) {
                _ist.shrink(1);
                _ist.setDamageValue(0);
            }
            entity.getCooldowns().addCooldown(ar.getObject().getItem(), 1200);
            if (world instanceof ServerLevel _serverworld) {
                StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("primogemcraft", "tree"));
                template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y, z - 3), BlockPos.containing(x - 3, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
                        _serverworld.random, 3);
            }
            entity.teleportTo(x, (y + 10), z);
            if (entity instanceof ServerPlayer _serverPlayer)
                _serverPlayer.connection.teleport(x, (y + 10), z, entity.getYRot(), entity.getXRot());
        }
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_axe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_axe.line2"));
    }
}
