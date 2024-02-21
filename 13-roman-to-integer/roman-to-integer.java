class Solution 
{
    //arrays with roman symbol and corresponding values
    final static String[] arrSymbol = {"M", "CM", "D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    final static int[] arrValue = {1000, 900, 500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    /**
    The main idea is to start from index 0 of arrSymbol and match each element to the substring of the input string.
    - for loop is used for checking each symbol in descending order
    - inner while loop is used for calculating the current symbol in arrSymbol for repeated symbols. Example III
     */
    public int romanToInt(String s) 
    {
        int result = 0;
        //StringBuilder for making the string manipulation efficient 
        StringBuilder inputStr = new StringBuilder(s);
        
        //variable to store the length of symbol in arrSymbol. Main intention is to check if the length of remaining inputStr in each iteration is >= lengths of the symbol at arrSymbol. 
        int symbolLength = 0;
        for(int i=0; i<arrSymbol.length && inputStr.length() > 0; i++)
        {
            symbolLength = arrSymbol[i].length();

            //Iterating through each element in arrSymbol and checking if it is equivalent to the substring taken from the remaining input string
            while(inputStr.length()>= symbolLength && inputStr.substring(0,symbolLength).equals(arrSymbol[i]))
            {
                //calculating the result.
                result = result + arrValue[i];

                //deleting the corresponding substring of the input string after value calculation.
                inputStr = inputStr.replace(0, symbolLength, "");
                
            }
        }
        //returning the result
        return result;
    }
}