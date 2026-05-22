class Solution {
    public int secondHighest(String s) {
          int largest = -1;
        int second = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {

                int num = c - '0';
                if (num > largest) {

                    second = largest;
                    largest = num;
                }

                else if (num != largest && num > second) {

                    second = num;
                }
            }
        }
        return second;
    }
}