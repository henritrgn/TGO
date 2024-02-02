package net.henri.henritgo202423.item;

import net.henri.henritgo202423.TGOMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TGOMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TGO = CREATIVE_MODE_TABS.register("tgo",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.PASSCROWN.get()))
                    .title(Component.translatable("creativetab.tgo"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PASSA.get());
                        pOutput.accept(ModItems.PASSB.get());
                        pOutput.accept(ModItems.PASSC.get());
                        pOutput.accept(ModItems.PASSD.get());
                        pOutput.accept(ModItems.PASSCROWN.get());
                    })
                    .build());



    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
