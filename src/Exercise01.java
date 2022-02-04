import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

    //Right Rotation
    public static int[][] right (int[][] a){
        int N = a.length;
        int[][] a01 = new int[N][N];
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                a01[i][j] = a[N - 1 - j][i];
            }
        }
        return a01;
    }

    //Left Rotation
    public static int[][] left (int[][] a){
        int N = a.length;
        int[][] a01 = new int[N][N];
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                a01[i][j] = a[j][N - 1 - i];
            }
        }
        return a01;
    }

    public static char[][] right (char[][] a){
        int N = a.length;
        char[][] a01 = new char[N][N];
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                a01[i][j] = a[N - 1 - j][i];
            }
        }
        return a01;
    }

    //Left Rotation
    public static char[][] left (char[][] a){
        int N = a.length;
        char[][] a01 = new char[N][N];
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                a01[i][j] = a[j][N - 1 - i];
            }
        }
        return a01;
    }


    //Print array
    static void print(int a[][]){
        int N = a.length;
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(a[i][j] + "        ");
            }
            System.out.println();
            System.out.println();
        }
    }

    static void print(char a[][]){
        int N = a.length;
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(a[i][j] + "        ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main (String []args){

        System.out.println("-------ROTATE A MATRIX BY 90 DEGREES-------");
        Scanner scanner= new Scanner(System.in);
        //Generate a random matrix
        System.out.println("If you want a matrix of characters press 'c'");
        System.out.println("If you want a matrix of integers press 'i'");
        System.out.println("If you want to stop press 's'");
        System.out.print("Please insert your decision (c/i/s): ");

        char dec01 = scanner.next().charAt(0);

        while(dec01 != 's') {

            System.out.print("Choose the dimension of array: ");
            int N = scanner.nextInt();

            Random random = new Random();
            int[][] array = new int[N][N];
            char[][] matrix = new char[N][N];

            //Select your decision for the rotation
            int dec02 = 0;
            System.out.println("If you want to rotate from the right side press 1");
            System.out.println("If you want to rotate from the left side press 2");
            System.out.println("If you want to close the programme press 3");


            if (dec01 == 'c') {

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        matrix[i][j] = ((char) (random.nextInt(26) + 'a'));
                    }
                }

                //Print new array for check
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[i][j] + "    ");
                    }
                    System.out.println();
                }
            } else {

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        array[i][j] = (int) (Math.random() * 10);
                    }
                }

                //Print new array for check
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(array[i][j] + "    ");
                    }
                    System.out.println();
                }
            }


            //Array for test
        /*int array[][] = { { 1, 2, 3, 4},
                            { 5, 6, 7, 8},
                            { 9, 10, 11, 12},
                            { 13, 14, 15, 16} };*/

        /*char matrix[][] = { { 'a', 'b', 'c', 'd'},
                            { 'e', 'f', 'g', 'h'},
                            { 'i', 'j', 'k', 'l'},
                            { 'm', 'n', 'o', 'p'} };*/


            while (dec02 != 3) {

                System.out.print("Please insert your decision: ");
                dec02 = scanner.nextInt();


                if (dec01 == 'i') {
                    if (dec02 == 1) {
                        array = right(array);
                        print(array);
                    }
                    if (dec02 == 2) {
                        array = left(array);
                        print(array);
                    }
                }
                if (dec01 == 'c') {
                    if (dec02 == 1) {
                        matrix = right(matrix);
                        print(matrix);
                    }
                    if (dec02 == 2) {
                        matrix = left(matrix);
                        print(matrix);
                    }
                }
            }
            System.out.print("If you want to stop press 's' otherwise choose again the type of matrix 'c/i': ");
            dec01 = scanner.next().charAt(0);
        }
        System.out.println("GOODBYE");

    }
}
