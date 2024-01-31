package xyz.sleepyclients.basicsarmours.managers;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.sleepyclients.basicsarmours.BasicsArmours;

public class ArmoursManager {
    public static final DeferredRegister<Item> ARMOURS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BasicsArmours.MOD_ID);

    public static final RegistryObject<Item> EMERALD_CAP = ARMOURS.register("emerald_cap",
            () -> new ArmorItem(MaterialManager.EMERALD, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_ARMOUR)));
    public static final RegistryObject<Item> EMERALD_JUMPER = ARMOURS.register("emerald_jumper",
            () -> new ArmorItem(MaterialManager.EMERALD, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_ARMOUR)));
    public static final RegistryObject<Item> EMERALD_TROUSERS = ARMOURS.register("emerald_trousers",
            () -> new ArmorItem(MaterialManager.EMERALD, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_ARMOUR)));
    public static final RegistryObject<Item> EMERALD_TRAINERS = ARMOURS.register("emerald_trainers",
            () -> new ArmorItem(MaterialManager.EMERALD, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).tab(CreativeTabsManager.BASICS_ARMOURS_ARMOUR)));

    public static void register(IEventBus eventBus) {
        ARMOURS.register(eventBus);
    }
}
