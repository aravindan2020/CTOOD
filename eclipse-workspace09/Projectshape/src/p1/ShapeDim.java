package p1;

public class ShapeDim {
	private double r,h;
	private int s;
	private float l,b;
	double findArea(double r) {
	this.r=r;
	return Math.PI*this.r*this.r;
	}
	int findArea(int s) {
	this.s=s;
	return this.s*this.s;
	}
	float findArea(float l,float b) {
	this.l=l;
	this.b=b;
	return this.l*this.b;
	}
	double findArea(double b,double h) {
	this.r=b;
	this.h=h;
	return this.b*this.h*0.5;
	}

}
