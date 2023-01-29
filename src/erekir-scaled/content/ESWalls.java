package xenacia.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.*;

import static mindustry.type.ItemStack.*;

public class ESWalls{
    public static Block



    public static void load(){
        berylliumWallHuge = new Wall("beryllium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(berylliumWall.requirements, 9));
            health = 130 * wallHealthMultiplier * 9;
            armor = 2f;
            buildCostMultiplier = 3f;
            size = 3;
        }};
        berylliumWallGigantic = new Wall("beryllium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(berylliumWall.requirements, 16));
            health = 130 * wallHealthMultiplier * 16;
            armor = 2f;
            buildCostMultiplier = 2f;
            size = 4;
        }};
        tungstenWallHuge = new Wall("tungsten-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(tungstenWall.requirements, 9));
            health = 180 * wallHealthMultiplier * 9;
            armor = 14f;
            buildCostMultiplier = 3f;
            size = 3;
        }};
        tungstenWallGigantic = new Wall("tungsten-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(tungstenWall.requirements, 16));
            health = 180 * wallHealthMultiplier * 16;
            armor = 14f;
            buildCostMultiplier = 2f;
            size = 4;
        }};
        blastGate = new AutoDoor("blast-gate"){{
            requirements(Category.defense, with(Items.tungsten, 6, Items.silicon, 6));
            health = 175 * wallHealthMultiplier;
            armor = 14f;
        }};
        blastDoorLarge = new AutoDoor("blast-door-large"){{
            requirements(Category.defense, with(Items.tungsten, 24, Items.silicon, 24));
            health = 175 * wallHealthMultiplier * 4;
            armor = 14f;
            size = 3;
        }};
        blastDoorHuge = new AutoDoor("blast-door-huge"){{
            requirements(Category.defense, with(Items.tungsten, 96, Items.silicon, 96));
            health = 175 * wallHealthMultiplier * 9;
            armor = 14f;
            size = 4;
        }};
        reinforcedSurgeWallHuge = new Wall("reinforced-surge-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(reinforcedSurgeWall.requirements, 9));
            health = 250 * wallHealthMultiplier * 16;
            lightningChance = 0.05f;
            lightningDamage = 30f;
            armor = 20f;
            size = 3;
            researchCost = with(Items.surgeAlloy, 120, Items.tungsten, 600);
        }};
        reinforcedSurgeWallGigantic = new Wall("reinforced-surge-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(reinforcedSurgeWall.requirements, 16));
            health = 250 * wallHealthMultiplier * 16;
            lightningChance = 0.05f;
            lightningDamage = 30f;
            armor = 20f;
            size = 4;
            researchCost = with(Items.surgeAlloy, 240, Items.tungsten, 1200);
        }};
        carbideWallHuge = new Wall("carbide-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(carbideWall.requirements, 9));
            health = 270 * wallHealthMultiplier * 9;
            armor = 16f;
            size = 3;
        }};
        carbideWallGigantic = new Wall("carbide-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(carbideWall.requirements, 16));
            health = 270 * wallHealthMultiplier * 16;
            armor = 16f;
            size = 4;
        }};
        shieldedWallSmall = new ShieldWall("shielded-wall-small"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 5, Items.surgeAlloy, 3, Items.beryllium, 3));
            consumePower(0.8f / 60f);

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            chanceDeflect = 8f;

            health = 260 * wallHealthMultiplier;
            armor = 15f;
            size = 2;
        }};
        shieldedWallLarge = new ShieldWall("shielded-wall-large"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 45, Items.surgeAlloy, 27, Items.beryllium, 27));
            consumePower(4f / 60f);

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            chanceDeflect = 8f;

            health = 260 * wallHealthMultiplier * 9;
            armor = 15f;
            size = 3;
        }};
        shieldedWallHuge = new ShieldWall("shielded-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 80, Items.surgeAlloy, 48, Items.beryllium, 48));
            consumePower(5f / 60f);

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            chanceDeflect = 8f;

            health = 260 * wallHealthMultiplier * 16;
            armor = 15f;
            size = 4;
        }};
    }
}
