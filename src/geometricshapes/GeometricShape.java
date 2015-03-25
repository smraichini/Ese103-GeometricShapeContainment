package geometricshapes;

public abstract class GeometricShape {
	abstract public double getXMin();
	
	abstract public double getXMax();
	
	abstract public double getYMin();
	
	abstract public double getYMax();
	
	public boolean contains(GeometricShape z) {
		boolean r=false;
		if((this.getXMin() <= z.getXMin())  &&
            (this.getYMin() <= z.getYMin()) &&
			(z.getXMax() <= this.getXMax()) &&
			(z.getYMax() <= this.getYMax()))
				{
					
					r=true;
				}
	return (r);
	}
}
