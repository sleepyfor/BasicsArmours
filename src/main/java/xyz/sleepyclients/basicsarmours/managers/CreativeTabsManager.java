package xyz.sleepyclients.basicsarmours.managers;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CreativeTabsManager {
    public static final CreativeModeTab BASICS_ARMOURS_WEAPONS = new CreativeModeTab("basicsarmoursweapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsManager.EMERALD_SWORD.get());
        }
    };
    public static final CreativeModeTab BASICS_ARMOURS_ARMOUR = new CreativeModeTab("basicsarmoursarmours") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ArmoursManager.EMERALD_CAP.get());
        }
    };
}
