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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        while(list1 != null && list2 != null)
        {
            if(list1.val >= list2.val)
                merged.val = list2.val;
            else
                merged.val = list1.val;
            merged = merged.next;
        }
        if(list1 != null)
        {
            while(list1!=null)
        }
    }
}
