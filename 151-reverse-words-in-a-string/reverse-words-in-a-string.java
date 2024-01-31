class Solution 
{
    public String reverseWords(String s) 
    {
        /**
        string array that stores the words in input string s.
        trim() removes white space from both ends of the input string s.
        split(" +") removes one or more spaces in the input string s.
         */
        String[] words = s.trim().split(" +");

        StringBuilder sb = new StringBuilder();

        //looping through words array until the second word element and adding a space after each word
        for(int i = words.length -1; i>0; i--)
        {
            sb.append(words[i]+" ");       
        }

        // appending last word without space
        sb.append(words[0]);

        //returning input string with reversed words
        return sb.toString();

    }
}