package com.xutongxin.test.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class Join {
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity=event.getEntity();
        if(entity instanceof PlayerEntity)
        {
            String message="Hello world";
            StringTextComponent text=new StringTextComponent(message);
            entity.sendMessage(text,entity.getUniqueID());

        }
    }
}
