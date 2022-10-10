import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        double wagel;
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input wagel: ");
        wagel = sc.nextDouble();
        System.out.println("Input year: ");
        year = sc.nextInt();

        if(year>5){

            System.out.println("bouns: "+wagel*(1-0.95));
        }else{
            System.out.println("bouns: "+0);
        }
    }
}
