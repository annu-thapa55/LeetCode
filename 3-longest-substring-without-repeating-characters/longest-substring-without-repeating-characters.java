class Solution {
    public int lengthOfLongestSubstring(String s) {

        //start point of the substring
        int start =0;

        //hash map to store the character as key and index as the value
        HashMap<Character, Integer> chars = new HashMap <Character, Integer> ();

        //length of the maxlength substring
        int maxLength = 0;

        //loop to go through each character and compare the character to the HashMap to find duplicate

        for ( int end =0 ; end < s.length(); end++)
        {

            //current character

            char currentChar = s.charAt(end);
             //compare if the character is already at HashMap
            if(chars.containsKey(currentChar))
            {
                //update start pointing to the current character
                start = Math.max(start, (chars.get(currentChar)+1)); 
            }
            
            //max length is updated by taking the larger value between maxLength or the current substring length 
             maxLength = Math.max(maxLength, (end -start +1)); 
            
            //putting the character at the HashMap with character as the key and index of the character as the value
             chars.put(currentChar, end);
        }

           //return the length of longest substring
        return maxLength; 
    }

    public static void main (String[] args)
    {
        Solution test = new Solution(); 
        test.lengthOfLongestSubstring("abcabcbb");
    }
}