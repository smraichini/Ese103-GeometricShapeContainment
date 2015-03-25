package geometricshapes;

public class Pentagon extends GeometricShape {
	private double xV;
	private double yV;
	private double l;
	
	public Pentagon(double xV, double yV, double l){
		this.xV=xV;
		this.yV=yV;
		if(l>0){
		
			this.l=l;
		
		}
		else{
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

//metodi per ottenere la bb
	@Override
	public double getXMin() {
		return this.getXE();
	}

	@Override
	public double getXMax() {
		return this.getXC();
	}

	@Override
	public double getYMin() {
		return yV;
	}

	@Override
	public double getYMax() {
		return this.getYD();
	}
	
	//metodi che ottengono le coordinate degli altri punti
	
	public double getXA() {
		return this.xV;
	}
	public double getYA() {
		return this.yV;
	}
	
	public double getXB() {
		return this.xV+this.l;
	}
	public double getYB() {
		return yV;
	}
	
	
	public double getXC() {
		return (this.getXB()-this.getXA())*(Math.sqrt(5)-1)+this.getXB();
	}
	public double getYC() {
		return (this.getXB()-this.getXA()*(Math.sqrt(5)/8+5/8))+this.getYB();
	}
	
	
	public double getXD() {
		return (this.getXC()-this.getXB())*(Math.sqrt(5)-1)+this.getXC();
	}
	public double getYD() {
		return (this.getXC()-this.getXB()*(Math.sqrt(5)/8+5/8))+this.getYC();
	}
	
	
	public double getXE() {
		return (this.getXD()-this.getXC())*(Math.sqrt(5)-1)+this.getXD();
	}
	public double getyE() {
		return (this.getXD()-this.getXC()*(Math.sqrt(5)/8+5/8))+this.getYD();
	}
	
	//stampa del pentagono
	@Override
	public String toString() {
		return "Pentagon [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

}
