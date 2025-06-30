package com.system.demomod.block;

import com.system.demomod.DemoMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // 创建方块
    public static final Block THE_FIRST_BLOCK = register("the_first_block", new Block(
            AbstractBlock.Settings.create().strength(1.5f, 6.0f)
    ));

    public static final Block KITTY_CAT_BLOCK = register("kitty_cat_block", new Block(
            AbstractBlock.Settings.create().strength(3.0f, 3.0f)
    ));

    // 注册方块物品
    public static void registerBlockItems(String id, Block block) {

        Item item = Registry.register(Registries.ITEM, Identifier.of(
                        DemoMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DemoMod.MOD_ID, id), block);
    }

    // 注册方块
    public static void registerModBlocks() {
        DemoMod.LOGGER.info("Registering ModBlocks for " + DemoMod.MOD_ID);
    }
}
