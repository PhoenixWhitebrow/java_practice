package my.first.pak;

public class DistanceXY {

        public static void main(String[] args) {
            Point p1 = new Point(1, 1);
            Point p2 = new Point(2, 4);
            System.out.println("Расстояние между точкой p1 с координатами x=" + p1.x + " и y=" + p1.y + " и точкой p2 с координатами x=" + p2.x + " и y=" + p2.y + " равняется " + distance(p1, p2));
        }

        public static double distance(Point p1, Point p2) {
            return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        }
}
