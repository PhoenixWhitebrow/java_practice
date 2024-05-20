package my.first.pak;

public class Equality {

  public static void main(String[] args) {
    String s1 = "firefox";
    String s2 = new String(s1);

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s1 == s2 : " + (s1 == s2));
    System.out.println("s1.equals(s2) : "  + s1.equals(s2));
  }
}
