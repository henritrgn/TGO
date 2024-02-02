package net.henri.henritgo202423.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static java.lang.Math.random;


public class PassaItem extends Item {
    public PassaItem(Properties pProperties) {
        super(pProperties);
    }
    public static final FoodProperties PASSA = (new FoodProperties.Builder()).alwaysEat().fast().build();
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        double randomNumber = random();
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        ItemStack loot=getlootA(randomNumber);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? itemstack : loot;
    }
    public ItemStack getlootA(double randomNumber){
        if (randomNumber<0.3){
            return new ItemStack(Items.DIAMOND, 3);
        }
        else if (randomNumber<0.5){
            return new ItemStack(Items.LAPIS_ORE, 8);
        }
        else if (randomNumber<0.75){
            return new ItemStack(Items.IRON_ORE, 12);
        }
        else{
            return new ItemStack(Items.GOLDEN_APPLE, 3);
        }
    }
}

