class Solution 
{
    final static String[] arrSymbol = {"M", "CM", "D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    final static int[] arrValue = {1000, 900, 500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    public int romanToInt(String s) 
    {
        int result = 0;
        StringBuilder inputStr = new StringBuilder(s);
        for(int i=0; i<arrSymbol.length && inputStr.length() > 0; i++)
        {
            while(inputStr.length()>= arrSymbol[i].length() && inputStr.substring(0,arrSymbol[i].length()).equals(arrSymbol[i]))
            {
                result = result + arrValue[i];
                inputStr = inputStr.replace(0, arrSymbol[i].length(), "");
                
            }
        }
        return result;
    }
}