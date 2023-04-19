package com.rcm.simplilearn.mavenproject;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Hello World! " + i);
			if (i % 2 == 0) continue;
			System.out.println("");
		}
		// System.out.println("Hello World!" + 2 % 2);
		multiply(new int[] { 2, 3 });

		// Demonstration of java pass by value
		Circle myCircle = new Circle(2, 3, 4);
		System.out.printf("\nBefore method call x:%d, y:%d, Radius:%d", myCircle.getX(), myCircle.getY(), myCircle.getRadius());
		moveCircle(myCircle, 5, 6);
		/*
		 * Even though the circle has been changed inside moveCircle(..)
		 * the original myCircle is still referring to the the original circle
		 */
		System.out.printf("\nAfter method call x:%d, y:%d, Radius:%d", myCircle.getX(), myCircle.getY(), myCircle.getRadius());

		// now try assigning returned circle to original circle see how the values changed.
		/*
		 * The reason being the moveCircle(...) returned new Circle object and
		 * that new Circle object is assigned to original myCircle.
		 * Which means the reference of original myCircle
		 * has been moved to point new Circle object in memory.
		 */
		myCircle = moveCircle(myCircle, 5, 6);
		System.out.printf("\nAfter method call x:%d, y:%d, Radius:%d", myCircle.getX(), myCircle.getY(), myCircle.getRadius());
	}

	public static void multiply(int... values) {
		int result = values[0] * values[1];
		System.out.printf(".... Result: %d", result);
	}

	public static Circle moveCircle(Circle myCircle, int deltaX, int deltaY) {
		myCircle.setX(deltaX);
		myCircle.setY(deltaY);

		myCircle = new Circle(0, 0, 3);
		return myCircle;

	}
}
