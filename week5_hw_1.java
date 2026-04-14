import java.util.Scanner;

public class week5_hw_1 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            if (i % 4 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("Sum : " + sum);
    }
}
 class week5_hw_2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("{**2단**");
        while (i <= 9){

            if (i % 2 == 0) {
                System.out.println("2 * " + i + " = " + (2*i));
            }
            i++;
        }
        System.out.println("}");
    }
}


class week5_hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        int num1 = sc.nextInt();
        System.out.println("두번째 수 입력");
        int num2 = sc.nextInt();
        sc.close();

        int sum = 0;
        if (num1 % 2 == 1) {
            while (num1 <= num2) {
                sum += num1;
                num1 += 2;
            }
        }
        System.out.println("Sum : " + sum); 
        }
    }

class week5_hw_4 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do { 
            if (i % 2 == 1) {
                sum += i;
            }
        } while (i <= 100);
        System.out.println("Sum : " + sum);
    }
}

class week5_hw_5 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            sum += i;

            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100) {
                System.out.println("100-" + i + ": " + sum);
            }

            i++;
        } while (i <= 100);
    }
}

class week5_hw_6{
    public static void main(String[] args) {
        int i = 8;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자 입력: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("**" + num + "단**");

        do { 
            System.out.println(i + " * " + num + " = " + (i*num));
            i-=2;
        } while (i >= 2);
    }
}

class week5_hw_7 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("================================");
            Scanner sc = new Scanner(System.in);
            System.out.println("가장 좋아하는 월은?(종료: 0)");
            int month = sc.nextInt();
            System.out.println("================================");
            i = month;
            System.out.println("******" + month + "월******");

            if (month == 11 || month == 12 || month == 1 || month == 2) {
                System.out.println(month + "월은 겨울에 해당됩니다");
            } else if (month == 3 || month == 4 || month == 5 || month == 6) {
                System.out.println(month + "월은 봄에 해당됩니다");
            } else if (month == 7 || month == 8 || month == 9 || month == 10) {
                System.out.println(month + "월은 여름에 해당됩니다");
            } else if (month == 11 || month == 12 || month == 1 || month == 2) {
                System.out.println(month + "월은 가을에 해당됩니다");
            }
            
        } while (i != 0);
    }
    
}