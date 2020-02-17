package edu.rit.iste422.unittests;

abstract class Shape {
	protected Shape(float x, float y) { this.x = x; this.y = y; }
	public abstract void draw(Viewport v);
	public abstract float area();
	public abstract void move(float x, float y);
	public abstract void resize(float l, float w);
	public String toString() {
		return String.format("%s: size %8.2f x %8.2f, location (%8.2f,%8.2f)",
			this.getClass().getSimpleName(), l, w, x, y); }
	protected float x, y, l, w;
}

