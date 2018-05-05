package Java_13Lesson;

public class exercises {
	public static double R4_1_1(double s_0, double v_0, double t){		
		final double g = 9.8;
		return s_0 + v_0 * t + 1/2 * g * t * t;
	}
	public static double R4_1_2(double a, double P, double m_1, double m_2){		
		return 4 * Math.pow(Math.PI, 2) * Math.pow(a, 3) / (P*P*(m_1+m_2));
	}
	public static double R4_1_3(double PV, double INT, int YRS){		
		return PV * Math.pow(1+INT/100, YRS);
	}
	public static double R4_1_4(double a, double b, double gamma){		
		return Math.sqrt(a*a + b*b - 2*a*b*Math.cos(gamma));
	}
	
	public static void R4_5(){
		double f = 4.35;
		int n = (int) (100 * f);
		System.out.println(n); // Prints 434!
		n = (int) Math.round(100 * f); // OK, n is 435
		System.out.println(n); 	
	}
	
	public static void R4_11(){
		int x = 2;
		int y = x + x;
		System.out.println("y = "+ y);
		String s = "2";
		String t = s + s;
		System.out.println("t = "+t);
	}
	public static void R4_13(){
		String theStr = "hello world";
		System.out.println(theStr.charAt(0));
		System.out.println(theStr.charAt(theStr.length()-1));
		System.out.println(theStr.substring(1));
		System.out.println(theStr.substring(0, theStr.length()-1));
	}
	public static void R4_15(){
		double x = 2.5;
		double y = -1.5;
		int m = 18;
		int n = 4;
		System.out.println(x + n * y - (x + n) * y);
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int) Math.round(x));
		System.out.println((int) Math.round(x) + (int) Math.round(y));
		System.out.println(1 - (1 - (1 - (1 - (1 - n)))));
	}
	public static void main(String[] args) {
		R4_5();
		R4_11();
		R4_13();
		R4_15();
	}

}
