class Solution 
{
    //function to find if the string is empty or not
    public boolean  isEmpty(String s)
    {
        if (s.length() ==0 || s == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    // function to find if the string is within the constraint or not
    public boolean withinConstraint(String s, String t)
    {
        if( (s.length() >=0 && s.length() <=100) && (t.length() >=0 && t.length() <= 10000))
        {
           return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isSubsequence(String s, String t) 
    {
       
        if(!withinConstraint(s,t))
            return false;

        if( isEmpty(s) &&  !isEmpty(t))
            return true;
        
        else if(isEmpty(s) && isEmpty(t))
            return true;
        
        else if(!isEmpty(s) && isEmpty(t))
            return false;
        
        // if both  subsequence s and sequence t are not empty
        else
        {
            //variable to iterate through sub-sequence
            int subIndex = 0;

            //converting both string inputs into lower case
            s = s.toLowerCase();
            t = t.toLowerCase();

            //converting the string into array to character
            char[] subSequence = s.toCharArray();
            char[] sequence = t.toCharArray();

            //loop to iterate through sequence
            for(int i = 0; i < t.length(); i++)
            {
                //if the characters at sequence and subsequence are same, increment the value of subsequence pointer for pointing to the next character
                if( subSequence[subIndex] == sequence[i] )
                {

                    // returning "true" value if the s is the subsequence of t. 
                    if(s.length() == subIndex+1)
                    {
                        return true;
                    }
                    else
                    {
                        subIndex++;
                    }
                    
                }
            }

        //returning "false" value if the true value was not been able to be returned from the for loop. 
        return false;
            }
               
    }
}