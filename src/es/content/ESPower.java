package es.content;

import arc.graphics.Color;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.content.Items;
import mindustry.world.blocks.power.BeamNode;
import mindustry.world.blocks.power.LongPowerNode;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.*;

public class ESPower{
    public static Block
            largeBeamNode, beamSubstation, beamBeacon,
            linkNode, largeLinkNode, largeBeamLink, linkSubstation;

    public static void load(){

        largeBeamNode = new BeamNode("large-beam-node"){{
            requirements(Category.power, with(Items.beryllium, 10, Items.silicon, 5));
            size = 2;
            consumesPower = outputsPower = true;
            range = 18;

            consumePowerBuffered(8000f);
        }};
        beamSubstation = new BeamNode("beam-substation"){{
            requirements(Category.power, with(Items.beryllium, 120, Items.oxide, 40, Items.tungsten, 25, Items.silicon, 50));
            size = 4;
            consumesPower = outputsPower = true;
            range = 52;

            consumePowerBuffered(120000f);
        }};
        beamBeacon = new BeamNode("beam-beacon"){{
            requirements(Category.power, with(Items.beryllium, 480, Items.surgeAlloy, 120, Items.tungsten, 100, Items.silicon, 200));
            size = 5;
            consumesPower = outputsPower = true;
            range = 124;

            consumePowerBuffered(240000f);
        }};
        linkNode = new LongPowerNode("link-node"){{
            requirements(Category.power, BuildVisibility.editorOnly, with());
            maxNodes = 1;
            laserRange = 200f;
            autolink = false;
            laserColor2 = Color.valueOf("ffd9c2");
            laserScale = 0.6f;
            scaledHealth = 90;
        }};
        largeLinkNode = new LongPowerNode("large-link-node"){{
            requirements(Category.power, BuildVisibility.editorOnly, with());
            size = 2;
            maxNodes = 1;
            laserRange = 600f;
            autolink = false;
            laserColor2 = Color.valueOf("ffd9c2");
            laserScale = 0.6f;
            scaledHealth = 130;
        }};
        largeBeamLink = new LongPowerNode("large-beam-link"){{
            requirements(Category.power, BuildVisibility.editorOnly, with());
            size = 4;
            maxNodes = 1;
            laserRange = 2200f;
            autolink = false;
            laserColor2 = Color.valueOf("ffd9c2");
            laserScale = 1f;
            scaledHealth = 130;
        }};
        linkSubstation = new LongPowerNode("link-substation"){{
            requirements(Category.power, BuildVisibility.editorOnly, with());
            size = 5;
            maxNodes = 2;
            laserRange = 4500f;
            autolink = false;
            laserColor2 = Color.valueOf("ffd9c2");
            laserScale = 1.4f;
            scaledHealth = 130;
        }};
    }
}
