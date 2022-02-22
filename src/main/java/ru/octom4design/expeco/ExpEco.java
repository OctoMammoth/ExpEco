package ru.octom4design.expeco;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.octom4design.expeco.block.BlockExchanger;
import ru.octom4design.expeco.blockentity.ExchangerBlockEntity;

public class ExpEco implements ModInitializer {
	public static final String modid = "expeco";

	public static Identifier id(String id) {
		return new Identifier(modid, id);
	}
	
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(id("general"), () -> new ItemStack(Blocks.GLASS));
	
	public static final Logger LOGGER = LoggerFactory.getLogger(modid);
	
	public static BlockExchanger exchanger = new BlockExchanger();
	
	public static BlockEntityType<ExchangerBlockEntity> exchangerBlockEntity;

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK_ENTITY_TYPE, id("exchanger"),
				FabricBlockEntityTypeBuilder.create(ExchangerBlockEntity::new, exchanger).build(null));
		Registry.register(Registry.ITEM, id("exchanger"), new BlockItem(exchanger, new Item.Settings().group(ITEM_GROUP)));

		LOGGER.info("Hello Fabric world!");
	}

}
