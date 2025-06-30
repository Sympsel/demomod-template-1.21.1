package com.system.demomod.item;

import com.system.demomod.DemoMod;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    // 新的物品组变量
//    public static final RegistryKey<ItemGroup> DEMO_GROUP = register("demo_group");
//
//    // 注册新的物品组
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(DemoMod.MOD_ID, id));
//    }
//
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, DEMO_GROUP,
//                // column 位置
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                        .displayName(Text.translatable("itemGroup.demo_group"))
//                        .icon(() -> new ItemStack(ModItems.THE_FIRST_TRY))
//                        .entries((displayContext, entries) -> {
//                                    entries.add(ModItems.THE_FIRST_TRY);
//                                }
//                        ).build());
//        DemoMod.LOGGER.info("Registering Item Groups");
//    }

    public static final ItemGroup DEMO_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DemoMod.MOD_ID, "demo_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.demo_group"))
                    .icon(() -> new ItemStack(ModItems.THE_FIRST_TRY))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.THE_FIRST_TRY);
                        entries.add(Blocks.BRICKS);
                        entries.add(Items.DIAMOND);
                    }).build());

    public static void registerModItemGroups() {
        DemoMod.LOGGER.info("Registering Item Groups");
    }
}
