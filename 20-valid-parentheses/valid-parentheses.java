class Solution 
{
    public boolean isValid(String s) 
    {
        //stack for pushing and popping brackets as characters
        Stack<Character> stack = new Stack<>();

        //converting the input string value as a character array and looping through each character
        for(char c: s.toCharArray())
        {
            //pushing opening brackets
            if( c == '(' || c == '{'  || c == '[')
            {
                stack.push(c);
            }

            // popping the closing brackets
            else
            {
                //if there is no opening brackets and just closing brackets, return false
                if(stack.isEmpty())
                {
                    return false;
                }

                else
                {
                   
                    // keep on checking if the current closing bracket can pop out the corresponding opening bracket.
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))
                    {
                        stack.pop();
                    }
                    //if the current closing bracket can not pop out the top opening bracket in the stack,return false
                    else
                    {
                        return false;
                    }
                               

                }
            }
        }
        // return true if all the pushed opening brackets are popped out by the corresponding closing brackets in valid order. Else false
         return stack.isEmpty();   
    }
}