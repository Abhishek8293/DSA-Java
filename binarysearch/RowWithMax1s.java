package binarysearch;

public class RowWithMax1s {

    //Brute Force Approach
    //Time complexity = O(n*m)
    //Space Complexity = O(1)
    public static int rowWithMax1s(int [][] arr){

        int n = arr.length;
        int m = arr[0].length;
        int ans = -1;
        for (int i=0;i<n;i++){
            int countOf1s = 0;
            for (int j=0;j<m;j++){
                if(arr[i][j]==1){
                    countOf1s++;
                }
            }
            if (countOf1s>0){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //int arr [][] = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        int arr [] [] = {{0,0},{0,0}};
        System.out.println(rowWithMax1s(arr));
    }
}
