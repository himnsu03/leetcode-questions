class Solution {
    public void reverseString(char[] s) {
        int start  = 0 ;
        int last = s.length- 1;
        swapChar(s, start , last);
    }
    void swapChar(char[] s , int start , int last){
        if(start>=last){
            return;
        }
        swap(s, start , last);
       swapChar(s, start + 1 , last-1);
    }
    void swap(char[] s , int start ,int last){
        char temp  = s[start];
        s[start] = s[last];
        s[last] = temp;
    }

}
