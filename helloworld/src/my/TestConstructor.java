package my;

class Point {
	double x,y;
	
	//构造方法名必须和类名保持一致
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double GetDistance(Point p) {
		return Math.sqrt((x - p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}
	
}


public class TestConstructor{
	public static void main(String[] args) {
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0,0);
		System.out.println(p.GetDistance(origin));
	}

}
