package com.tacaly.applegod;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;


public class recipes {
    public static void recipe() {
        @SuppressWarnings("deprecation")

        //Normal Apple recipe
        ItemStack applegnormal = new ItemStack(Material.APPLE, 1);

        ShapedRecipe AppleYoung;
        AppleYoung = new ShapedRecipe(applegnormal);

        //crafting grid
        AppleYoung.shape("*%*","%B%","*%*");

        AppleYoung.setIngredient('*', Material.STICK);
        AppleYoung.setIngredient('%', Material.COBBLESTONE);
        AppleYoung.setIngredient('B', Material.WHEAT_SEEDS);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleYoung);

        ///////////////////////////////////////////////
        //Apple dif. crafting methoed
        ItemStack appleDif = new ItemStack(Material.APPLE, 1);

        ShapedRecipe AppleDif;
        AppleDif = new ShapedRecipe(appleDif);

        //crafting shape
        AppleDif.shape("000","000","*%0");
        //crafting grid
        AppleDif.setIngredient('*', Material.MELON_SEEDS);
        AppleDif.setIngredient('%', Material.ENDER_PEARL);
        AppleDif.setIngredient('0', Material.STICK);

        // Add recipe to server
        getServer().addRecipe(AppleDif);

        ///////////////////////////////////////////////
        //golden apple recipe
        ItemStack applegGoldem = new ItemStack(Material.GOLDEN_APPLE, 1);

        ShapedRecipe AppleGolden;
        AppleGolden = new ShapedRecipe(applegGoldem);

        //crafting shape
        AppleGolden.shape("*%*","%B%","*%*");
        //crafting grid
        AppleGolden.setIngredient('*', Material.STICK);
        AppleGolden.setIngredient('%', Material.GOLD_INGOT);
        AppleGolden.setIngredient('B', Material.APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleGolden);

        ///////////////////////////////////////////////
        //enchanted apple
        ItemStack appleEnchanted = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);


        ShapedRecipe AppleEnchanted;
        AppleEnchanted = new ShapedRecipe(appleEnchanted);

        //crafting shape
        AppleEnchanted.shape("*%*","%B%","*%*");
        //crafting grid
        AppleEnchanted.setIngredient('*', Material.ENCHANTED_BOOK);
        AppleEnchanted.setIngredient('%', Material.ENDER_PEARL);
        AppleEnchanted.setIngredient('B', Material.GOLDEN_APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleEnchanted);

        ///////////////////////////////////////////////
        //Totem of undying
        ItemStack totemOfundying = new ItemStack(Material.TOTEM_OF_UNDYING, 1);

        ShapedRecipe TotemOfundying;
        TotemOfundying = new ShapedRecipe(totemOfundying);

        //crafting shape
        TotemOfundying.shape("*%*","%B%","*%*");
        //crafting grid
        TotemOfundying.setIngredient('*', Material.AMETHYST_SHARD);
        TotemOfundying.setIngredient('%', Material.NETHERITE_INGOT);
        TotemOfundying.setIngredient('B', Material.NETHER_STAR);

        // Add recipe to server
        getServer().addRecipe(TotemOfundying);

    }

}
