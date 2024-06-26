import java.util.Scanner;
public class ArrayReplacement {
    public static void main(String[] args) {
        // import scanner
        Scanner sc = new Scanner(System.in);

        // declare the array x and allocate memory 
        int[] x = new int[10];

        // reading the first 10 int values 
        System.out.println("Enter 10 integers");
            for (int i = 0; i < x.length; i++){
                x[i] = sc.nextInt();
            }

        // change negatives or zero for 1
        for (int i = 0; i <= x.length; i++){
            if (x[i] <= 0){
                x[i] = 1;
            }
        }

        // print array
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        // close scanner method
        sc.close();

    }
}