package software.hellscaped.archimedes;

import net.minecraft.client.Minecraft;
import software.hellscaped.archimedes.mod.ModManager;

public class Main {
    
    public static Minecraft mc = Minecraft.getMinecraft();
    public static Main INSTANCE = new Main();
    public ModManager modManager;

    public void init() {
        modManager = new ModManager();
        System.out.println("Archimedes Client Starting");
    }


}