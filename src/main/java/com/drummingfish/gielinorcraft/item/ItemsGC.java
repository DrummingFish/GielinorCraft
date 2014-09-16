package com.drummingfish.gielinorcraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsGC {

    /**
     * Melee
     */
    static ItemArmor.ArmorMaterial armourBRONZE = EnumHelper.addArmorMaterial("BRONZE", 20, new int[]{2, 7, 5, 3}, 11);
    static ItemArmor.ArmorMaterial armourIRON = EnumHelper.addArmorMaterial("IRON", 20, new int[]{1, 2, 2, 1}, 17);
    static ItemArmor.ArmorMaterial armourSTEEL = EnumHelper.addArmorMaterial("STEEL", 4, new int[]{0, 0, 0, 0}, 0);
    // Corrupt Vesta?
    // Corrupt Statius?
    static ItemArmor.ArmorMaterial armourINITIATE = EnumHelper.addArmorMaterial("INITIATE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBLACK = EnumHelper.addArmorMaterial("BLACK", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourWHITE = EnumHelper.addArmorMaterial("WHITE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMITHRIL = EnumHelper.addArmorMaterial("MITHRIL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourPROSELYTE = EnumHelper.addArmorMaterial("PROSELYTE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourELITEBLACK = EnumHelper.addArmorMaterial("ELITEBLACK", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourADAMANT = EnumHelper.addArmorMaterial("ADAMANT", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourRUNE = EnumHelper.addArmorMaterial("RUNE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDRAGONSTONE = EnumHelper.addArmorMaterial("DRAGONSTONE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourROCKSHELL = EnumHelper.addArmorMaterial("ROCKSHELL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourGRANITE = EnumHelper.addArmorMaterial("GRANITE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourCORRUPTDRAGON = EnumHelper.addArmorMaterial("CORRUPTDRAGON", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDRAGON = EnumHelper.addArmorMaterial("DRAGON", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourOBSIDIAN = EnumHelper.addArmorMaterial("OBSIDIAN", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourTAWARRIOR = EnumHelper.addArmorMaterial("TAWARRIOR", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBARROWS = EnumHelper.addArmorMaterial("BARROWS", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBANDOS = EnumHelper.addArmorMaterial("BANDOS", 25, new int[]{3, 7, 5, 3}, 12);
    // Vesta?
    // Statius?
    static ItemArmor.ArmorMaterial armourTORVA = EnumHelper.addArmorMaterial("TORVA", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourTETSU = EnumHelper.addArmorMaterial("TETSU", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBATTLEMAGE = EnumHelper.addArmorMaterial("BATTLEMAGE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourVANGUARD = EnumHelper.addArmorMaterial("VANGUARD", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMALEVOLENT = EnumHelper.addArmorMaterial("MALEVOLENT", 25, new int[]{3, 7, 5, 3}, 12);

    /**
     * Ranged
     */
    static ItemArmor.ArmorMaterial armourSOFTLEATHER = EnumHelper.addArmorMaterial("SOFTLEATHER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourHARDLEATHER = EnumHelper.addArmorMaterial("HARDLEATHER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSTUDDEDLEATHER = EnumHelper.addArmorMaterial("STUDDEDLEATHER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourFROGLEATHER = EnumHelper.addArmorMaterial("FROGLEATHER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourCARAPACE = EnumHelper.addArmorMaterial("CARAPACE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSNAKESKIN = EnumHelper.addArmorMaterial("SNAKESKIN", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourGREENDRAGONHIDE = EnumHelper.addArmorMaterial("GREENDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourVOIDKNIGHTRANGED = EnumHelper.addArmorMaterial("VOIDKNIGHTRANGED", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSPINED = EnumHelper.addArmorMaterial("SPINED", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSACREDCLAYRANGED = EnumHelper.addArmorMaterial("SACREDCLAYRANGED", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBLUEDRAGONHIDE = EnumHelper.addArmorMaterial("BLUEDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourREDDRAGONHIDE = EnumHelper.addArmorMaterial("REDDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBLACKDRAGONHIDE = EnumHelper.addArmorMaterial("BLACKDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBLESSEDDRAGONHIDE = EnumHelper.addArmorMaterial("BLESSEDDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDEMONSLAYER = EnumHelper.addArmorMaterial("DEMONSLAYER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourROYALDRAGONHIDE = EnumHelper.addArmorMaterial("ROYALDRAGONHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourTARANGER = EnumHelper.addArmorMaterial("TARANGER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourKARIL = EnumHelper.addArmorMaterial("KARIL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourARMADYL = EnumHelper.addArmorMaterial("ARMADYL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMORRIGAN = EnumHelper.addArmorMaterial("MORRIGAN", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourPERNIX = EnumHelper.addArmorMaterial("PERNIX", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDEATHLOTUS = EnumHelper.addArmorMaterial("DEATHLOTUS", 25, new int[]{3, 7, 5, 3}, 12);
    // Death Lotus Superior?
    static ItemArmor.ArmorMaterial armourSIRENIC = EnumHelper.addArmorMaterial("SIRENIC", 25, new int[]{3, 7, 5, 3}, 12);

    /**
     * Magic
     */
    static ItemArmor.ArmorMaterial armourFIRSTTOWER = EnumHelper.addArmorMaterial("FIRSTTOWER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourELEMENTAL = EnumHelper.addArmorMaterial("ELEMENTAL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourWIZARD = EnumHelper.addArmorMaterial("WIZARD", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMIND = EnumHelper.addArmorMaterial("MIND", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMYCELIUM = EnumHelper.addArmorMaterial("MYCELIUM", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourIMPHIDE = EnumHelper.addArmorMaterial("IMPHIDE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourHEXCREST = EnumHelper.addArmorMaterial("HEXCREST", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourCOMBATROBES = EnumHelper.addArmorMaterial("COMBATROBES", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDRUIDICMAGE = EnumHelper.addArmorMaterial("DRUIDICMAGE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSPIDERSILK = EnumHelper.addArmorMaterial("SPIDERSILK", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourFUNGAL = EnumHelper.addArmorMaterial("FUNGAL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourMYSTIC = EnumHelper.addArmorMaterial("MYSTIC", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBODY = EnumHelper.addArmorMaterial("BODY", 25, new int[]{3, 7, 5, 3}, 12);
    // Healer Hat?
    static ItemArmor.ArmorMaterial armourCOSMIC = EnumHelper.addArmorMaterial("COSMIC", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourENCHANTED = EnumHelper.addArmorMaterial("ENCHANTED", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDAGONHAI = EnumHelper.addArmorMaterial("DAGONHAI", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourNECROMANCER = EnumHelper.addArmorMaterial("NECROMANCER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSPLITBARK = EnumHelper.addArmorMaterial("SPLITBARK", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourVOIDKNIGHTMAGE = EnumHelper.addArmorMaterial("VOIDKNIGHTMAGE", 25, new int[]{3, 7, 5, 3}, 12);
    // Farseer Helm?
    static ItemArmor.ArmorMaterial armourCHAOS = EnumHelper.addArmorMaterial("CHAOS", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSKELETAL = EnumHelper.addArmorMaterial("SKELETAL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBATWING = EnumHelper.addArmorMaterial("BATWING", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSACREDCLAYMAGE = EnumHelper.addArmorMaterial("SACREDCLAYMAGE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourINFINITY = EnumHelper.addArmorMaterial("INFINITY", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourDRAGONBONE = EnumHelper.addArmorMaterial("DRAGONBONE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourBATTLE = EnumHelper.addArmorMaterial("BATTLE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourGRIFOLIC = EnumHelper.addArmorMaterial("GRIFOLIC", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourGOD = EnumHelper.addArmorMaterial("GOD", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourLUNAR = EnumHelper.addArmorMaterial("LUNAR", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourTAMAGE = EnumHelper.addArmorMaterial("TAMAGE", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourAHRIM = EnumHelper.addArmorMaterial("AHRIM", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSUBJUGATION = EnumHelper.addArmorMaterial("SUBJUGATION", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourGANODERMIC = EnumHelper.addArmorMaterial("GANODERMIC", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourZURIEL = EnumHelper.addArmorMaterial("ZURIEL", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourVIRTUS = EnumHelper.addArmorMaterial("VIRTUS", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourHYBRID = EnumHelper.addArmorMaterial("HYBRID", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourSEASINGER = EnumHelper.addArmorMaterial("SEASINGER", 25, new int[]{3, 7, 5, 3}, 12);
    static ItemArmor.ArmorMaterial armourTECTONIC = EnumHelper.addArmorMaterial("TECTONIC", 25, new int[]{3, 7, 5, 3}, 12);

    static ItemTool.ToolMaterial toolPERMAICE = EnumHelper.addToolMaterial("PERMAICE", 2, 500, 7F, 3, 9);

    public static Item bronzeFullHelm;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeSkirt;
    public static Item bronzeBoots;

    public static void init() {
        bronzeFullHelm = new ItemArmors(armourBRONZE, 5, 0).setUnlocalizedName(ItemInfo.BRONZE_FULL_HELM_UNLOCALIZED_NAME);
        bronzeChestplate = new ItemArmors(armourBRONZE, 5, 1).setUnlocalizedName(ItemInfo.BRONZE_BODY_UNLOCALIZED_NAME);
        bronzeLeggings = new ItemArmors(armourBRONZE, 5, 2).setUnlocalizedName(ItemInfo.BRONZE_LEGS_UNLOCALIZED_NAME);
        bronzeSkirt = new ItemArmors(armourBRONZE, 5, 2).setUnlocalizedName(ItemInfo.BRONZE_SKIRT_UNLOCALIZED_NAME);
        bronzeBoots = new ItemArmors(armourBRONZE, 5, 3).setUnlocalizedName(ItemInfo.BRONZE_BOOTS_UNLOCALIZED_NAME);

        GameRegistry.registerItem(bronzeFullHelm, ItemInfo.BRONZE_FULL_HELM_KEY);
        GameRegistry.registerItem(bronzeChestplate, ItemInfo.BRONZE_BODY_KEY);
        GameRegistry.registerItem(bronzeLeggings, ItemInfo.BRONZE_LEGS_KEY);
        GameRegistry.registerItem(bronzeSkirt, ItemInfo.BRONZE_SKIRT_KEY);
        GameRegistry.registerItem(bronzeBoots, ItemInfo.BRONZE_BOOTS_KEY);
    }
	
	public static void oreRegistration() {
    }
}
