package week_3;

public class Circle {
	void distance(double x1,double y1,double x2,double y2){
		   double dis=Math.sqrt(Math.pow(x2-x1,2)+Math.pow((y2-y1),2));
		   System.out.printf("%.2f",dis);
	}
}
