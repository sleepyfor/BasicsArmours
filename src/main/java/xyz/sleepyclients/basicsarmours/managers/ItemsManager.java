package xyz.sleepyclients.basicsarmours.managers;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.sleepyclients.basicsarmours.BasicsArmours;

public class ItemsManager {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BasicsArmours.MOD_ID);
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(TiersManager.EMERALD, 3,  -2.2f,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(TiersManager.EMERALD, 1,  -2.8f,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(TiersManager.EMERALD, 5,  -2.8f,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(TiersManager.EMERALD, 1.5f,  -3,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(TiersManager.EMERALD, -4,  2,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_WEAPONS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
