package es.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Liquids;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.effect.MultiEffect;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.content.Items;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.consumers.ConsumeLiquid;
import mindustry.world.draw.DrawTurret;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class ESTurrets{
    public static Block
            cleft, rip, rupture, rift;

    public static void load(){

        cleft = new ItemTurret("cleft"){{
            requirements(Category.turret, with(Items.beryllium, 50, Items.graphite, 25));
            drawer = new DrawTurret("reinforced-");
            outlineColor = Pal.darkOutline;
            envEnabled |= Env.space;
            size = 1;
            scaledHealth = 180;
            rotateSpeed = 4f;

            Effect sfe = new MultiEffect(Fx.shootSmallColor, Fx.colorSpark);
            ammo(
                    Items.beryllium, new BasicBulletType(5.5f, 20){{
                        width = 7f;
                        hitSize = 4f;
                        height = 8f;
                        lifetime = 40;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootSmallSmoke;
                        ammoMultiplier = 1;
                        pierceCap = 2;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.berylShot;
                        frontColor = Color.white;
                        trailWidth = 0.8f;
                        trailLength = 6;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        buildingDamageMultiplier = 0.5f;
                    }}
            );

            shootSound = ESSounds.shootAltLight;
            recoil = 1f;

            reload = 40f;
            shootY = 0;
            targetUnderBlocks = false;
            shake = 0;
            ammoPerShot = 1;
            range = 190;
            shootCone = 3f;

            researchCostMultiplier = 0.05f;
            coolant = consume(new ConsumeLiquid(Liquids.water, 5f / 60f));
            coolantMultiplier = 6f;
            limitRange();
        }};
        rip = new ItemTurret("rip"){{
            requirements(Category.turret, with(Items.beryllium, 100, Items.silicon, 50, Items.graphite, 100));
            drawer = new DrawTurret("reinforced-");
            outlineColor = Pal.darkOutline;
            envEnabled |= Env.space;
            size = 2;
            scaledHealth = 180;
            rotateSpeed = 3f;

            Effect sfe = new MultiEffect(Fx.shootBigColor, Fx.colorSparkBig);
            ammo(
                    Items.beryllium, new BasicBulletType(7.5f, 40){{
                        width = 10f;
                        hitSize = 6f;
                        height = 14f;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 1;
                        pierceCap = 2;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.berylShot;
                        frontColor = Color.white;
                        trailWidth = 1.9f;
                        trailLength = 8;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        buildingDamageMultiplier = 0.4f;
                    }}
            );

            shootSound = Sounds.shootAlt;
            recoil = 1.5f;

            reload = 60f;
            shootY = 0;
            targetUnderBlocks = false;
            shake = 0.2f;
            ammoPerShot = 1;
            range = 190;
            shootCone = 3f;

            researchCostMultiplier = 0.05f;
            coolant = consume(new ConsumeLiquid(Liquids.water, 10f / 60f));
            coolantMultiplier = 6f;
            limitRange();
        }};
        rupture = new ItemTurret("rupture"){{
            requirements(Category.turret, with(Items.beryllium, 550, Items.silicon, 350, Items.tungsten, 200));
            drawer = new DrawTurret("reinforced-");
            outlineColor = Pal.darkOutline;
            envEnabled |= Env.space;
            size = 4;
            scaledHealth = 180;
            rotateSpeed = 1.5f;

            Effect sfe = new MultiEffect(Fx.shootBigColor, Fx.colorSparkBig);
            ammo(
                    Items.beryllium, new BasicBulletType(7.5f, 115){{
                        width = 14f;
                        hitSize = 8f;
                        height = 24f;
                        lifetime = 90;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 2;
                        pierceCap = 2;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.berylShot;
                        frontColor = Color.white;
                        trailWidth = 3f;
                        trailLength = 10;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        buildingDamageMultiplier = 0.3f;
                    }},
                    Items.tungsten, new BasicBulletType(8f, 135){{
                        width = 13f;
                        height = 19f;
                        hitSize = 7f;
                        lifetime = 90;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 1;
                        reloadMultiplier = 1f;
                        pierceCap = 3;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.tungstenShot;
                        frontColor = Color.white;
                        trailWidth = 3.1f;
                        trailLength = 16;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        rangeChange = 40f;
                        buildingDamageMultiplier = 0.3f;
                    }}
            );

            shootSound = Sounds.shootAlt;
            recoil = 2f;

            reload = 50f;
            shootY = 0;
            targetUnderBlocks = false;
            shake = 0;
            ammoPerShot = 3;
            range = 190;
            shootCone = 3f;

            researchCostMultiplier = 0.05f;
            coolant = consume(new ConsumeLiquid(Liquids.water, 5f / 60f));
            coolantMultiplier = 6f;
            limitRange();
        }};
        rift = new ItemTurret("rift"){{
            requirements(Category.turret, with(Items.beryllium, 2500, Items.silicon, 500, Items.graphite, 400, Items.carbide, 500));
            drawer = new DrawTurret("reinforced-");
            outlineColor = Pal.darkOutline;
            envEnabled |= Env.space;
            size = 5;
            scaledHealth = 180;
            rotateSpeed = 1.5f;

            Effect sfe = new MultiEffect(Fx.shootBigColor, Fx.colorSparkBig);
            ammo(
                    Items.beryllium, new BasicBulletType(7.5f, 245){{
                        width = 16f;
                        hitSize = 9f;
                        height = 30f;
                        lifetime = 120;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 1;
                        pierceCap = 2;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.berylShot;
                        frontColor = Color.white;
                        trailWidth = 3.5f;
                        trailLength = 10;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        buildingDamageMultiplier = 0.3f;
                    }},
                    Items.tungsten, new BasicBulletType(8f, 320){{
                        width = 18f;
                        hitSize = 9f;
                        height = 32f;
                        lifetime = 140;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 1;
                        reloadMultiplier = 1f;
                        pierceCap = 3;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.tungstenShot;
                        frontColor = Color.white;
                        trailWidth = 3.7f;
                        trailLength = 11;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        rangeChange = 40f;
                        buildingDamageMultiplier = 0.3f;
                    }},
                    Items.carbide, new BasicBulletType(7f, 420){{
                        width = 23f;
                        hitSize = 9f;
                        height = 40f;
                        lifetime = 160;
                        shootEffect = sfe;
                        smokeEffect = Fx.shootBigSmoke;
                        ammoMultiplier = 1;
                        reloadMultiplier = 1f;
                        pierceCap = 8;
                        pierce = true;
                        pierceBuilding = true;
                        hitColor = backColor = trailColor = Pal.tungstenShot;
                        frontColor = Color.white;
                        trailWidth = 4f;
                        trailLength = 10;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        rangeChange = 40f;
                        buildingDamageMultiplier = 0.5f;
                    }}
            );

            shootSound = ESSounds.shootAltHeavy;
            recoil = 2f;

            reload = 90f;
            shootY = 0;
            targetUnderBlocks = false;
            shake = 0;
            ammoPerShot = 1;
            range = 190;
            shootCone = 3f;

            researchCostMultiplier = 0.05f;
            coolant = consume(new ConsumeLiquid(Liquids.water, 5f / 60f));
            coolantMultiplier = 6f;
            limitRange();
        }};
    }
}
