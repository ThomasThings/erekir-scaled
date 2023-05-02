package es.content;

import arc.audio.*;
import arc.files.*;
import mindustry.*;

public class ESSounds{
    public static Sound

            shootAltHeavy = new Sound(),
            shootAltLight = new Sound();

    public static void load() {
        if(Vars.headless) return;

        shootAltHeavy = Vars.tree.loadSound("shoot-alt-heavy");
        shootAltLight = Vars.tree.loadSound("shoot-alt-light");

    }

    protected static String soundPath(String soundName){
        String name = "sounds/" + soundName;
        return Vars.tree.get(name + ".ogg").exists() ? name + ".ogg" : name + ".mp3";
    }

    protected static Fi soundFile(String soundName){
        return Vars.tree.get(soundPath(soundName));
    }
}