package me.kaloyankys.tropical.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    /*
    Bananas / Plantains
     */
    public static final Item BANANA = register("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA).group(ItemGroup.DECORATIONS)));
    public static final Item GILDED_BANANA = register("gilded_banana", new Item(new FabricItemSettings().food(ModFoodComponents.GILDED_BANANA).group(ItemGroup.DECORATIONS)));
    public static final Item PLANTAIN = register("plantain", new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS).group(ItemGroup.DECORATIONS)));
    public static final Item COOKED_PLANTAIN = register("cooked_plantain", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_PLANTAIN).group(ItemGroup.DECORATIONS)));

    /*
    Spawn Eggs
    */
    public static final Item COCONUT_CRAB_SPAWN_EGG = register("coconut_crab_spawn_egg",
            new SpawnEggItem(ModEntities.COCONUT_CRAB, 0xc45741, 0xffa44a,
                    new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item CHIMP_SPAWN_EGG = register("chimp_spawn_egg",
            new SpawnEggItem(ModEntities.CHIMP, 0xc45741, 0xffa44a,
                    new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    public static final Item TOUCAN_SPAWN_EGG = register("toucan_spawn_egg",
            new SpawnEggItem(ModEntities.TOUCAN, 0xc45741, 0xffa44a,
                    new FabricItemSettings().group(ItemGroup.DECORATIONS)));

    public static Item register(String id, Item item) {
        Item Item = new Item(new Item.Settings().group(ItemGroup.DECORATIONS));
        return Registry.register(Registry.ITEM, new Identifier("tropical", id), item);
    }
}
