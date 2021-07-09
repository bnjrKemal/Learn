package com.bnjrKemal.Packet;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.apache.commons.lang3.EnumUtils;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_16_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle.EnumTitleAction;

public class PacketMain extends JavaPlugin{

	@Override
	public void onEnable() {
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, int ArrayList) {
		
		if(cmd.getName().equalsIgnoreCase("packets")) {
		
			if(!(sender instanceof Player)) {
				System.out.println("Bu komut oyun içinde geçerlidir.");
				return true;
			}
			
			if(!EnumUtils.isValidEnum(EnumTitleAction.class, args[0].toUpperCase())) {
				sender.sendMessage(ChatColor.RED + "Böyle bir paket bulunamadý: ");
				for(EnumTitleAction action : EnumTitleAction.values()) {
					sender.sendMessage(ChatColor.GREEN + "-> " + action.toString());
				}
				sender.sendMessage(ChatColor.RED + "--------------------------");
				return true;
			}
						
			StringBuilder message = new StringBuilder();
			String messageR = null;
			int x = 0;
			for(String msg : args) {
				if(x == 0) { x++; continue; }
				message.append(msg).append("");
				messageR = message.toString();
			}
			
			if(messageR == null) {
				sender.sendMessage(ChatColor.RED + "/packet <packet> <texts>");
				return true;
			}
			
			EnumTitleAction action = EnumTitleAction.valueOf(args[0].toUpperCase());
			
			PacketPlayOutTitle packet = new PacketPlayOutTitle(
						action,
						ChatSerializer.a("{\"text\":\"" + messageR+ "\"}"),
						20, 100, 20);
			
			((CraftPlayer) sender).getHandle().playerConnection.sendPacket(packet);
		}
		return true;
	}
	
}
