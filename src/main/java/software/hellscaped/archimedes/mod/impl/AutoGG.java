package software.hellscaped.archimedes.mod.impl;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import software.hellscaped.archimedes.mod.Mod;
import software.hellscaped.archimedes.util.Keyboard;

public class AutoGG extends Mod{
    public AutoGG(){
        super("AutoGG", Keyboard.KEY_NONE);
    }
    
    public static Minecraft mc = Minecraft.getMinecraft();
    public static ArrayList<String> keywords = new ArrayList<String>();
    public static ArrayList<String> responses = new ArrayList<String>();

    public static void parseMessage(String message) {
        keywords.add("won");
        responses.add("gg");
        for (String keyword : keywords) {
            if (message.contains(keyword)) {
                for(int i = 0; i < responses.size(); i++)
                mc.thePlayer.sendChatMessage(responses.get(i));
            }
        }
    }

}