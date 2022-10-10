import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc  = new Scanner(System.in);

        System.out.println("Input a: ");
        a = sc.nextInt();
        System.out.println("Input b: ");
        b = sc.nextInt();

        if(a<b){
            System.out.println("greatest value: "+b);
        }else {
            System.out.println("greatest value: "+a);
        }
    }
}
