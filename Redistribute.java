class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(String word : words){
            for(char ch : word.toCharArray()){
                charCount.put(ch,charCount.getOrDefault(ch,0)+1);
            }
        }
        for(int count : charCount.values()){
            if(count%words.length!=0){
                return false;
            }
        }
        return true;
    }
}
