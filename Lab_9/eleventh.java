// package Lab_9;

// import java.lang.annotation.Inherited;
public class eleventh {
    public static void main(String[] args) {
        Quadrilateral q1 = new Quadrilateral();
        q1.getInfo("quadrilateral");
        System.out.println();
        Parallelogram p1 = new Parallelogram();
        p1.getInfo("parallellogram");
        p1.getExtra("parallellogram");
        System.out.println();
        Rhombus r1 = new Rhombus();
        r1.getInfo("rhombus");
        r1.getExtra("rhombus");
        System.out.println();
        Square s1 = new Square();
        s1.getInfo("Square");
        s1.getExtra("Square");
    }
    public static class Quadrilateral {
        void getInfo(String shape) {
            System.out.println("No. of sides in " + shape + " is: 4");
        }
    }
    public static class Parallelogram extends Quadrilateral {
        void getExtra(String shape) {
            System.out.println("Opposite Sides in " + shape + " have same length");
        }
    }
    public static class Rhombus extends Parallelogram {
        void getExtra(String shape) {
            System.out.println("All sides in " + shape + " have same length");
        }
    }
    public static class Square extends Rhombus {
        void getExtra(String shape) {
            System.out.println("All sides in " + shape + " have same length");
            System.out.println("All angles in " + shape + " measure same i.e 90 degrees");
        }
    }
}