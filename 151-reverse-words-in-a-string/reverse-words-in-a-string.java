class Solution 
{
    public String reverseWords(String s) 
    {
        //string array that stores the words in input string s.
        String[] words = s.trim().split("\\s* ");
        //stack of type string
        Stack<String>stack = new Stack<>();
        
        //convert the string to array of words and iterate through each word
        for(String word: words)
        {
            //push a word in a stack in each iteration
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        
        //counter to indicate the first and last elements
        int count =0;
        while(!stack.isEmpty())
        {
            if (count == words.length-1)
            {
                sb.append(stack.pop());
                count++;
            }
            else
            {
                sb.append(stack.pop()+ " ");
                count++;
            }
        }
        return sb.toString();

    }
}