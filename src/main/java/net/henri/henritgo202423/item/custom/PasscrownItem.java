package net.henri.henritgo202423.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static java.lang.Math.random;


public class PasscrownItem extends Item {
    public PasscrownItem(Properties pProperties) {
        super(pProperties);
    }
    public static final FoodProperties PASSCROWN = (new FoodProperties.Builder()).alwaysEat().fast().build();
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        double randomNumber = random();
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        ItemStack loot=getlootCrown(randomNumber);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? itemstack : loot;
    }
    public ItemStack getlootCrown(double randomNumber){
        if (randomNumber<0.5){
            return new ItemStack(Items.DIRT, 1);
        }
        else if (randomNumber<0.7){
            return new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1);
        }
        else if (randomNumber<0.9){
            return new ItemStack(Items.DIAMOND_BLOCK, 1);
        }
        else{
            return new ItemStack(Items.ELYTRA, 1);
        }
    }
}

