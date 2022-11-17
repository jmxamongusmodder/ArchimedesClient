package software.hellscaped.archimedes.mod;

import java.util.ArrayList;
import java.util.List;

import software.hellscaped.archimedes.mod.impl.AutoGG;

public class ModManager {

    public List<Mod> modules = new ArrayList<>();

    public static AutoGG autoGG;

    public ModManager(){

        //Hud

        //Misc

        register(autoGG = new AutoGG());

    }

    public void register(Mod m){
        this.modules.add(m);
    }
    
    public void onKey(int keyCode){
        for(int i = 0; i < modules.size(); i++){
            if(modules.get(i).keyBind == keyCode && keyCode != 0)
                modules.get(i).toggle();
        }
    }

}
