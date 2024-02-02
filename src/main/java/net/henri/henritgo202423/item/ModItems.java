package net.henri.henritgo202423.item;

import net.henri.henritgo202423.TGOMod;
import net.henri.henritgo202423.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TGOMod.MOD_ID);

    public static final RegistryObject<Item> PASSA = ITEMS.register("passa",
            () -> new PassaItem(new Item.Properties().food(PassaItem.PASSA).stacksTo(1)));
    public static final RegistryObject<Item> PASSB = ITEMS.register("passb",
            () -> new PassbItem(new Item.Properties().food(PassbItem.PASSB).stacksTo(1)));
    public static final RegistryObject<Item> PASSC = ITEMS.register("passc",
            () -> new PasscItem(new Item.Properties().food(PasscItem.PASSC).stacksTo(1)));
    public static final RegistryObject<Item> PASSD = ITEMS.register("passd",
            () -> new PassdItem(new Item.Properties().food(PassdItem.PASSD).stacksTo(1)));
    public static final RegistryObject<Item> PASSCROWN = ITEMS.register("passcrown",
            () -> new PasscrownItem(new Item.Properties().food(PasscrownItem.PASSCROWN).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
