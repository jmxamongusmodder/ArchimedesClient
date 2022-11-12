package software.hellscaped.archimedes;

import net.minecraft.client.Minecraft;
import java.util.ArrayList;
import net.lax1dude.eaglercraft.EaglercraftRandom;

public class AutoGG {
    public static Minecraft mc = Minecraft.getMinecraft();
    public static ArrayList<String> keywords = new ArrayList<String>();
    public static ArrayList<String> responses = new ArrayList<String>();
    public static void parseMessage(String message) {
        for (String keyword : keywords) {
            if (message.contains(keyword)) {
                mc.thePlayer.sendChatMessage(responses.get(EaglercraftRandom.nextInt(responses.size())));
            }
        }
    }
}