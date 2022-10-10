import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input longs: ");
        a = sc.nextDouble();
        System.out.println("Input width: ");
        b = sc.nextDouble();

        if(a==b){
            System.out.println("square");
        }else{
            System.out.println("not square");
        }

    }
}