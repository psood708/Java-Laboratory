
import java.io.*;

import java.util.Scanner;

public class finp_fout {

    static Scanner sc = new Scanner(System.in);
    static File file = new File(  "C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//File_Management//test.txt");
    static int i;
    public static void main(String[] args) throws IOException {
        int selection;
        boolean check = true;
        do {
            System.out.println("\nEnter a choice. \n1: Add info \n2: Read info \n3: Exit");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                {
                    addinfo();
                    break;
                }
                case 2:
                {
                    getinfo();
                    break;
                }
                case 3:
                {
                    check = false;
                    break;
                }
                default:
                {
                    System.out.println("Please enter valid input");
                }
            }
        } while (check);

    }
    public static void getinfo() throws IOException

    {
        FileInputStream inStream = new FileInputStream(file);
        while ((i = inStream.read()) != -1)
        {
            System.out.print((char) i);
        }
        inStream.close();
    }
    public static void addinfo() throws IOException
    {
        FileOutputStream outStream = new FileOutputStream(file, true);
        sc.nextLine();
        System.out.println("Enter name of student");
        String name = sc.nextLine();
        System.out.println("Enter age of student");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter college name of Student");
        String college = sc.nextLine();
        System.out.println("Enter branch of Student");
        String branch = sc.nextLine();
        System.out.println("Enter batch of Student");
        String batch = sc.nextLine();
        String str = "\nName: " + name + ", Age: " + age + ", College: " + college + ", Branch: " + branch + ", Batch: "
                + batch;
        byte strTObyte[] = str.getBytes();
        outStream.write(strTObyte);
        outStream.close();
    }
}