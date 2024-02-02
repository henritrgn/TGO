package net.henri.henritgo202423.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static java.lang.Math.random;


public class PassbItem extends Item {
    public PassbItem(Properties pProperties) {
        super(pProperties);
    }
    public static final FoodProperties PASSB = (new FoodProperties.Builder()).alwaysEat().fast().build();
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        double randomNumber = random();
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        ItemStack loot=getlootB(randomNumber);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? itemstack : loot;
    }
    public ItemStack getlootB(double randomNumber){
        if (randomNumber<0.1){
            return new ItemStack(Items.DRAGON_BREATH, 5);
        }
        else if (randomNumber<0.25){
            return new ItemStack(Items.ARROW, 30);
        }
        else if (randomNumber<0.4){
            return new ItemStack(Items.GOLDEN_APPLE, 2);
        }
        else if (randomNumber<0.55){
            return new ItemStack(Items.ENDER_PEARL, 3);
        }
        else if (randomNumber<0.7){
            return new ItemStack(Items.BLAZE_ROD, 2);
        }
        else if(randomNumber<0.9){
            return new ItemStack(Items.IRON_ORE, 6);
        }
        else {
            return new ItemStack(Items.DIAMOND, 2);
        }
    }
}

