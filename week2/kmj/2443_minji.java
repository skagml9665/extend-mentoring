import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        for(int i=a; i>0; i--){
            for(int j=a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
