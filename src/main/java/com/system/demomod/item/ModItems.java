package com.system.demomod.item;

import com.system.demomod.DemoMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item THE_FIRST_TRY = registerItem("the_first_try", new Item(new Item.Settings()));
    public static final Item KITTY_CAT = registerItem("kitty_cat", new Item(new Item.Settings()));
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DemoMod.MOD_ID, id), item);
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(DemoMod.MOD_ID, id)), item);
    }

    public static void registerModItems() {
        DemoMod.LOGGER.info("Registering Mod Items for " + DemoMod.MOD_ID);
    }
}
