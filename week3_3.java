import java.util.Scanner;

public class week3_3 {
    public static void main(String[] args) {
        int numOfItem = 0;
        int priceOfItem = 0;
        float t = 0.0f; 
        double totalPrice = 0.0d;

        Scanner sc = new Scanner(System.in);

        System.out.println("상품의 개수 입력:");
        numOfItem = sc.nextInt();
        System.out.println("상품의 가격 입력");
                priceOfItem = sc.nextInt();
        sc.close();

        if (numOfItem >= 20) {
            totalPrice = numOfItem * priceOfItem * 0.9;
        } else if (numOfItem >= 50) {
            totalPrice = numOfItem * priceOfItem * 0.8;
        }

        System.out.println("numOfItem: " + numOfItem + ", Total Price: " + totalPrice);

    }

}
