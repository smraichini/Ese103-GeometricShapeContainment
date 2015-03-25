package geometricshapes;

public class Square extends Rectangle {
	
	public void setL(double l){
		if (l>0){
			this.xSideLength=l;
			this.ySideLength=l;
		}
		else
		{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	
	public double getL(){
		return this.xSideLength;
	}

	public Square(double xV, double yV, double l) {
		
			super(xV, yV, l, l);
	
	}

	
	
	@Override
	public String toString() {
		return "Square [xV=" + xV + ", yV=" + yV + ", l=" + getL() + "]";
	}

	@Override
	public void setXSideLength(double l) {
		if(l>0){
			
			this.xSideLength = l;
			this.ySideLength = l;
			
		}
		else{
		
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	
	@Override
	public void setYSideLength(double l) {
		if(l>0){
			
			this.xSideLength = l;
			this.ySideLength = l;
			
		}
		else{
		
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
}