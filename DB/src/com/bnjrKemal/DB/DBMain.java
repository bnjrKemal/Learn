package com.bnjrKemal.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.plugin.java.JavaPlugin;

public class DBMain extends JavaPlugin {

	private Connection connection;
	private String host, database, username, password;
	private int port;
	
	@Override
	public void onEnable() {
		
		MongoClient
		
		/*
		try {
			openConnection();
			System.out.println("Connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
	}
	
	private void openConnection() throws SQLException {
		if(connection != null && !connection.isClosed()) {
			return;
		}
		
		host = "localhost";
		port = 3306;
		database = "example db";
		username = "root";
		password = "Bacon123!.";
		
		connection = DriverManager.getConnection(
				"jdbc:mysql://" + 
						this.host + ":" + 
						this.port + "/" + 
						this.database, 
						this.username, 
						this.password);
	}
	
}
