package com.codingingdojo.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("-Bat flying noises-");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("The bat uh- nevermind.");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("-Fire noises-");
		this.energyLevel -= 100;
		return this;
	}

}
