package net.henri.henritgo202423.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import static java.lang.Math.random;


public class PassdItem extends Item {
    public PassdItem(Properties pProperties) {
        super(pProperties);
    }
    public static final FoodProperties PASSD = (new FoodProperties.Builder()).alwaysEat().fast().build();
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        double randomNumber = random();
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        ItemStack loot=getlootD(randomNumber);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? itemstack : loot;
    }
    public ItemStack getlootD(double randomNumber){
        if (randomNumber<0.15){
            return new ItemStack(Items.OAK_LOG, 10);
        }
        else if (randomNumber<0.3){
            return new ItemStack(Items.COBBLESTONE, 10);
        }
        else if (randomNumber<0.45){
            return new ItemStack(Items.IRON_ORE, 3);
        }
        else if (randomNumber<0.55){
            return new ItemStack(Items.BLUE_WOOL, 3);
        }
        else if (randomNumber<0.65){
            return new ItemStack(Items.WHITE_WOOL, 6);
        }
        else if (randomNumber<0.75){
            return new ItemStack(Items.RED_WOOL, 9);
        }
        else if (randomNumber<0.85){
            return new ItemStack(Items.SHULKER_BOX, 1);
        }
        else{
            return new ItemStack(Items.APPLE, 3);
        }
    }
}

