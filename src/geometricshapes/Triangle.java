




package geometricshapes;

public class Triangle {
	@Override
	public String toString() {
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

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
	
	public double getXMin(){
		return this.xV;
		
	}
	public double getYMin(){
		return this.yV;
		
	}
	
	public double getXMax(){
		return this.xV+this.l;
		
	}
	
	public double getYMax(){
		return this.yV+l*Math.sqrt(3)/2;
		
	}
	
	public boolean contains(Triangle x){
		boolean s=false;
		if(this.getXMin()<=x.getXMin() && this.getYMin()<=x.getYMin() && this.getXMax()>=x.getXMax() && this.getYMax()>=x.getYMax()){
			s=true;			
		}
		return s;
	}
	
	public boolean contains(Circle y){
		boolean s=false;
		if(this.getXMin()<=y.getXMin() && this.getYMin()<=y.getYMin() && this.getXMax()>=y.getXMax() && this.getYMax()>=y.getYMax()){
			s=true;			
		}
		return s;
	}
}