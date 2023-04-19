package com.rcm.simplilearn.mavenproject;

public class Circle {

	private int x, y, radius;

	public Circle(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.radius = rad;
	}

	public void setOrigin(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
