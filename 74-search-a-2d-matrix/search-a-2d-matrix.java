class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m,n;
        for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j]==target)
        {
            return true;
        }
        }
    }
    return false;
    }
}
//        int left = 0, right = m*n- 1;
//        int result[]=new int[m*n];
//        int index = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 result[index++] = matrix[i][j]; // Store element in 1D array
//             }
//         }
//            while (left <= right) {
//             int mid =( left + right )/ 2;

//             if (result[mid] == target) {
//                 return true;
//             } else if (result[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
    
//  return false;
