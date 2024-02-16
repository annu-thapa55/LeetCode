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
    public ListNode reverseList(ListNode head) 
    {
        //returning head if the head is null
        if (head == null)
            return head;
        
        //assigning values to current, previous and next ListNode variables.
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        //traversing until the end of the linked list where two nodes are operated in each iteration to reverse
        while (current!=null)
        {
            //next points to the second node in reverse operation
            next = current.next;
            //performing reverse operation
            current.next = previous;
            //pointing to the first node in reverse operation
            previous = current;
            // traversing by one node to perform reverse operation in next iteration
            current = next;
        }
    
        // returning previous as it points to the last node of the input linked list
        return previous; 
    }
}