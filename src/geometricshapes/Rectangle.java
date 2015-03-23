package geometricshapes;

public class Rectangle extends GeometricShape {
	
	private double xV;
	private double yV;
	private double xSideLength;
	private double ySideLength;
	
	
	public Rectangle(double xV, double yV, double xSideLength,
			double ySideLength) {
		super();
		this.xV = xV;
		this.yV = yV;
		if(xSideLength>0 && ySideLength>0){
			this.xSideLength = xSideLength;
			this.ySideLength = ySideLength;
		}
		else
		{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}

	public double getxV() {
		return xV;
	}

	public void setxV(double xV) {
		this.xV = xV;
	}

	public double getyV() {
		return yV;
	}

	public void setyV(double yV) {
		this.yV = yV;
	}

	public double getxSideLength() {
		return xSideLength;
	}

	public void setxSideLength(double xSideLength) {
		if(xSideLength>0){
			
			this.xSideLength = xSideLength;
			
		}
		else{
		
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}

	public double getySideLength() {
		return ySideLength;
	}

	public void setySideLength(double ySideLength) {
		if(ySideLength>0){
		
			this.ySideLength = ySideLength;
		
		}
		else{
			
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}

	@Override
	public double getXMin() {
		return xV ;
	}

	@Override
	public double getXMax() {
		return xV+xSideLength;
	}

	@Override
	public double getYMin() {
		return yV;
	}

	@Override
	public double getYMax() {
		return yV+ySideLength;
	}

	@Override
	public String toString() {
		return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + ", ySideLength=" + ySideLength + "]";
	}
	
	
}
