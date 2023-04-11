import java.util.*;
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodOverloading area = new MethodOverloading();
		System.out.println("Enter shape:\n 1)Circle \n 2)Rectangle \n 3)Tringle \n 4)Square");
		int ch = sc.nextInt();
		System.out.println("Enter parameters:");
		switch(ch) {
			case 1:
				double rad = sc.nextDouble();
				double a = area.getArea(rad);
				System.out.println("Area is " + a);
				break;
			case 2:
				double len = sc.nextDouble();
				double bre = sc.nextDouble();
				double b = area.getArea(len, bre);
				System.out.println("Area is " + b);
				break;
			case 3:
				double hi = sc.nextDouble();
				double wit = sc.nextDouble();
				double c = area.findArea(hi, wit);
				System.out.println("Area is " + c);
				break;
			case 4:
				double length = sc.nextDouble();
				double d = area.findArea(length);
				System.out.println("Area is " + d);
				break;
			default :
				System.out.println("Enter valid Choice");
				break;
		}
	}
	//Area of Circle
	public static double getArea(double x) {
		double ar1 = x * x * Math.PI;
		return ar1;
	}
	//Area of Square
	public static double findArea(double y) {
		double ar2 = y * y;
		return ar2;
	}
	//Area of Ractangle
	public static double getArea(double p, double q) {
		double ar3 = p * q;
		return ar3;
	}
	//Area of Tringle 
	public static double findArea(double m, double n) {
		double ar4 = 0.5 * m * n;
		return ar4;
	}
}