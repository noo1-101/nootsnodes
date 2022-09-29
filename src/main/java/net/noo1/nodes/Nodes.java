package net.noo1.nodes;

import net.fabricmc.api.ModInitializer;
import net.noo1.nodes.block.ModBlocks;
import net.noo1.nodes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nodes implements ModInitializer {
	public static final String MOD_ID = "nodes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
