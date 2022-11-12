public class five{
    public static void main(String[]args){
          
        reference r1 = new reference("Change");
        try{
             change(r1);
        }
        catch(Exception ob){
            System.out.println(ob);
        }

    }
    public static void change(reference r){
        // r = new reference("Change");
        // System.out.println(r.PvtStr);
        System.out.println(r.FinalStr);
        System.out.println(r.PubStr);
    }
} 
class reference{
    String s1;
    private String PvtStr = "It's private";
    public String PubStr = "Hello Everyone";
    final String FinalStr = "It is what it is";
    public reference(String Str){
        s1 = Str;
    }
}

