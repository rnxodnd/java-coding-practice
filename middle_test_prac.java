import java.util.Scanner;

public class middle_test_prac {
    public static void main(String[] args) {
        //관계 연산 프로그램
        System.out.println("name: " );
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("score: " );
        int score = sc.nextInt();
        sc.close();

        if (score >= 80) {
            System.out.println(name + " " + "합격 (점수: " + score + ")");
        } else {
            System.out.println(name + " " + "불합격 (점수: " + score + ")");
        }

    }
    
}

class if_else_prac {
    public static void main(String[] args) {
        System.out.println("age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age >= 65) {
            System.out.println("경로우대 승차권");
        } else {
            System.out.println("일반 승차권");
        }
        System.out.print("See you again");
    }
}

class if_else_prac2 {
    public static void main(String[] args) {
        System.out.println("number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}

class if_else_prac3 {
    public static void main(String[] args) {
        System.out.println("prince: ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("number: ");
        int number = sc.nextInt();
        sc.close();

        int total = price * number;
        System.out.println("총 금액: " + total);

        if (number >= 20) {
            System.out.println("할인 금액: " + (total * 0.9));
        } else if (number >= 50) {
            System.out.println("할인 금액: " + (total * 0.8));
        }
    }
}

class if_else_prac4 {
    public static void main(String[] args) {
        System.out.println("num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}

class logical_operator_prac {
    public static void main(String[] args) {
        System.out.println("sub1: ");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        System.out.println("sub2: ");
        int sub2 = sc.nextInt();
        sc.close();

        if ((sub1 >= 80 && sub2 >= 80) || (sub1 + sub2 >= 170)) {
            System.out.println("우수학생");
        }
    }
}

class logical_operator_prac2 {
    public static void main(String[] args) {
        System.out.println("num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("두 수 모두 짝수입니다.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("두 수 모두 홀수입니다.");
        } else {
            System.out.println("한 수는 짝수이고 다른 수는 홀수입니다.");
        }
    }
}

class logical_operator_prac3 {
    public static void main(String[] args) {
        System.out.println("num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println(num1 + num2);
        } else {
            System.out.println("홀수입니다.");
        }
    }
}

class logical_operator_prac4 {
    public static void main(String[] args) {
        System.out.println("month: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();

        if (month <= 5 && month >= 3) {
            System.out.println("봄");
        } else if (month <= 8 && month >= 6) {
            System.out.println("여름");
        } else if (month <= 11 && month >= 9) {
            System.out.println("가을");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울");
        }
    }
}

class while_prac {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1부터 100까지의 짝수의 합: " + sum);
    }
}

class while_prac2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 4 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1부터 100까지의 4의 배수의 합: " + sum);
    }
}

class while_prac3 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("** 3단 **");
        while (i <= 9) {
            System.out.println("3 * " + i + " = " + (3*i));
            i++;
        }
    }
}

class while_prac4 {
    public static void main(String[] args) {
        System.out.println("num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();
        sc.close();

        int sum = 0;
        if (num1 < num2) {
            while (num1 <= num2) {
                if (num1 % 2 != 0) {
                    sum = sum + num1;
                }
                num1++;
            }
            System.out.println("홀수의 합: " + sum);
        } else {
            while (num2 < num1) {
                if (num2 % 2 != 0) {
                    sum = sum + num2;
                }
                num2++;
            }
            System.out.println("홀수의 합: " + sum);
        }
    }
}

class for_prac {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Total = " + total + ", input the money: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        total = total + money;
        int choice = 0;
        while (true){
            if (total < 500) {
                while (total >= 500) {
                    System.out.println("Total =" + total + "input the money: ");
                    money = sc.nextInt();
                    total = total + money;
                }
            } else {
                while (total < 500) {
                System.out.println("Total = " + total);
                System.out.println("=====================");
                System.out.println("M E N U");
                System.out.println("=====================");
                System.out.println("1. coke \n2. cydar \n3. coffee \n4. quit");
                System.out.println("=====================");
                System.out.println("select a num: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("coke is served");
                    total = total - 500;
                } else if (choice == 2) {
                    System.out.println("cydar is served");
                total = total - 500; 
                } else if (choice == 3) {
                    System.out.println("coffee is served");
                    total = total - 500;
                } else if (choice == 4) {
                    System.out.println("quit");
                    System.out.println("change is served: " + total);
                    break;
                }
            }
            System.out.println("Total = " + total + "\nchange: " + total);
            System.out.println("Total = " + total + "input the money: ");
            }
        }
    };  
}





