package geometricshape;

public class Circle {
	private double xC;
	private double yC;
	private double r;
	
	
	public double getxC() {
		return xC;
	}
	
	public void setxC(double xC) {
		this.xC = xC;
	}
	
	public double getyC() {
		return yC;
	}
	
	public void setyC(double yC) {
		this.yC = yC;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		this.r = r;
	}
	public double getXMin(){
		return this.xC-this.r;
		
	}
	public double getYMin(){
		return this.yC-this.r;
		
	}
	
	public double getXMax(){
		return this.xC+this.r;
		
	}
	
	public double getYMax(){
		return this.yC+this.r;
		
	}
	
	public boolean contains(){
		boolean s=false;
		
	}
}
