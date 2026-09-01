class Solution {
    public boolean backspaceCompare(String s, String t) {
      int i = s.length()-1;
      int j = t.length()-1;

      while(i>=0 || j>=0){
        i = validIndex(s, i);
        j = validIndex(t, j);
        if(i < 0 && j < 0)
            return true;
        if(i < 0 || j < 0)
            return false;
        if(s.charAt(i) != t.charAt(j))
            return false;
        i--;
        j--;
      } 
      return true; 
    }

    private int validIndex(String str, int index){
        int backspace = 0;
        while(index >= 0){
            if(str.charAt(index) == '#')
                backspace++;
            else if(backspace > 0)
                backspace--;
            else
                break;
            index--;
        }
        return index;
    }
}