package com.william.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

	private Main main;
	
	public BlockListener(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		
		//When wool is placed, it is replaced with lava:
		if (e.getBlockPlaced().getType().equals(Material.WOOL)) {
			e.getBlockPlaced().setType(Material.LAVA);
		}
	}
	
}
