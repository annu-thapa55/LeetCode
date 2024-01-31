class Solution 
{
    public String reverseWords(String s) 
    {
        //string array that stores the words in input string s.
        String[] words = s.split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length -1; i>=0; i--)
        {
            sb.append(words[i]+" ");       
        }

        return sb.toString().trim();

    }
}