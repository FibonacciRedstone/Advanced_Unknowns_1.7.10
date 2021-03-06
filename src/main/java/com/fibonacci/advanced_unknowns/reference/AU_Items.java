package com.fibonacci.advanced_unknowns.reference;

import com.fibonacci.advanced_unknowns.item.*;
import com.fibonacci.advanced_unknowns.main.Advanced_Unknowns;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Fibonacci on 11/25/14.
 */
public class AU_Items {
    public static Item backpack;
    public static Item warphome;
    public static Item expstorage;
    public static Item blaster;
    public static Item blasterbullets;

    public static void loadItems(){
        backpack = new Backpack().setCreativeTab(Advanced_Unknowns.tab).setUnlocalizedName("Backpack").setTextureName("advancedunknowns:backpack");
        expstorage = new ExpStorage().setCreativeTab(Advanced_Unknowns.tab).setUnlocalizedName("ExpStorage").setTextureName("advancedunknowns:expstorage");
        warphome = new WarpHome().setCreativeTab(Advanced_Unknowns.tab).setUnlocalizedName("WarpHome").setTextureName("advancedunknowns:warphome");
        blaster = new Blaster().setCreativeTab(Advanced_Unknowns.tab).setUnlocalizedName("Blaster").setTextureName("advancedunknowns:blaster");
        blasterbullets = new BlasterBullets().setCreativeTab(Advanced_Unknowns.tab).setUnlocalizedName("BlasterBullets").setTextureName("advancedunknowns:blasterbullets");
    }
    public static void registerItems(){
        GameRegistry.registerItem(backpack, "Backpack");
        GameRegistry.registerItem(warphome, "WarpHome");
        GameRegistry.registerItem(expstorage, "ExpStorage");
        GameRegistry.registerItem(blaster, "Blaster");
        GameRegistry.registerItem(blasterbullets, "BlasterBullets");
    }

}
