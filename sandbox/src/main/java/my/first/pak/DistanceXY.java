package my.first.pak;

public class DistanceXY {

        public static void main(String[] args) {

            Point p1 = new Point(1, 1);
            Point p2 = new Point(1, 4);

            System.out.println("Расстояние между точкой p1 с координатами x=" + p1.x + " и y=" + p1.y + " и точкой p2 с координатами x=" + p2.x + " и y=" + p2.y + " равняется " + p1.distance(p2));
        }
}
