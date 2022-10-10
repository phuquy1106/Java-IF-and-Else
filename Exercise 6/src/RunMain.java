import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input age1: ");
        a = sc.nextInt();
        System.out.println("Input age2: ");
        b = sc.nextInt();
        System.out.println("Input age3: ");
        c = sc.nextInt();

        if(a>b&&b>c){
            System.out.println("Age of the oldest: "+a);
            System.out.println("youngest person's age: "+c);
        }else if(a>b&&c>a){
            System.out.println("Age of the oldest: "+c);
            System.out.println("youngest person's age: "+b);
        }else if(b>a&&a>c){
            System.out.println("Age of the oldest: "+b);
            System.out.println("youngest person's age: "+c);
        }else if(a>c&&c>b){
            System.out.println("Age of the oldest: "+a);
            System.out.println("youngest person's age: "+b);
        }else if(c>b&&b>a){
            System.out.println("Age of the oldest: "+c);
            System.out.println("youngest person's age: "+a);
        } else if (b>c&&c>a) {
            System.out.println("Age of the oldest: "+b);
            System.out.println("youngest person's age: "+a);
        }
    }
}
