package hw.ss.weekend;

public class Line {
	/*Construct a line object */ 

	public Line(double x0, double y0, double x1, double y1) {
this.x0 = x0;
this.y0 = y0;
this.x1 = x1;
this.y1 = y1;
}
	/*Calculate the slop of the line*/
	public double getSlope() {
		/*Avoid dividing by zero*/
		if(x1 == x0) {
			throw new AritmeticException();
		}
		return (y1 - y0) / (x1 - x0);
	}

	/*Calculate the distance of a line*/
	public double getDistance( ) {
		return Math.sqrt ((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	
}
//	return whether a line is parallel to another
	public boolean parallelTo(Line I) {
//		if the difference is really small, consider them parallel
		if(Math.abs(getSlope() -I.getSlope()) < .0001) {
			return true;
		} else {
			return false;
		}
	}
	private double x0, y0, x1, y1;
}