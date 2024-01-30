class Solution 
{
    public int reverse(int x) 
    {

        //copying the original value of x for return statement
        int originalNum = x;
        
        //ternary operator to make input parameter x as a positive number
        x = (x < 0)? x * -1: x;

        // holds the last digit 
        int lastDigit = 0;

        //reversed digit
        int reversed = 0;
        
        while ( x > 0)
        {

            // modular as the last digit
            lastDigit = x%10;
            
            //checking the condition for the out of boundry case
            if ( reversed < (-1 * Math.pow(2,31)/10) || reversed > (Math.pow(2,31)-1)/10)
                return 0;
            else
                //updating reversed number
                reversed = reversed * 10 + lastDigit;

            x= x/10;
        }

        //returning the reversed number based on the negative or positive value of x
        reversed = originalNum < 0 ? -1 * reversed: reversed;
        return reversed;
        
    }
}