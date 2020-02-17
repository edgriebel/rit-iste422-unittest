package edu.rit.iste422.unittests;

class Rectangle extends Shape {
	public Rectangle(float x, float y, float l, float w) { 
		super(x, y); this.l = l; this.w = w; }
	public float area() { return l * w; }
	public void move(float x, float y) { this.x += x; this.y += y; }
	public void resize(float l, float w) { this.l *= l; this.w *= w; }
	public void draw(Viewport v) { System.err.println(this); }
}

