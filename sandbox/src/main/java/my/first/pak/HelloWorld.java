package my.first.pak;

public class HelloWorld {

	public static void main(String[] args) {
		hello("World");
		hello("Mikhail");

		Square s = new Square(8);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(6,7);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}
}