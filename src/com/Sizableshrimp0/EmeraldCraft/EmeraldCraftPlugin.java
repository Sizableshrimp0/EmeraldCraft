package com.Sizableshrimp0.EmeraldCraft;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.Sizableshrimp0.EmeraldCraft.EmeraldCraftRecipies;

public class EmeraldCraftPlugin extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        EmeraldCraftRecipies recipes = new EmeraldCraftRecipies();
        this.getServer().addRecipe(recipes.EmeraldSword());
        this.getServer().addRecipe(recipes.EmeraldPickaxe());
        this.getServer().addRecipe(recipes.EmeraldShovel());
        this.getServer().addRecipe(recipes.EmeraldAxe());
        this.getServer().addRecipe(recipes.EmeraldHoe());
        this.getServer().addRecipe(recipes.EmeraldHelmet());
        this.getServer().addRecipe(recipes.EmeraldChestplate());
        this.getServer().addRecipe(recipes.EmeraldLeggings());
        this.getServer().addRecipe(recipes.EmeraldBoots());
    }

    @Override
    public void onDisable() {

    }
}
