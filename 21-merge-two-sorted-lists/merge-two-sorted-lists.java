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
        // creating a dummy node as a new node.  
        ListNode result = new ListNode();
        //temporary node pointing to newly created dummy node to perform weaving
        ListNode temp = result;


        //condition of the loop should be that neither of the two nodes pointed by list1 and list2 should be null. 
        //condition of one list being exhausted first than another will be taken care after the loop
        while (list1!=null && list2 !=null)
        {
            //weave lesser value node to the temp and advance weaved list by one node
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
            //advance temp by one node after weaving
            temp = temp.next;

        }

        // if list1 is not exhausted
        if(list1 != null)
        {
            temp.next = list1;
        }
        // if list2 is not exhausted
        else  
        {
            temp.next = list2;
        }


        //return the head of the merged list as the head is pointed by the result.next after excluding the dummy node. 
        return result.next;
       
    }
}

