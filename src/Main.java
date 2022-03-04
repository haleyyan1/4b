import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostageCalculator post = new PostageCalculator();
        System.out.println("Welcome to the postage calculator");
        System.out.println("Would you like to simulate the postage calculator or enter your own package? (s/e or q to quit)");
        String s=sc.nextLine();
        while (!s.equals("q")){
        if (s.equals("s")){
            int z1 = (int)(Math.random()*99499)+501;
            int z2 = (int)(Math.random()*99499)+501;
            Address ad3 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO",""+z1);
            Address ad4 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO",""+z2);
            Package pack2 = new Package(ad3,ad4,3.0);
            System.out.println("Address 1: "+ad3.toString());
            System.out.println("Address 2: "+ad4.toString());
            System.out.println("Cost: "+post.calculatePostage(pack2));
            System.out.println("Would you like to simulate the postage calculator or enter your own package? (s/e or q to quit");
            s=sc.nextLine();}
        if (s.equals("e")){
            System.out.println("Enter address 1");
            String a1=sc.nextLine();
            System.out.println("Enter address 2");
            String a2=sc.nextLine();
            System.out.println("How much does the package weigh?");
            double w = Integer.parseInt(sc.nextLine());
            Package p = new Package(new Address(a1),new Address(a2),w);
            System.out.println("Cost: "+post.calculatePostage(p));
            System.out.println("Would you like to simulate the postage calculator or enter your own package? (s/e or q to quit");
            s=sc.nextLine();
            }
        if(s.equals("q")) break;
        }
        }
    }
