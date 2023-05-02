package es;

import mindustry.mod.*;
import es.content.*;

public class ESMod extends Mod{

    @Override

    public void loadContent(){
        ESSounds.load();
        ESWalls.load();
        ESPower.load();
        ESTurrets.load();
    }

}
