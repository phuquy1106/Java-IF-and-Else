import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input year: ");
        year = sc.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println("Năm nhuận");
        }else if(year%400==0){
            System.out.println("Năm nhuận");
        }else{
            System.out.println("Năm không nhuận");
        }
    }
}
