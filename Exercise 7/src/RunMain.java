import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        a = sc.nextInt();

        if(a<0){
            a = (-1)*a;
            System.out.println("output: "+a);
        }else{
            System.out.println("output: "+a);
        }
    }
}
