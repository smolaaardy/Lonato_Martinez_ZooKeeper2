package com.codingingdojo.zookeeper;

public class Mammal {
	public int energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public int displayEnergy() {
		System.out.println("Current energy is: " + this.energyLevel);
		return this.energyLevel;
	}
}
