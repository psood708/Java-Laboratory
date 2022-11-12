
public class eight {
    public static void main(String[] args) {
        CallConstructor obj = new CallConstructor();
        // System.out.println(obj);
    }

    static class CallConstructor {

        CallConstructor() {
            this("Start of Called Constructor", "Executing Commands in Called Constructor",
                    "End of Default Constructor");
            // System.out.println();

            System.out.println("Command exactly after calling constructor from Default Constructor");
            System.out.println("End of Default Constructor");
        }

        CallConstructor(String st, String st1, String st2) {
            System.out.println(st);
            System.out.println(st1);
            System.out.println(st2);
            System.out.println();

        }

        String name;

    }

}
