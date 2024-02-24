/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
     


        //corner cases


        if(list1 == null && list2 == null)
        {
            return null;
        }


        else if(list1 == null && list2 != null)
        {
            return list2;
        }
       
        else if(list1 != null && list2 == null)
        {
            return list1;
        }
       
        else
        {
        
            //temporary node to perform weaving
            ListNode result = new ListNode(0);
            ListNode temp = result;


            //loop to compare and weave
            while (list1!=null && list2 !=null)
            {
               
                if (list1.val <= list2.val)
                {
                    temp.next = list1;
                    list1 = list1.next;
                }
                else
                {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;

            }


            // if list1 is not exhausted
            if(list1 != null)
            {
                temp.next = list1;
            }
            else
            {
                temp.next = list2;
            }


             //return the merged list
            return result.next;
        }
       


       
    }
}

