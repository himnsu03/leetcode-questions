class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters = new boolean[26]; // Array to track the occurrence of each letter
        
        for (char c : sentence.toCharArray()) {
            int index = c - 'a'; // Calculate the index for the current letter
            
            // Mark the letter as present in the sentence
            letters[index] = true;
        }
        
        // Check if all letters are present
        for (boolean letter : letters) {
            if (!letter) {
                return false; // If any letter is missing, return false
            }
        }
        
        return true; // If all letters are present, return true
    }
}
