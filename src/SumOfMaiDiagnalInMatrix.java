import java.util.Scanner;
public class SumOfMaiDiagnalInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.printf("%-3d",matrix[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=matrix[i][i];
            }
        System.out.println("Sum of elements on diagonal matrix is "+sum);
        System.out.print("Sum of colum, colum: ");
        int colum =scanner.nextInt();
        int sumOfColum=0;
        for (int i=0;i<size;i++){
            sumOfColum+=matrix[i][colum];
        }
        System.out.println("Sum of colum "+colum+"is "+sumOfColum);
        }

    }