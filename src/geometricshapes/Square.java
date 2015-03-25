package geometricshapes;

public class Square extends Rectangle {
	
	public void setL(double l){
		if (l>0){
			this.setXSideLength(l);
			this.setYSideLength(l);
		}
		else
		{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	
	public double getL(){
		return this.getXSideLength();
	}

	public Square(double xV, double yV, double l) {
		
			super(xV, yV, l, l);
	
	}

	@Override
	public String toString() {
		return "Square [L=" + getL() + ", xV=" + getXV()
				+ ", yV=" + getYV() + "]";
	}
	
	
}