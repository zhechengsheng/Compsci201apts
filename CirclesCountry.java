public class CirclesCountry{
/**
	 * Returns true if a point is inside a circle and 
	 * returns false otherwise.
	 * @param x is x-coordinate of point
	 * @param y is y-coordinate of point
	 * @param cx is center of circle x-coordinate
	 * @param cy is center of circle y-coordinate
	 * @param r is radius of circle
	 * @return true if (x,y) is inside circle, returns
	 * false if (x,y) is on or outside circle
	 */
	public boolean isInside(int x, int y, int cx, int cy, int r){
		double dist  = Math.pow(cx - x ,2) + Math.pow(cy - y, 2);// variable dist not shown
		return dist < r*r;
	}
	public int leastBorders(int[] x, int[] y, int[] r, 
                             int x1, int y1, int x2, int y2){ 
	int crosses = 0;
		for(int k = 0; k < x.length; k+=1){
			if (isInside(x[k],y[k],x1,y1,r[k]) && ! isInside(x[k],y[k],x2,y2,r[k])){
				crosses += 1;
			}
			if (! isInside(x[k],y[k],x1,y1,r[k]) && isInside(x[k],y[k],x2,y2,r[k])){
				crosses += 1;
			}
		}
		return crosses;
	}