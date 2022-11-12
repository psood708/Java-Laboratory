public class fourteen {
    public static void main(String[] args) {
        children ck = new children();
        ck.stats();
    }
    public interface father {
        // interfaces are abstract classes
        static String Eye = "Green";
    }
    public interface mother {
        static String Hair = "Brown";
    }
    public static class children implements mother, father {
        void stats() {
            System.out.println("Eye colour: " + Eye);
            System.out.println("Hair colour: " + Hair);
        }
    }
}