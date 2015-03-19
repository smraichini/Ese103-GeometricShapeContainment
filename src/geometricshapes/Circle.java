package geometricshapes;

public class Circle extends GeometricShape {
	
	private double xC;
	private double yC;
	private double r;
	
	
	public double getXC() {
		return xC;
	}
	
	public void setXC(double xC) {
		this.xC = xC;
	}
	
	public double getYC() {
		return yC;
	}
	
	public void setYC(double yC) {
		this.yC = yC;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		if(r>0){
			
			this.r = r;
		
		}
		else{
			
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
			
		}
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
	
	@Override
	public double getXMin(){
		return this.xC-this.r;
		
	}
	
	@Override
	public double getYMin(){
		return this.yC-this.r;
		
	}
	
	@Override
	public double getXMax(){
		return this.xC+this.r;
		
	}
	
	@Override
	public double getYMax(){
		return this.yC+this.r;
		
	}
	
	
	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

}




