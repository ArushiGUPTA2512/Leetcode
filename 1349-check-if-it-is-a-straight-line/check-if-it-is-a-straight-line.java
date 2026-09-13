class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        long x1 = coordinates[0][0];
        long y1 = coordinates[0][1];

        long x2 = coordinates[1][0];
        long y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            long x = coordinates[i][0];
            long y = coordinates[i][1];

            if ((y - y1) * (x2 - x1) !=
                (y2 - y1) * (x - x1)) {
                return false;
            }
        }
        return true;
    }
}