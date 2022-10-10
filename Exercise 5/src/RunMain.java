import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        double point;
        char rank;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input point: ");
        point = sc.nextDouble();

        if(point>80){

            rank = 'A';
        }else if(point>60){
            rank = 'B';
        }else if(point >50){
            rank ='C';
        }else if(point >45){
            rank = 'D';
        }else if(point>25){
            rank = 'E';
        }else{
            rank = 'F';
        }
        System.out.println("Rank = "+rank);
    }
}
