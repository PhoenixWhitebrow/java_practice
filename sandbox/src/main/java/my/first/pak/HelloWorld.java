package my.first.pak;

public class HelloWorld {

	public static void main(String[] args) {
		hello("World");
		hello("maker");
		hello("Mikhail");

		Square s = new Square();
		s.l = 8;
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(6,7);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static double area(Square s) {
		return s.l * s.l;
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