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
    
    public void onEnable() {
	}

	public void onDisable() {
	}

    
    //Pretty sure the debounce thing didn't do anything.
    
	public void toggle() {
		this.enabled = !this.enabled;
		if (this.enabled)
			onEnable();
		else
			onDisable();
	}

	public void setEnabled(boolean state) {
		this.enabled = state;
		if (this.enabled)
			onEnable();
		else
			onDisable();
	}

	public boolean isEnabled() {
		return enabled;
	}

	public String getName() {
		return name;
	}

}
