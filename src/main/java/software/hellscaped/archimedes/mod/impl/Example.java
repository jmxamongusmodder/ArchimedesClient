package software.hellscaped.archimedes.mod.impl;

import software.hellscaped.archimedes.mod.Mod;
import software.hellscaped.archimedes.util.Keyboard;

public class Example extends Mod{
    public Example(){
        super("Test", Keyboard.KEY_L);
    }

    @Override
    public void onEnable(){
        mc.thePlayer.addChatMessage("Works!");
    }

    @Override
    public void onDisable(){
        mc.thePlayer.addChatMessage("Disabled");
    }
    
}
