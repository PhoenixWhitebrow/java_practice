package my.first.pak;

public class HelloWorld {

	public static void main(String[] args) {
		hello("World");
		hello("maker");
		hello("Mikhail");
		double l = 6;
		double a = 7;
		double b = 8;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static double area(double l) {
		return l * l;
	}

	public static double area(double a, double b) {
		return a * b;
	}

	public static void mathematicsExample() {
		System.out.println(2 + 2);
		System.out.println(2 * 2);
		System.out.println(2 / 2);
		System.out.println(2 - 2);

		System.out.println(1 / 2);
		System.out.println(1.0 / 2);
		System.out.println("2" + "2");
		System.out.println("2 + 2 = " + (2 + 2));

		int l = 7;
		double s = l * l;
		System.out.println("Площадь квадрата со стороной " + l + " = " + s);
	}

}