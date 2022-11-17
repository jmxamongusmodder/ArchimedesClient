package software.hellscaped.archimedes.mod;

import java.util.ArrayList;
import java.util.List;

import software.hellscaped.archimedes.mod.impl.AutoGG;
import software.hellscaped.archimedes.mod.impl.Example;

public class ModManager {

    public List<Mod> modules = new ArrayList<>();

    public static AutoGG autoGG;
    public static Example example;

    public ModManager(){

        //Hud

        //Misc

        register(example = new Example());
        register(autoGG = new AutoGG());

    }

    public void register(Mod m){
        this.modules.add(m);
    }
    
    public void onKey(int keycode) {
		for (int i = 0; i < modules.size(); i++) {
			if (keycode == modules.get(i).keyBind && keycode != 0) {
				modules.get(i).toggle();
			}
		}
	}


}
