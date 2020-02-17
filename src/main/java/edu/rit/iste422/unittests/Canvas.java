package edu.rit.iste422.unittests;

public class Canvas implements Viewport {
	java.util.List<Shape> shapes = new java.util.ArrayList<>();
	public void add(Shape s) { shapes.add(s); }
	public void draw() { for (Shape s : shapes) { s.draw(this); } }
}
