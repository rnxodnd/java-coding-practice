import java.util.Scanner;

public class week5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("Sum : " + sum);
    }
}


 class week5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        do {
            System.out.print("score? ");
            sum += sc.nextInt();
            i++;
        } while (i < 3);

        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + (sum / 3));

        sc.close();
    }
}


 class week5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        int score;

        do {
            do {
                System.out.print("score(0~100)? ");
                score = sc.nextInt();

                if (score < 0 || score > 100) {
                    System.out.println("0부터 100 사이의 점수만 입력하세요.");
                }
            } while (score < 0 || score > 100);

            sum += score;
            i++;
        } while (i < 3);

        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + (sum / 3));

        sc.close();
    }
}

class week5_3 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("Sum : " + sum);
    }
}

class week5_4 {
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

class week5_5 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9){
            System.out.println("3 * " + i + " = " + (3*i));
            i++;
        }
    }
}

class week5_6 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9){
            System.out.println(i + " * 3 = " + (3*i));
            i += 2;
        }
    }
}

class week5_7 {
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



 class week5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        int sum = 0;

        do {
            sum += num;
            num--;
        } while (num >= 1);

        System.out.println("합 : " + sum);

        sc.close();
    }
}

class week5_9 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;

        do { 
            if (i % 2 == 1) {
                sum += i;
            }
        } while (i <= 200);
        System.out.println("Sum : " + sum);
    }
}

class week5_10 {
    public static void main(String[] args) {    
        int i = 0;
        int sum = 0;
        do { 
            Scanner sc = new Scanner(System.in);
            System.out.println(i + "번 쨰숫자 입력: ");
            int num = sc.nextInt();
            sc.close();
            if (num > 5) {
                sum += num;
            }
            i++;

        } while (i <= 10);
        System.out.println("Sum : " + sum);
    }
}

class week5_11 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;

        do {
            sum += i;

            if (i == 110 || i == 120 || i == 130 || i == 140 || i == 150) {
                System.out.println("100-" + i + ": " + sum);
            }

            i++;
        } while (i <= 150);
    }
}

class week5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dan? ");
        int dan = sc.nextInt();

        int i = 8;

        System.out.println("** " + dan + "Dan **");

        do {
            System.out.println(i + " * " + dan + " = " + (i * dan));
            i -= 2;
        } while (i >= 2);

        sc.close();
    }
}



class week5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int num;
        int sum = 0;

        do {
            System.out.print(i + "번째 정수 입력: ");
            num = sc.nextInt();

            if (i % 2 == 0) {
                num = -num;  
            }

            sum += num;
            i++;
        } while (i <= 10);

        System.out.println("합 : " + sum);

        sc.close();
    }
}

