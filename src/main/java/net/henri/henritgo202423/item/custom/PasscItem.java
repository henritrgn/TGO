package net.henri.henritgo202423.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static java.lang.Math.random;


public class PasscItem extends Item {
    public PasscItem(Properties pProperties) {
        super(pProperties);
    }
    public static final FoodProperties PASSC = (new FoodProperties.Builder()).alwaysEat().fast().build();
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        double randomNumber = random();
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        ItemStack loot=getlootC(randomNumber);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? itemstack : loot;
    }
    public ItemStack getlootC(double randomNumber){
        if (randomNumber<0.1){
            return new ItemStack(Items.BLUE_SHULKER_BOX, 1);
        }
        else if (randomNumber<0.2){
            return new ItemStack(Items.WHITE_SHULKER_BOX, 1);
        }
        else if (randomNumber<0.3){
            return new ItemStack(Items.RED_SHULKER_BOX, 1);
        }
        else if (randomNumber<0.5){
            return new ItemStack(Items.IRON_ORE, 5);
        }
        else if (randomNumber<0.75){
            return new ItemStack(Items.GOLD_ORE, 4);
        }
        else if(randomNumber<0.9){
            return new ItemStack(Items.COAL, 16);
        }
        else {
            return new ItemStack(Items.DIAMOND, 1);
        }
    }
}

