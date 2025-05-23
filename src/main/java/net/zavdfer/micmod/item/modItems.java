package net.zavdfer.micmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zavdfer.micmod.MICMod;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MICMod.MOD_ID);

    public static final RegistryObject<Item> metallurgical_plant = ITEMS.register("metallurgical_plant",
            () -> new Item(new Item.Properties( )));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
