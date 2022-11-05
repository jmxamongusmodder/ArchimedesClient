package software.hellscaped.archimedes;

import net.minecraft.src.GuiButton;
import net.lax1dude.eaglercraft.TextureLocation;

public class GuiButtonArchimedes extends GuiButton {
    // change texture location
    private static TextureLocation tex_gui = new TextureLocation("/archimedes/gui.png");
    public GuiButtonArchimedes(int par1, int par2, int par3, String par4Str) {
        super(par1, par2, par3, par4Str);
    }
    public GuiButtonArchimedes(int par1, int par2, int par3, int par4, int par5, String par6Str) {
        super(par1, par2, par3, par4, par5, par6Str);
    }
}