package com.Sizableshrimp0.EmeraldCraft;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldCraftRecipies {
	
	public ShapedRecipe EmeraldSword() {

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
     
        
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GREEN + "Emeraldness III");

        swordMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Sword");
        swordMeta.setLore(lore);
        sword.setItemMeta(swordMeta);
        
        
        ShapedRecipe recipe = new ShapedRecipe(sword);
        recipe.shape("EDE", "EHE" ,"EIE");
        recipe.setIngredient('D', Material.EMERALD);
        recipe.setIngredient('H', Material.EMERALD);
        recipe.setIngredient('I', Material.STICK);
        return recipe;
	}
        
        public ShapedRecipe EmeraldPickaxe() {

            ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemMeta pickMeta = pick.getItemMeta();
         
            
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.GREEN + "Emeraldness III");

            pickMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Pickaxe");
            pickMeta.setLore(lore);
            pick.setItemMeta(pickMeta);
            
            
            ShapedRecipe recipe = new ShapedRecipe(pick);
            recipe.shape("EDV", "LHC" ,"KIG");
            recipe.setIngredient('E', Material.EMERALD);
            recipe.setIngredient('D', Material.EMERALD);
            recipe.setIngredient('V', Material.EMERALD);
            recipe.setIngredient('H', Material.STICK);
            recipe.setIngredient('I', Material.STICK);
            return recipe;
        }
            
            public ShapedRecipe EmeraldShovel() {

                ItemStack shovel = new ItemStack(Material.DIAMOND_SPADE);
                ItemMeta shovelMeta = shovel.getItemMeta();
             
                
                List<String> lore = new ArrayList<String>();
                lore.add(ChatColor.GREEN + "Emeraldness III");

                shovelMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Shovel");
                shovelMeta.setLore(lore);
                shovel.setItemMeta(shovelMeta);
                
                
                ShapedRecipe recipe = new ShapedRecipe(shovel);
                recipe.shape("EDV", "LHC" ,"KIG");
                recipe.setIngredient('D', Material.EMERALD);
                recipe.setIngredient('H', Material.STICK);
                recipe.setIngredient('I', Material.STICK);
                return recipe;
            }
                
                public ShapedRecipe EmeraldAxe() {

                    ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
                    ItemMeta axeMeta = axe.getItemMeta();
                 
                    
                    List<String> lore = new ArrayList<String>();
                    lore.add(ChatColor.GREEN + "Emeraldness III");

                    axeMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Axe");
                    axeMeta.setLore(lore);
                    axe.setItemMeta(axeMeta);
                    
                    
                    ShapedRecipe recipe = new ShapedRecipe(axe);
                    recipe.shape("EDV", "LHC" ,"KIG");
                    recipe.setIngredient('D', Material.EMERALD);
                    recipe.setIngredient('V', Material.EMERALD);
                    recipe.setIngredient('C', Material.EMERALD);
                    recipe.setIngredient('H', Material.STICK);
                    recipe.setIngredient('I', Material.STICK);
                    return recipe;
                }
                    
                    public ShapedRecipe EmeraldHoe() {

                        ItemStack hoe = new ItemStack(Material.DIAMOND_HOE);
                        ItemMeta hoeMeta = hoe.getItemMeta();
                     
                        
                        List<String> lore = new ArrayList<String>();
                        lore.add(ChatColor.GREEN + "Emeraldness III");

                        hoeMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Hoe");
                        hoeMeta.setLore(lore);
                        hoe.setItemMeta(hoeMeta);
                        
                        
                        ShapedRecipe recipe = new ShapedRecipe(hoe);
                        recipe.shape("EDV", "LHC" ,"KIG");
                        recipe.setIngredient('D', Material.EMERALD);
                        recipe.setIngredient('V', Material.EMERALD);
                        recipe.setIngredient('H', Material.STICK);
                        recipe.setIngredient('I', Material.STICK);
                        return recipe;
                    }
                    
                    public ShapedRecipe EmeraldHelmet() {

                        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
                        ItemMeta helmetMeta = helmet.getItemMeta();
                     
                        
                        List<String> lore = new ArrayList<String>();
                        lore.add(ChatColor.GREEN + "Emeraldness III");

                        helmetMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Helmet");
                        helmetMeta.setLore(lore);
                        helmet.setItemMeta(helmetMeta);
                        
                        
                        ShapedRecipe recipe = new ShapedRecipe(helmet);
                        recipe.shape("EDV", "LHC" ,"KIG");
                        recipe.setIngredient('E', Material.EMERALD);
                        recipe.setIngredient('D', Material.EMERALD);
                        recipe.setIngredient('V', Material.EMERALD);
                        recipe.setIngredient('L', Material.EMERALD);
                        recipe.setIngredient('C', Material.EMERALD);
                        return recipe;
                    }
                    
                    public ShapedRecipe EmeraldChestplate() {

                        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        ItemMeta chestplateMeta = chestplate.getItemMeta();
                     
                        
                        List<String> lore = new ArrayList<String>();
                        lore.add(ChatColor.GREEN + "Emeraldness III");

                        chestplateMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Chestplate");
                        chestplateMeta.setLore(lore);
                        chestplate.setItemMeta(chestplateMeta);
                        
                        
                        ShapedRecipe recipe = new ShapedRecipe(chestplate);
                        recipe.shape("EDV", "LHC" ,"KIG");
                        recipe.setIngredient('E', Material.EMERALD);
                        recipe.setIngredient('V', Material.EMERALD);
                        recipe.setIngredient('L', Material.EMERALD);
                        recipe.setIngredient('H', Material.EMERALD);
                        recipe.setIngredient('C', Material.EMERALD);
                        recipe.setIngredient('K', Material.EMERALD);
                        recipe.setIngredient('I', Material.EMERALD);
                        recipe.setIngredient('G', Material.EMERALD);
                        return recipe;
                    }
                    
                    public ShapedRecipe EmeraldLeggings() {

                        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                        ItemMeta leggingsplateMeta = leggings.getItemMeta();
                     
                        
                        List<String> lore = new ArrayList<String>();
                        lore.add(ChatColor.GREEN + "Emeraldness III");

                        leggingsplateMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Leggings");
                        leggingsplateMeta.setLore(lore);
                        leggings.setItemMeta(leggingsplateMeta);
                        
                        
                        ShapedRecipe recipe = new ShapedRecipe(leggings);
                        recipe.shape("EDV", "LHC" ,"KIG");
                        recipe.setIngredient('E', Material.EMERALD);
                        recipe.setIngredient('D', Material.EMERALD);
                        recipe.setIngredient('V', Material.EMERALD);
                        recipe.setIngredient('L', Material.EMERALD);
                        recipe.setIngredient('C', Material.EMERALD);
                        recipe.setIngredient('K', Material.EMERALD);
                        recipe.setIngredient('G', Material.EMERALD);
                        return recipe;
                    }
                    
                    public ShapedRecipe EmeraldBoots() {

                        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
                        ItemMeta bootsplateMeta = boots.getItemMeta();
                     
                        
                        List<String> lore = new ArrayList<String>();
                        lore.add(ChatColor.GREEN + "Emeraldness III");

                        bootsplateMeta.setDisplayName(ChatColor.DARK_GREEN + "Emerald Boots");
                        bootsplateMeta.setLore(lore);
                        boots.setItemMeta(bootsplateMeta);
                        
                        
                        ShapedRecipe recipe = new ShapedRecipe(boots);
                        recipe.shape("EDV", "LHC" ,"KIG");
                        recipe.setIngredient('L', Material.EMERALD);
                        recipe.setIngredient('C', Material.EMERALD);
                        recipe.setIngredient('K', Material.EMERALD);
                        recipe.setIngredient('G', Material.EMERALD);
                        return recipe;

}
}
