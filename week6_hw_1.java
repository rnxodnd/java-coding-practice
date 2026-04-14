

public class week6_hw_1 {
    public static void main(String[] args) {
        int[] arr = {234, 89, 678, 55, 785, 66};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("{ 가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min + " }");
    }
}

class week6_hw_2 {
    public static void main(String[] args) {
        int[] arr = {234,44,89,678,55,785,66,88};
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum = sum + arr[i]; 
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        sum = sum - max - min;
        System.out.println("가장 큰 값과 작은 값을 제외한 합: " + sum);
        System.out.println("가장 큰 값과 작은 값을 제외한 평균: " + sum/6);
    }
}

class week6_hw_3 {
    public static void main(String[] args) {
        int[] arr = {33,2,189,72,7,91,5,14,17,9};
        int first = arr[0];

        System.out.print("초기 배열 값: " );
            for (int i = 1; i < arr.length; i++) {        
                System.out.print(arr[i] + " ");
            }
        System.out.println();

        System.out.print("이동 후 배열 값: " );
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
            System.out.print(arr[i] + " ");
        }      
        System.out.print(first);
    }
}



class week6_hw_4 {
    public static void main(String[] args) {
        String[] arr = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};
        
        System.out.print("정렬 전: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("정렬 후: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}

class week6_hw_5 {
    public static void main(String[] args) {
        int[][] arr = {
            {28, 33, 36, 7},
            {56, 66, 44, 20},
            {88, 7, 21, 44},
            {33, 2, 643, 4}
        };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.print("3의 배수는" + count + "개입니다.");
    }
}

class week6_hw_6 {
    public static void main(String[] args) {
        int[][] arr = {
            {28, 33, 36, 7},
            {56, 66, 44, 20},
            {88, 7, 21, 44},
            {33, 2, 643, 4}
        };

        int sum = 0;

        
        for (int col = 0; col < arr.length; col++) {
            System.out.print((col+1) + "열의 합계: ");
                for (int row = 0; row < arr[0].length; row++) {
                    sum += arr[row][col];

            }
             System.out.println(sum);
             sum = 0;
        }

    }
}

class week6_hw_7 {
    public static void main(String[] args) {
        int[][] arr = {
            {7,9,4,7,2},
            {3,4,6,7,2},
            {3,2,6,9,8}
        };

        int[] number = {4,7,3,2,6,9,8};

        int count = 0;
    for (int num = 0; num < number.length; num++) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == number[num]) {
                    count++;
                }
            }
        }
        System.out.println(number[num] + "의 개수: " + count);
        count = 0;
       }
    }
}

class week6_hw_8 {
    public static void main(String[] args) {
        int[][] a = {
            {7, 9, 4, 7, 2},
            {3, 4, 6, 7, 2}
        };

        int[][] b = {
            {3, 1, 4, 8, 0},
            {3, 5, 6, 9, 1}
        };

        int[][] total = new int[2][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                total[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.print("{");
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j]);
                if (j != total[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.print("}");
    }

}