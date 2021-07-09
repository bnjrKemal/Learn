package com.bnjrKemal.example;

public enum DataTypes {

	INT("first", 1),
	STRING("second", 2),
	DOUBLE("third", 3),
	SHORT("forth",4),
	BYTE("fiveth", 5),
	BOOLEAN("sixth", 6),
	FLOAT("seventh", 7),
	CHAR("eighth", 8);
	
	String name;
	int number;
	
	private DataTypes(String name, int number) {
		this.name = name;
		this.number = number;
	}	
}
