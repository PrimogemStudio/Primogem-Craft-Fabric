
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PrimogemcraftModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades()
				.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get()), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 6), new ItemStack(PrimogemcraftModItems.XIWANGDEYITIAN_011.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(
				new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get()), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 6), new ItemStack(PrimogemcraftModItems.BBUZAINIANQINGDEQINCEZHUANG_012.get()), 10, 5, 0.05f));
		event.getGenericTrades()
				.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get()), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 6), new ItemStack(PrimogemcraftModItems.SSHENHUDEZHUFU_013.get()), 10, 5, 0.05f));
		event.getGenericTrades()
				.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get()), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 6), new ItemStack(PrimogemcraftModItems.CCANGRUIMILINJIAN_014.get()), 10, 5, 0.05f));
		event.getGenericTrades()
				.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get(), 10), new ItemStack(PrimogemcraftModItems.XIXIANGYUZHIYUAN.get()), new ItemStack(PrimogemcraftModItems.SHILIANCHOU.get()), 10, 5, 0f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(PrimogemcraftModBlocks.CESHIXIAODENGFASHEQI.get()), new ItemStack(PrimogemcraftModItems.CCHONGGAODAODEDEZANXU.get(), 8),
				new ItemStack(PrimogemcraftModBlocks.CHUANGZAOXIAODENGFASHEQI.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 12), new ItemStack(PrimogemcraftModItems.YUANSHI.get(), 5), new ItemStack(PrimogemcraftModItems.XIWANGDEYITIAN_011.get()), 2, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get(), 10), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get()), new ItemStack(PrimogemcraftModItems.SHILIANCHOU.get()), 10, 5, 0f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(PrimogemcraftModBlocks.CESHIXIAODENGFASHEQI.get()), new ItemStack(PrimogemcraftModItems.CCHONGGAODAODEDEZANXU.get(), 5),
					new ItemStack(PrimogemcraftModBlocks.CHUANGZAOXIAODENGFASHEQI.get()), 10, 5, 0.01f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.BOOK), new ItemStack(Items.EXPERIENCE_BOTTLE), new ItemStack(PrimogemcraftModItems.DAYINGXIONGDEJINGYAN.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 4), new ItemStack(PrimogemcraftModItems.YUANSHI.get(), 2), new ItemStack(PrimogemcraftModItems.BBUZAINIANQINGDEQINCEZHUANG_012.get()), 10, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get(), 10), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 2), new ItemStack(PrimogemcraftModItems.SHILIANCHOU.get()), 10, 5, 0f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 10), new ItemStack(PrimogemcraftModItems.YUANSHI.get(), 6), new ItemStack(PrimogemcraftModItems.SSHENHUDEZHUFU_013.get()), 10, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get(), 10), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 2), new ItemStack(PrimogemcraftModItems.SHILIANCHOU.get()), 10, 5, 0f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 9), new ItemStack(PrimogemcraftModItems.YUANSHI.get(), 3), new ItemStack(PrimogemcraftModItems.CCANGRUIMILINJIAN_014.get()), 10, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get(), 10), new ItemStack(PrimogemcraftModItems.XIAODAIMOLA.get(), 2), new ItemStack(PrimogemcraftModItems.SHILIANCHOU.get()), 5, 5, 0f));
		}
	}
}
