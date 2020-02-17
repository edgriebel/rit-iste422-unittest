package edu.rit.iste422.unittests;

class Circle extends Shape {
	protected float r;
	public Circle(float x, float y, float r) { super(x, y); this.r = r; }
	public float area() { return r * r * (float) Math.PI; }
	public void resize(float l, float w) { /* ??? */ }
	public void draw(Viewport v) { System.out.println(this); }
	public void move(float x, float y) { this.x += x; this.y += y; }
}

