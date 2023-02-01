package es.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class ESWalls{
    public static Block
            berylliumWallHuge, berylliumWallGigantic,
            reinforcedGraphiteWall, reinforcedGraphiteWallLarge, reinforcedGraphiteWallHuge, reinforcedGraphiteWallGigantic,
            reinforcedSiliconWall, reinforcedSiliconWallLarge, reinforcedSiliconWallHuge, reinforcedSiliconWallGigantic,
            tungstenWallHuge, tungstenWallGigantic,
            oxideWall, oxideWallLarge, oxideWallHuge, oxideWallGigantic,
            blastGate, blastDoorLarge, blastDoorHuge,
            reinforcedThoriumWall, reinforcedThoriumWallLarge, reinforcedThoriumWallHuge, reinforcedThoriumWallGigantic,
            reinforcedSurgeWallHuge, reinforcedSurgeWallGigantic,
            carbideWallHuge, carbideWallGigantic,
            shieldedWallSmall, shieldedWallLarge, shieldedWallHuge;
    public static void load(){

        int wallHealthMultiplier = 4;

        berylliumWallHuge = new Wall("beryllium-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.beryllium, 54));
            health = 130 * wallHealthMultiplier * 9;
            armor = 2f;
            buildCostMultiplier = 3f;
            size = 3;
        }};
        berylliumWallGigantic = new Wall("beryllium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.beryllium, 96));
            health = 130 * wallHealthMultiplier * 16;
            armor = 2f;
            buildCostMultiplier = 2f;
            size = 4;
        }};
        reinforcedGraphiteWall = new Wall("reinforced-graphite-wall"){{
            requirements(Category.defense, with(Items.graphite, 5, Items.beryllium, 2));
            health = 150 * wallHealthMultiplier;
            armor = 5f;
            buildCostMultiplier = 8f;
            insulated = true;
            schematicPriority = 10;
            size = 2;
        }};
        reinforcedGraphiteWallLarge = new Wall("reinforced-graphite-wall-large"){{
            requirements(Category.defense, with(Items.graphite, 20, Items.beryllium, 8));
            health = 150 * wallHealthMultiplier * 4;
            armor = 5f;
            buildCostMultiplier = 5f;
            insulated = true;
            schematicPriority = 10;
            size = 3;
        }};
        reinforcedGraphiteWallHuge = new Wall("reinforced-graphite-wall-huge"){{
            requirements(Category.defense, with(Items.graphite, 45, Items.beryllium, 18));
            health = 150 * wallHealthMultiplier * 9;
            armor = 5f;
            buildCostMultiplier = 3f;
            insulated = true;
            schematicPriority = 10;
            size = 4;
        }};
        reinforcedGraphiteWallGigantic = new Wall("reinforced-graphite-wall-gigantic"){{
            requirements(Category.defense, with(Items.graphite, 80, Items.beryllium, 32));
            health = 150 * wallHealthMultiplier * 16;
            armor = 5f;
            buildCostMultiplier = 2f;
            insulated = true;
            schematicPriority = 10;
        }};
        reinforcedSiliconWall = new Wall("reinforced-silicon-wall"){{
            requirements(Category.defense, with(Items.silicon, 5, Items.graphite, 2));
            health = 150 * wallHealthMultiplier;
            armor = 5f;
            buildCostMultiplier = 8f;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.05f;
            lightningDamage = 5f;
        }};
        reinforcedSiliconWallLarge = new Wall("reinforced-silicon-wall-large"){{
            requirements(Category.defense, with(Items.silicon, 20, Items.graphite, 8));
            health = 150 * wallHealthMultiplier * 4;
            armor = 5f;
            buildCostMultiplier = 5f;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.05f;
            lightningDamage = 5f;
            size = 2;
        }};
        reinforcedSiliconWallHuge = new Wall("reinforced-silicon-wall-huge"){{
            requirements(Category.defense, with(Items.silicon, 45, Items.graphite, 18));
            health = 150 * wallHealthMultiplier * 9;
            armor = 5f;
            buildCostMultiplier = 3f;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 10f;
            size = 3;
        }};
        reinforcedSiliconWallGigantic = new Wall("reinforced-silicon-wall-gigantic"){{
            requirements(Category.defense, with(Items.silicon, 80, Items.graphite, 32));
            health = 150 * wallHealthMultiplier * 16;
            armor = 5f;
            buildCostMultiplier = 2f;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 10f;
            size = 4;
        }};
        tungstenWallHuge = new Wall("tungsten-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.tungsten, 54));
            health = 180 * wallHealthMultiplier * 9;
            armor = 14f;
            buildCostMultiplier = 3f;
            size = 3;
        }};
        tungstenWallGigantic = new Wall("tungsten-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.tungsten, 96));
            health = 180 * wallHealthMultiplier * 16;
            armor = 14f;
            buildCostMultiplier = 2f;
            size = 4;
        }};
        oxideWall = new Wall("oxide-wall"){{
            requirements(Category.defense, ItemStack.with(Items.oxide, 5, Items.beryllium, 2));
            health = 200 * wallHealthMultiplier;
            armor = 13f;
            buildCostMultiplier = 8f;
        }};
        oxideWallLarge = new Wall("oxide-wall-large"){{
            requirements(Category.defense, ItemStack.with(Items.oxide, 20, Items.beryllium, 8));
            health = 200 * wallHealthMultiplier * 4;
            armor = 13f;
            buildCostMultiplier = 5f;
            size = 2;
        }};
        oxideWallHuge = new Wall("oxide-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.oxide, 45, Items.beryllium, 18));
            health = 200 * wallHealthMultiplier * 9;
            armor = 13f;
            buildCostMultiplier = 3f;
            size = 3;
        }};
        oxideWallGigantic = new Wall("oxide-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.oxide, 80, Items.beryllium, 32));
            health = 200 * wallHealthMultiplier * 16;
            armor = 13f;
            buildCostMultiplier = 2f;
            size = 4;
        }};
        blastGate = new AutoDoor("blast-gate"){{
            requirements(Category.defense, with(Items.tungsten, 6, Items.silicon, 6));
            health = 175 * wallHealthMultiplier;
            armor = 14f;
        }};
        blastDoorLarge = new AutoDoor("blast-door-large"){{
            requirements(Category.defense, with(Items.tungsten, 54, Items.silicon, 54));
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
        reinforcedThoriumWall = new Wall("reinforced-thorium-wall"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 6, Items.tungsten, 2));
            health = 230 * wallHealthMultiplier;
            armor = 20f;
        }};
        reinforcedThoriumWallLarge = new Wall("reinforced-thorium-wall-large"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 24, Items.tungsten, 8));
            health = 230 * wallHealthMultiplier * 4;
            armor = 20f;
            size = 2;
        }};
        reinforcedThoriumWallHuge = new Wall("reinforced-thorium-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 54, Items.tungsten, 18));
            health = 230 * wallHealthMultiplier * 9;
            armor = 20f;
            size = 3;
        }};
        reinforcedThoriumWallGigantic = new Wall("reinforced-thorium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 96, Items.tungsten, 32));
            health = 230 * wallHealthMultiplier * 16;
            armor = 20f;
            size = 4;
        }};
        reinforcedSurgeWallHuge = new Wall("reinforced-surge-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.surgeAlloy, 54, Items.tungsten, 18));
            health = 250 * wallHealthMultiplier * 16;
            lightningChance = 0.05f;
            lightningDamage = 30f;
            armor = 20f;
            size = 3;
            researchCost = with(Items.surgeAlloy, 120, Items.tungsten, 600);
        }};
        reinforcedSurgeWallGigantic = new Wall("reinforced-surge-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.surgeAlloy, 96, Items.tungsten, 32));
            health = 250 * wallHealthMultiplier * 16;
            lightningChance = 0.05f;
            lightningDamage = 30f;
            armor = 20f;
            size = 4;
            researchCost = with(Items.surgeAlloy, 240, Items.tungsten, 1200);
        }};
        carbideWallHuge = new Wall("carbide-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 54, Items.carbide, 54));
            health = 270 * wallHealthMultiplier * 9;
            armor = 16f;
            size = 3;
        }};
        carbideWallGigantic = new Wall("carbide-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 96, Items.carbide, 96));
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

            shieldHealth = 600f;
            breakCooldown = 60f * 8f;
            regenSpeed = 2f;
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

            shieldHealth = 2200f;
            breakCooldown = 60f * 15f;
            regenSpeed = 2f;
        }};
        shieldedWallHuge = new ShieldWall("shielded-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 80, Items.surgeAlloy, 48, Items.beryllium, 48));
            consumePower(6f / 60f);

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            chanceDeflect = 8f;

            health = 260 * wallHealthMultiplier * 16;
            armor = 15f;
            size = 4;

            shieldHealth = 9000f;
            breakCooldown = 60f * 15f;
            regenSpeed = 2f;
        }};
    }
}
