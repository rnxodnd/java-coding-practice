import java.util.Scanner;

public class week3_4 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력: ");
        num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력: ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 < num2) {
            num2 = num1 + num2;
            num1 = num2 - num1;
            num2 = num2 - num1; 
            
            System.out.println("num1: " + num1 + ", num2: " + num2);
        } else  {
            System.out.println("num1: " + num1 + ", num2: " + num2);
            
        }



    }
}
