
public class third {
    public class Apparel {
        String item_id;
        double price;
        String item_type;
        static int counter = 100;

        Apparel(double a, String b) {
            if (b.toLowerCase().equals("cotton")) {
                item_type = "Cotton";
                price = a;
                counter++;
                item_id = "C" + counter;
            } else {
                item_type = "Silk";
                price = a;
                counter++;
                item_id = "S" + counter;
            }
        }

        double calculate_price() {
            price = price + (double) (0.05 * price);
            return price;
        }
    }

   static class Cotton extends Apparel {
        static int discount = 10;

        Cotton(double a) {
            super(a, "cotton");
        }

        double calculate_price() {
            price = super.calculate_price();
            price -= 0.01 * price;
            price += 0.05 * price;
            return price;
        }

        void get_discount() {
            System.out.println("Discount offered: " + discount + "%");
        }
    }

    static class Silk extends Apparel {
        int points;

        Silk(double a) {
            super(a, "silk");
        }

        double calculate_price() {
            price = super.calculate_price();
            if (price >= 10000) {
                points = 10;
            } else {
                points = 3;
            }
            price += 0.1 * price;
            return price;
        }

        void get_points() {
            System.out.println("Points: " + points);
        }
    }

    public static void main(String[] args) {
        Apparel a1 = new Cotton(5000);
        Apparel a2 = new Silk(10000);
        System.out.println(a1.calculate_price());
    }
}