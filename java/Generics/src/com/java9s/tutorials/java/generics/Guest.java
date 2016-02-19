package com.java9s.tutorials.java.generics;

public class Guest {
	public static void main(String[] args) {
		Glass<Juice> g = new Glass<Juice>();
		Juice juice = new Juice();
		g.liquid = juice;
		
		
		Glass<Water> waterGlass = new Glass<Water>();
		waterGlass.liquid = new Water();
		//retrieve
		Juice j = g.liquid;
		
		Water water = waterGlass.liquid;

		Color<Red, Green, Blue> color = new Color<Red, Green, Blue>();
		Red red = new Red();
		Bartender bartender = new Bartender();
		bartender.<Juice, Water>mix(juice, water);
		
	}
}
