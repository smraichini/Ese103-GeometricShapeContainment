package geometricshape;

public class Triangle {
	private double xC;
	private double yC;
	private double l;
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
	
	public double getL() {
		return l;
	}
	
	public void setL(double l) {
		this.l = l;
	}
	
	public Triangle(double xC, double yC, double l) {
		this.xC = xC;
		this.yC = yC;
		if(l>0){
		this.l = l;
		}
		else{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	
	public double getXMin(){
		return this.xC;
		
	}
	public double getYMin(){
		return this.yC;
		
	}
	
	public double getXMax(){
		return this.xC+this.l;
		
	}
	
	public double getYMax(){
		return this.yC+l*Math.sqrt(3)/2;
		
	}
	
	public boolean contains(Triangle x){
		boolean s=false;
		if(this.getXMin()<=x.getXMin() && this.getYMin()<=x.getYMin() && this.getXMax()>=x.getXMax() && this.getYMax()>=x.getYMax()){
			s=true;			
		}
		return s;
	}
	
}
