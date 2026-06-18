// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m,n;
//         for (int i = 0; i < matrix.length; i++) {
//     for (int j = 0; j < matrix[i].length; j++) {
//         if(matrix[i][j]==target)
//         {
//             return true;
//         }
//         }
//     }
//     return false;
//     }
// }

// class Solution{
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length, n = matrix[0].length;
//         int left = 0, right = m * n - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int midValue = matrix[mid / n][mid % n];

//             if (midValue == target) {
//                 return true;
//             } else if (midValue < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return false;
//     }
// }
    
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            int val = matrix[row][col];
            if (val == target) return true;
            else if (val > target) col--;   
            else row++;                    
        }

        return false;
    }
}