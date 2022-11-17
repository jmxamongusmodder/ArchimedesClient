package software.hellscaped.archimedes.mod;

import net.minecraft.client.Minecraft;

public class Mod {
    
    public String name;
    public int keyBind;
    public boolean enabled;
    public Minecraft mc = Minecraft.getMinecraft();

    public Mod(String name, int keyBind){
        this.name = name;
        this.keyBind = keyBind;
    }

    public void onEnable(){ }
    public void onDisable(){ }

    public void toggle(){
        if(this.enabled == false) {
            this.onEnable();
            this.enabled = true;
        } else if (this.enabled == true) {
            this.onDisable();
            this.enabled = false;
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getKeyBind() { return keyBind; }
    public void setKeyBind(int keyBind) { this.keyBind = keyBind; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

}
