import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        double price;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount: ");
        amount = sc.nextInt();

        price = amount * 100;
        if(price > 1000){
            price = price*(1-0.1);
            System.out.println("total cost: "+price);
        }
        else{
            System.out.println("total cost: "+price);
        }
    }
}
