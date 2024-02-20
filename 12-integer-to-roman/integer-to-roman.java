class Solution 
{
    public String intToRoman(int num) 
    {
        String result = "";
        int digit = 0;
        boolean ifPreviousZero = false; 
        
        int placeHolder = 1; 
        while( num > 0)
        {
            digit = num%10;
            num = num/10;
            
            //take care of 0
            if (digit == 0)
            {
                ifPreviousZero = true; 
            }
            else
            {
                ifPreviousZero = false; 
            }
            
            if(placeHolder ==1)
            {
              
                if(digit > 0 && digit <=3)
                {
                    int iterate = 0;
                    String current = "";
                    while (iterate< digit)
                    {
                        current = current + "I";
                        iterate++;
                    }
                    result = current;
                }

                else if(digit == 4)
                {
                    result = "IV";
                }

                else if (digit == 5)
                {
                    result = "V";
                }

                else if (digit > 5 && digit <9)
                {
                    String current ="";
                    int iterate = 0;
                    while(iterate < digit-5)
                    {
                        current = current + "I";
                        iterate++;
                    }
                    result = "V"+ current;
                }
                else if (digit == 9)
                {
                     result = "IX";
                }
                placeHolder++;
            }
            
            else if (placeHolder ==2)
            {
                    
                if(digit > 0 && digit <=3)
                {
                    int iterate = 0;
                    String current = "";
                    while (iterate< digit)
                    {
                        current = current + "X";
                        iterate++;
                    }
                    
                    if(ifPreviousZero)
                    {
                        result = current;
                    }
                    else
                    {
                        result = current +result;
                    }
                    
                }
                else if(digit == 4)
                {
                    if(ifPreviousZero)
                    {
                        result = "XL";
                    }
                    else
                    {
                        result = "XL" +result;
                    }
                    
                }

                else if (digit == 5)
                {
                    if(ifPreviousZero)
                    {
                        result = "L";
                    }
                    else
                    {
                        result = "L" +result;
                    }
                    
                }

                else if (digit > 5 && digit <9)
                {
                    String current ="";
                    int iterate = 0;
                    while(iterate < digit-5)
                    {
                        current = current + "X";
                        iterate++;
                    }
                    current = "L" + current;
                    
                    if(ifPreviousZero)
                    {
                        result = current;
                    }
                    else
                    {
                        result = current +result;
                    }
                }
                
                else if (digit == 9)
                {
                    if(ifPreviousZero)
                    {
                        result = "XC";
                    }
                    else
                    {
                        result = "XC" +result;
                    }
                    
                }
                placeHolder++;

            }
            
            else if (placeHolder ==3)
            {
               
                if(digit > 0 && digit <=3)
                {
                    int iterate = 0;
                    String current = "";
                    while (iterate< digit)
                    {
                        current = current + "C";
                        iterate++;
                    }
                    if(ifPreviousZero)
                    {
                        result = current;
                    }
                    else
                    {
                        result = current +result;
                    }
                    
                }
                else if(digit == 4)
                {
                    if(ifPreviousZero)
                    {
                        result = "CD";
                    }
                    else
                    {
                        result = "CD" +result;
                    }
                    
                }

                else if (digit == 5)
                {
                    if(ifPreviousZero)
                    {
                        result = "D";
                    }
                    else
                    {
                        result = "D" +result;
                    }
                    
                }

                else if (digit > 5 && digit <9)
                {
                    String current ="";
                    int iterate = 0;
                    while(iterate < digit-5)
                    {
                        current = current + "C";
                        iterate++;
                    }
                    
                    current = "D"+ current;
                    if(ifPreviousZero)
                    {
                        result = current;
                    }
                    else
                    {
                        result = current +result;
                    }
                }
                
                else if (digit == 9)
                {
                    if(ifPreviousZero)
                    {
                        result = "CM";
                    }
                    else
                    {
                        result = "CM" +result;
                    }
                    
                }
                placeHolder++;

            }
            
            else if (placeHolder ==4)
            {
                if(digit > 0 && digit <=3)
                {
                    int iterate = 0;
                    String current = "";
                    while (iterate< digit)
                    {
                        current = current + "M";
                        iterate++;
                    }
                    if(ifPreviousZero)
                    {
                        result = current;
                    }
                    else
                    {
                        result = current +result;
                    }
                    
                }
            }           
            
        }
        
        //return result
        
        return result;
       
    }
}