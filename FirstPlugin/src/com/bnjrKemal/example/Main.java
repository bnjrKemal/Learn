package com.bnjrKemal.example;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
//import org.bukkit.Material;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
//import org.bukkit.entity.Creeper;
//import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
//import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.EulerAngle;
//import org.bukkit.util.Vector;

public class Main extends JavaPlugin implements Listener{
	
	BossBar bossBar;
	
	@Override
	public void onEnable() {
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		getCommand("food").setExecutor(new FoodCommand());
		getCommand("args").setExecutor(new ArgsCommand());
		getCommand("xholo").setExecutor(new HoloListener());
		getCommand("xtest").setExecutor(new ModerationTools());
		getCommand("xvanish").setExecutor(new VanishCommand());

		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new ServerPing(), this);
		Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
		Bukkit.getPluginManager().registerEvents(new FireWorkClass(), this);
		Bukkit.getPluginManager().registerEvents(new Toggling(), this);
		Bukkit.getPluginManager().registerEvents(new MapModification(), this);
		Bukkit.getPluginManager().registerEvents(new InteractEvent(), this);
		Bukkit.getPluginManager().registerEvents(new ProjectileEvent(), this);
		Bukkit.getPluginManager().registerEvents(new SoundsClass(), this);
		Bukkit.getPluginManager().registerEvents(new RunnableServer(this), this);
		Bukkit.getPluginManager().registerEvents(new SignListener(), this);
		Bukkit.getPluginManager().registerEvents(new TargetBlockChange(), this);
		getCommand("skull").setExecutor(new SkullCommand());
		
		bossBar = Bukkit.createBossBar(
				ChatColor.RED + "Welcome to the best server ever!",
				BarColor.PINK, BarStyle.SOLID);
				
		spawnStand(new Location(Bukkit.getWorld("world"), 0, 5, 0));
	}
	
	public static void data() {
		
		for(DataTypes x : DataTypes.values()) {
			
			if(x.number == 6) System.out.println("Rütben :" + x.name);
			
			System.out.println(x.name + " " + x.number);
		}
	}
	
	public static void main(String[] args) {
		data();
	}
	
	public void spawnStand(Location location) {
		ArmorStand stand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
		
		stand.setSmall(true);
		stand.setBasePlate(false);
		stand.setArms(true);
	
		stand.setGravity(true);
//		stand.setInvulnirable();
//		stand.setCustomName("Some stupid name");
//		stand.setCustomNameVisible(true);
//		stand.setVisible(true);
//		
//		stand.setHelmet(new ItemStack(Material.DIAMOND_HELMET));
//		stand.setChestplate(new ItemStack(Material.GOLD_HELMET));
//		stand.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
//		stand.setBoots(new ItemStack(Material.LEATHER_BOOTS));
		
		stand.setHeadPose(new EulerAngle(Math.toRadians(52), Math.toRadians(142), Math.toRadians(81)));
//		stand.setBodyPose(null);
//		stand.setLeftArmPose(null);
//		stand.setRightArmPose(null);
//		stand.setLeftLegPose(null);
//		stand.setRightLegPose(null);

	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			System.out.println("Bu komut sadece oyuncular içindir!");
			return false;
		}
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("health")) {
			player.setHealth(20.0);
			player.sendMessage(ChatColor.GREEN + "Canlandýn!");
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("config")) {

			String string = this.getConfig().getString("string");
			String string2 = this.getConfig().getString("string2");
			int integer = this.getConfig().getInt("integer");
			double db = this.getConfig().getDouble("db");
			long lng = this.getConfig().getLong("long");
			
			player.sendMessage(ChatColor.RED + " String: " + string + ". String2: " + string2 + ". integer: " + integer
					+ ". double: " + db + ". char: " + lng );
			if(player.hasPermission("permission")) {
				System.out.println(player.getName() + " permission'a sahip");
			}else {
				System.out.println(player.getName() + " permission'a sahip deðil.");
			}
			return true;
		}
		return false;
	}
	
	@EventHandler
	public void onMove(BlockBreakEvent e) {
		
		Player player = e.getPlayer();
		player.sendMessage(ChatColor.GREEN + " Bir blok kýrdýn. Kýrdýðýn blok: " + e.getBlock().getType().toString());
		player.giveExp(1);
		player.sendMessage(ChatColor.YELLOW + " 1 Exp kazandýn! Kýrmaya devam!");
		
	}

	@EventHandler
	public void entity(EntityDamageEvent e) {
		e.getEntity().remove();
//		Entity ent = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 0, 0, 0), EntityType.CHICKEN);
		
//		Creeper creeper = (Creeper) ent;
//		
//		creeper.setPowered(true);
//		creeper.setCustomName("bnjrKemal");
//		creeper.getEyeLocation().setDirection(new Vector(1, 0, 3));
		
	}
	
}
