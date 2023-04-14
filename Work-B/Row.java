public class Row{

  // function to calculate the sum of the middle row of a matrix
  public static int sumOfMiddleRow(int [][] matrix, int n, int m){
    int totalSum =0; //variable to store the total sum value

    // Iterating over the middle column and picking the middle value
    for(int col = 0; col<m; col++){
        totalSum += matrix[n/2][col];
    }
    return totalSum;
  }

  // function to calculate the sum of the middle column of a matrix
  public static int sumOfMiddleColumn(int [][] matrix, int n, int m){
    int totalSum =0; //variable to store the total sum value

    // Iterating over all rows and picking the middle value
    for(int row = 0; row<n; row++){
        totalSum += matrix[row][m/2];
    }
    return totalSum;
  }
 
  public static void main(String[] args) {
    int n= 3; // number of rows
    int m = 3; // number of columns
    // Input
    int [][]matrix = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

    System.out.println("Sum of the middle row: " + Integer.toString(sumOfMiddleRow(matrix,n,m)));
    System.out.println("Sum of the middle column: "+ Integer.toString(sumOfMiddleColumn(matrix,n,m)));
  }
}