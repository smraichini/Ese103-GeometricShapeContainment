package geometricshapes;

public class Triangle extends GeometricShape{
	
	private double xV;
	private double yV;
	private double l;
	
	public double getXV() {
		return xV;
	}
	
	public void setXV(double xV) {
		this.xV = xV;
	}
	
	public double getYV() {
		return yV;
	}
	
	public void setYV(double yV) {
		this.yV = yV;
	}
	
	public double getL() {
		return l;
	}
	
	public void setL(double l) {
		if(l>0){
			this.l = l;
			}
			else{
				throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
			}
	}
	
	public Triangle(double xV, double yV, double l) {
		this.xV = xV;
		this.yV = yV;
		if(l>0){
		this.l = l;
		}
		else{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	
	@Override
	public double getXMin(){
		return this.xV;
		
	}
	
	@Override
	public double getYMin(){
		return this.yV;
		
	}
	
	@Override
	public double getXMax(){
		return this.xV+this.l;
		
	}
	
	@Override
	public double getYMax(){
		return this.yV+l*Math.sqrt(3)/2;
		
	}
	
	
	@Override
	public String toString() {
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}
}