package com.revature.AnimalAssignment;

public interface Animal {
	String picture = "picture";
	String food = "food";
	String hunger = "hunger";
	String boundaries = "boundaries";
	String location = "location";
	
	
	String makeNoise();
	String eat();
	String sleep();
	String roam();

}
