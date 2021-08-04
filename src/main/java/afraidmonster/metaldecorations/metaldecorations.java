package afraidmonster.metaldecorations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class metaldecorations implements ModInitializer {

	public static final String MOD_ID = "metaldecorations";

	public static final ItemGroup METAL_DOORS = FabricItemGroupBuilder.create(
            new Identifier("metaldecorations", "metal_decorations"))
            .icon(() -> new ItemStack(metaldecorations.GOLD_DOOR)) 
            .build();
	
	public static final Block GOLD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block GOLD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block DIAMOND_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block DIAMOND_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block LAPIS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block LAPIS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block COPPER_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block COPPER_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block NETHERITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block NETHERITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block EMERALD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block EMERALD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block REDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block REDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	public static final Block COAL_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR));
	public static final Block COAL_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR));
	
	
	
	
	@Override
	public void onInitialize() {
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_door"), GOLD_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_door"), new BlockItem(GOLD_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_trapdoor"), GOLD_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_trapdoor"), new BlockItem(GOLD_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_door"), DIAMOND_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_door"), new BlockItem(DIAMOND_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_trapdoor"), DIAMOND_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_trapdoor"), new BlockItem(DIAMOND_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_trapdoor"), LAPIS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_trapdoor"), new BlockItem(LAPIS_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_door"), LAPIS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_door"), new BlockItem(LAPIS_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_trapdoor"), COPPER_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_trapdoor"), new BlockItem(COPPER_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_door"), COPPER_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_door"), new BlockItem(COPPER_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_door"), NETHERITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_door"), new BlockItem(NETHERITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_trapdoor"), NETHERITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_trapdoor"), new BlockItem(NETHERITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_door"), EMERALD_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_door"), new BlockItem(EMERALD_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_trapdoor"), EMERALD_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_trapdoor"), new BlockItem(EMERALD_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_door"), REDSTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_door"), new BlockItem(REDSTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_trapdoor"), REDSTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_trapdoor"), new BlockItem(REDSTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_door"), COAL_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_door"), new BlockItem(COAL_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_trapdoor"), COAL_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_trapdoor"), new BlockItem(COAL_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		
		







		
	}

	}

