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
		if(r>0){
		
			this.r = r;
		
		}
		else{
			
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
			
		}
		
		
		
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
	
	public boolean contains(Circle x){
		boolean s=false;
		if(this.getXMin()<=x.getXMin() && this.getYMin()<=x.getYMin() && this.getXMax()>=x.getXMax() && this.getYMax()>=x.getYMax()){
			s=true;			
		}
		return s;
	}
	
	public boolean contains(Triangle y){
		boolean s=false;
		if(this.getXMin()<=y.getXMin() && this.getYMin()<=y.getYMin() && this.getXMax()>=y.getXMax() && this.getYMax()>=y.getYMax()){
			s=true;			
		}
		return s;
	}
	
	
}
