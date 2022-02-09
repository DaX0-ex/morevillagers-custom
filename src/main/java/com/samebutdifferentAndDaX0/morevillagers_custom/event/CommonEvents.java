package com.samebutdifferentAndDaX0.morevillagers_custom.event;

import com.samebutdifferentAndDaX0.morevillagers_custom.MoreVillagers;
import com.samebutdifferentAndDaX0.morevillagers_custom.init.VillagerInit;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MoreVillagers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            VillagerInit.fillTradeData();
            VillagerInit.registerOceanographerPOI();
            VillagerInit.registerNetherianPOI();
            VillagerInit.registerWoodworkerPOI();
            VillagerInit.registerEnderianPOI();
            VillagerInit.registerEngineerPOI();
            VillagerInit.registerFloristPOI();
            VillagerInit.registerHunterPOI();
            VillagerInit.registerInventorPOI();
        });
    }
}
