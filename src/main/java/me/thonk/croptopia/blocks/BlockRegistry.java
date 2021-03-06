package me.thonk.croptopia.blocks;

import me.thonk.croptopia.generator.CroptopiaSaplingGenerator;
import me.thonk.croptopia.generator.GeneratorRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static me.thonk.croptopia.Croptopia.*;

public class BlockRegistry {
    public static Block artichokeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block asparagusCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block barleyCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block basilCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block bellPepperCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blackBeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blackberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blueberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block broccoliCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cabbageCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cantaloupeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cauliflowerCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block celeryCropBlock = new CroptopiaCropBlock(createCropSettings());
    //public static Block chivesCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block coffeeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cornCropBlock = new CornCropBlock(createCropSettings());
    public static Block cranberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cucumberCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block currantCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block eggplantCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block elderberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block garlicCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block gingerCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block grapeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block greenBeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block greenOnionCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block honeydewCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block hopsCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block kaleCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block kiwiCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block leekCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block lettuceCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block mustardCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block oatCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block oliveCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block onionCropBlock = new CroptopiaCropBlock(createCropSettings());
    //public static Block paprikaCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block peanutCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block chilePepperCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block pineappleCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block radishCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block raspberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block rhubarbCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block riceCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block rutabagaCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block saguaroCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block soybeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block spinachCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block squashCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block strawberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block sweetPotatoCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block tomatilloCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block tomatoCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block turmericCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block turnipCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block yamCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block zucchiniCropBlock = new CroptopiaCropBlock(createCropSettings());



    // tree
    public static Block vanillaCropBlock;
    // real block
    public static Block salt = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(0.5F).sounds(BlockSoundGroup.SAND));


    public static Block appleSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.APPLE_TREE), createSaplingSettings());
    public static Block bananaSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.BANANA_TREE), createSaplingSettings());
    public static Block orangeSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.ORANGE_TREE), createSaplingSettings());
    public static Block persimmonSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PERSIMMON_TREE), createSaplingSettings());
    public static Block plumSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PLUM_TREE), createSaplingSettings());
    public static Block cherrySaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.CHERRY_TREE), createSaplingSettings());
    public static Block lemonSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.LEMON_TREE), createSaplingSettings());
    public static Block grapefruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.GRAPEFRUIT_TREE), createSaplingSettings());
    public static Block kumquatSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.KUMQUAT_TREE), createSaplingSettings());
    public static Block peachSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PEACH_TREE), createSaplingSettings());
    public static Block coconutSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.COCONUT_TREE), createSaplingSettings());
    public static Block nutmegSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.NUTMEG_TREE), createSaplingSettings());
    public static Block figSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.FIG_TREE), createSaplingSettings());
    public static Block nectarineSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.NECTARINE_TREE), createSaplingSettings());
    public static Block mangoSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.MANGO_TREE), createSaplingSettings());
    public static Block dragonFruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.DRAGON_FRUIT_TREE), createSaplingSettings());
    public static Block starFruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.STAR_FRUIT_TREE), createSaplingSettings());
    public static Block avocadoSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.AVOCADO_TREE), createSaplingSettings());
    public static Block apricotSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.APRICOT_TREE), createSaplingSettings());
    public static Block pearSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PEAR_TREE), createSaplingSettings());
    public static Block limeSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.LIME_TREE), createSaplingSettings());
    public static Block dateSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.DATE_TREE), createSaplingSettings());

    public static void init() {
        registerBlock("salt_ore", salt);

        registerBlock("artichoke_crop", artichokeCropBlock);
        registerBlock("asparagus_crop", asparagusCropBlock);
        registerBlock("barley_crop", barleyCropBlock);
        registerBlock("basil_crop", basilCropBlock);
        registerBlock("bellpepper_crop", bellPepperCropBlock);
        registerBlock("blackbean_crop", blackBeanCropBlock);
        registerBlock("blackberry_crop", blackberryCropBlock);
        registerBlock("blueberry_crop", blueberryCropBlock);
        registerBlock("broccoli_crop", broccoliCropBlock);
        registerBlock("cabbage_crop", cabbageCropBlock);
        registerBlock("cantaloupe_crop",cantaloupeCropBlock);
        registerBlock("cauliflower_crop", cauliflowerCropBlock);
        registerBlock("celery_crop", celeryCropBlock);
        //registerBlock("chives_crop", chivesCropBlock);
        registerBlock("coffee_crop", coffeeCropBlock);
        registerBlock("corn_crop", cornCropBlock);
        registerBlock("cranberry_crop", cranberryCropBlock);
        registerBlock("cucumber_crop", cucumberCropBlock);
        registerBlock("currant_crop", currantCropBlock);
        registerBlock("eggplant_crop", eggplantCropBlock);
        registerBlock("elderberry_crop", elderberryCropBlock);
        registerBlock("garlic_crop", garlicCropBlock);
        registerBlock("ginger_crop", gingerCropBlock);
        registerBlock("grape_crop", grapeCropBlock);
        registerBlock("greenbean_crop", greenBeanCropBlock);
        registerBlock("greenonion_crop", greenOnionCropBlock);
        registerBlock("honeydew_crop", honeydewCropBlock);
        registerBlock("hops_crop", hopsCropBlock);
        registerBlock("kale_crop", kaleCropBlock);
        registerBlock("kiwi_crop", kiwiCropBlock);
        registerBlock("leek_crop", leekCropBlock);
        registerBlock("lettuce_crop", lettuceCropBlock);
        registerBlock("mustard_crop", mustardCropBlock);
        registerBlock("oat_crop", oatCropBlock);
        registerBlock("olive_crop", oliveCropBlock);
        registerBlock("onion_crop", onionCropBlock);
        //registerBlock("paprika_crop", paprikaCropBlock);
        registerBlock("peanut_crop", peanutCropBlock);
        registerBlock("chile_pepper_crop", chilePepperCropBlock);
        registerBlock("pineapple_crop", pineappleCropBlock);
        registerBlock("radish_crop", radishCropBlock);
        registerBlock("raspberry_crop", raspberryCropBlock);
        registerBlock("rhubarb_crop", rhubarbCropBlock);
        registerBlock("rice_crop", riceCropBlock);
        registerBlock("rutabaga_crop", rutabagaCropBlock);
        registerBlock("saguaro_crop", saguaroCropBlock);
        registerBlock("soybean_crop", soybeanCropBlock);
        registerBlock("spinach_crop", spinachCropBlock);
        registerBlock("squash_crop", squashCropBlock);
        registerBlock("strawberry_crop", strawberryCropBlock);
        registerBlock("sweetpotato_crop", sweetPotatoCropBlock);
        registerBlock("tomatillo_crop", tomatilloCropBlock);
        registerBlock("tomato_crop", tomatoCropBlock);
        registerBlock("turmeric_crop", turmericCropBlock);
        registerBlock("turnip_crop", turnipCropBlock);
        registerBlock("yam_crop", yamCropBlock);
        registerBlock("zucchini_crop", zucchiniCropBlock);

        registerBlock("apple_sapling", appleSaplingBlock);
        registerBlock("banana_sapling", bananaSaplingBlock);
        registerBlock("orange_sapling", orangeSaplingBlock);
        registerBlock("persimmon_sapling", persimmonSaplingBlock );
        registerBlock("plum_sapling", plumSaplingBlock);
        registerBlock("cherry_sapling", cherrySaplingBlock);
        registerBlock("lemon_sapling", lemonSaplingBlock);
        registerBlock("grapefruit_sapling", grapefruitSaplingBlock);
        registerBlock("kumquat_sapling", kumquatSaplingBlock);
        registerBlock("peach_sapling", peachSaplingBlock);
        registerBlock("coconut_sapling", coconutSaplingBlock);
        registerBlock("nutmeg_sapling", nutmegSaplingBlock);
        registerBlock("fig_sapling", figSaplingBlock);
        registerBlock("nectarine_sapling", nectarineSaplingBlock);
        registerBlock("mango_sapling", mangoSaplingBlock);
        registerBlock("dragonfruit_sapling", dragonFruitSaplingBlock);
        registerBlock("starfruit_sapling", starFruitSaplingBlock);
        registerBlock("avocado_sapling", avocadoSaplingBlock);
        registerBlock("apricot_sapling", apricotSaplingBlock);
        registerBlock("pear_sapling", pearSaplingBlock);
        registerBlock("lime_sapling", limeSaplingBlock);
        registerBlock("date_sapling", dateSaplingBlock);

    }
}
