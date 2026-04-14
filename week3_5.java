import java.util.Scanner;

//1. 국어와 영어 점수를 입력 받아 두 점수의 합이 120점 이상이면 합격을, 그렇지 않으면 불합격을 출력하는 프로그램을 작성하시오.
public class week3_5 {
    public static void main(String[] args) {
        int KorPoint = 0;  //국어 점수와 영어 점수를 변수로 저장
        int EngPoint = 0;
        int TotalPoint = 0;

        //입력받은 점수를 저장하고, 총점 변수 저장
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 입력: ");
        KorPoint = sc.nextInt();
        System.out.println("영어 점수 입력: ");
        EngPoint = sc.nextInt();
        sc.close();

        TotalPoint = KorPoint + EngPoint;
        
//문제의 조건에 부합하게 실행되도록 코딩
        if (TotalPoint >= 120) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

//3. 유권자 수와 투표자 수를 입력 받아 투표율이 50% 이상인 경우 “유효 투표입니다”를 출력하는 프로그램을 작성하시오.
class week3_6 {
    public static void main(String[] args) {
       int PersonNum = 0;
       int VoteNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("투표권이 있는 사람의 수 입력: ");
        PersonNum = sc.nextInt();
        System.out.println("투표한 사람의 수 입력: ");
        VoteNum = sc.nextInt();
        sc.close();

        if (VoteNum >= PersonNum * 0.5) {
            System.out.println("유효 투표입니다. .");
        } else {
            System.out.println("투표가 성립되지 않았습니다.");

    }
    }
}

//5. 한 사람당 8000원인 영화관에서 10명 이상일 경우 10%, 20명 이상일 경우 20%를 할인해 주고 있다. 사람 수를 입력 받아 지불해야 하는 총 비용을 출력하는 프로그램을 작성하시오.
class week3_7 {
    public static void main(String[] args) {
        int price = 0;
        int numPeople = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("인원 수 입력: ");
        numPeople = sc.nextInt();
        sc.close();

        if (numPeople >= 10) {
            price = (8000 * 90 / 100) * numPeople;
            System.out.println("인원 수: " + numPeople + ", 총 가격: " + price);
        } else if (numPeople >= 20){
            price = (8000 * 80 / 100) * numPeople;
            System.out.println("인원 수: " + numPeople + ", 가격: " + price);
        }
    }       
} 

//7. 나이를 입력 받아 입력된 나이가 19세 미만이면 “미성년자입니다”, 19세이면 “19세입니다”를, 19세보다 많으면 “성인입니다”를 출력하는 프로그램을 작성하시오.
class week3_8 {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 입력: ");
        age = sc.nextInt();
        sc.close();

        if (age < 19) {
            System.out.println("미성년자입니다.");
        } else if (age == 19) {
            System.out.println("19세입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}

//9. 2개의 값을 입력 받아 값을 큰 순서대로 출력하는 프로그램을 작성하시오.
class week3_9 {
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
            System.out.println("입력값: " + num1 + " " +num2);
            System.out.println("출력값:" + num2 + " " + num1);
        } else {
            System.out.println("입력값: " + num1 + num2);
            System.out.println("출력값:" + num1 + num2);
        }
    }
}

//11. 상품의 개수와 단가를 입력 받아 총 금액을 계산하여 출력하시오. 단, 상품의 개수가 100-199 사이이면 8%, 200-299 사이이면 15%, 300개 이상이면 20%의 할인 금액을 적용한다. 100개 미만이면 할인 금액을 적용하지 않는다.
class week3_10 {
    public static void main(String[] args) {
        int numOfItem = 0;
        int priceOfItem = 0;
        int totalPrice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("상품의 개수 입력:");
        numOfItem = sc.nextInt();
        System.out.println("상품의 가격 입력");
        priceOfItem = sc.nextInt();
        sc.close();
        totalPrice = numOfItem * priceOfItem;
        System.out.println("총 가격: " + totalPrice);

        if (200 > numOfItem && numOfItem >= 100) {
            totalPrice = totalPrice * 92 / 100;
            System.out.println("할인된 가격: " + totalPrice);
        } else if (numOfItem >= 200 && numOfItem < 300) {
            totalPrice = totalPrice * 85 / 100;
            System.out.println("할인된 가격: " + totalPrice);
        } else if (numOfItem >= 300) {
            totalPrice = totalPrice * 80 / 100;
            System.out.println("할인된 가격: " + totalPrice);
        }
    }
}