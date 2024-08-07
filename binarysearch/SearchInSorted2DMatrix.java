package binarysearch;

public class SearchInSorted2DMatrix {

    //Better Approach
    //TC = O(n*log(m))
    //SC = O(1)
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int low = i;
            int high = m - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (matrix[low][mid] == target) {
                    return true;
                } else if (matrix[low][mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    //Optimal approach
    //TC = O(log(m*n))
    public static  boolean searchMatrix2(int [][] matrix,int target){
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = (m*n)-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid/m;
            int col = mid%m;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public  static  void main(String[] args){

        int target = 15;
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix1(matrix,target));

    }
}
