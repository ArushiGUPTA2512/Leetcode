class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }

        int stones = n;
        int remove = 10;

        while (stones >= remove) {
            stones -= remove;
            remove--;
        }

        return remove % 2 == 1;
    }
}