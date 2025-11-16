package com.aleo1lab.katool;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.Category;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class KatoolAddon extends MeteorAddon {

    // Ana kategoriler
    public static final Category CATEGORY = new Category("katool", new ItemStack(Items.COMMAND_BLOCK));
    public static final Category ESP = new Category("katool ESP", new ItemStack(Items.VINE));
    public static final Category PVP = new Category("katool PVP", new ItemStack(Items.DIAMOND_SWORD));

    @Override
    public void onInitialize() {
        // Buraya modüller eklenecek
        // Örnek: Modules.get().add(new ModulAdi());
    }

    @Override
    public void onRegisterCategories() {
        // Kategorileri kaydet
        Modules.registerCategory(CATEGORY);
        Modules.registerCategory(ESP);
        Modules.registerCategory(PVP);
    }

    @Override
    public String getPackage() {
        return "com.aleo1lab.katool";
    }
}
