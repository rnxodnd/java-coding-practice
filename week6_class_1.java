public class week6_class_1 {
    public static void main(String[] args) {
        int values[];
        values = new int[5];

        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i-1]; 
        }
        values[0] = values[1] + values[4];

        for (int i = 1; i<5; i++) {
            System.out.println("Element at index: " + i + ", "+ values[i]);
        }
    }
}

class week6_class_2 {
    public static void main(String[] args) {
        int[] my_array;
        my_array = new int[5];
        my_array[0] = 100;
        my_array[1] = 200;
        my_array[2] = 300;
        my_array[3] = 400;
        my_array[4] = 500;

        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index: " + my_array[i]);
        }
    }
}

class week6_class_3 {
    public static void main(String[] agrs) {
        int arr1[] = new int[5];
        int arr2[] = {1,2,3,4,5,6,7};
        int arr3[] = {4,3,2,1,0};

        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);
        System.out.println("arr3 length: " + arr3.length);
    }
}

class week6_class_4 {
    public static void main(String[] args) {
        int scores[] = {99,85,95,88,100};
        int sum = 0;
        int i;

        for (i = 0; i < 5; i++) {
            sum = sum + scores[i];
        }
        System.out.println("Average is " + sum/5);
    }
}

class week6_class_5 {
    public static void main(String[] args) {
        int scores[] = {99,85,95,88,100};
        for (int i : scores) {
            System.out.println(i);
        }
    }
}

class week6_class_6 {
    public static void main(String[] args) {
        int scores[] = {99,85,95,88,100};
        for (int i : scores) {
            System.out.println(i);
        }
    }
}

class week6_class_7 {
    public static void main(String[] args) {
        int twoDArr[][] = new int[4][5];
        int cnt = 10;
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++){
            twoDArr[i][j] = cnt++;
            }
        }
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                System.out.println(twoDArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class week6_class_8 {
    public static void main(String[] args) {
        int threeDArr[][][] = new int[2][4][5];
        int cnt = 10;
        
        for (int i = 0; i < threeDArr.length; i++) {
            for ( int j = 0; j < threeDArr[0].length; j++) {
                for (int k = 0; k < threeDArr[0][0].length; k++) {
                    threeDArr[i][j][k] = cnt++;
                }
            }
        }
        for (int i = 0; i < threeDArr.length; i++) {
            for ( int j = 0; j < threeDArr[0].length; j++) {
                for (int k = 0; k < threeDArr[0][0].length; k++) {
                    System.out.println(threeDArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class week6_class_9 {
    public static void main(String[] args) {
        int scores[][] = new int[2][3];
        int cnt = 0;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[0].length; j++) {
                scores[i][j] = cnt++;
            }
        }
        for (int x[] : scores) {
            for (int y : x) {
                System.out.println("Value: " + y);
            }
        }
    }
}
class week6_class_10 {
    public static void main(String[] args) {
        int cnt = 0;
        int arr[][] = new int[5][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];
        arr[4] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]= " + arr[i][j]);
            }
            System.out.println();
        }
    }
}

class week6_class_11 {
    public static void main(String[] args) {
        String arr[][];
        arr = new String[5][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new String[i+1];

            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "" + j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
            System.out.println();    
        }
    }
}

class week_class_12 {
    public static void main(String[] args) {
        int arr[][] = {
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}