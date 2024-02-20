class Solution 
{
     //creating array with the values
        final static int[] arrValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};    

        //creating corresponding symbols for values in array arrValue
        final static String[] arrSymbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) 
    {
       

        //resultant string
        StringBuilder result = new StringBuilder();

        //for loop to go through each value
        for ( int index =0; num >0; index++)
        {
            //keep on subtracting the currently pointed value from the number and add the corresponding symbol
            while(arrValue[index] <= num)
            {           
                num = num - arrValue[index];
                result.append(arrSymbol[index]);
            }
        }
        //return result        
        return result.toString();
       
    }
}

