/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> intList = new ArrayList<>();
        
        for (ListNode ln : lists){
            
            while (ln != null){
                intList.add(ln.val); 
                ln = ln.next;
                
            }
            
           
            
        }
        
        Collections.sort(intList);
        
        ListNode headNode = new ListNode(0);
        ListNode tempNode = headNode;
        
        
        for (int i = 0 ; i < intList.size() ; i++){
            
            tempNode.next = new ListNode(intList.get(i)); 
            tempNode = tempNode.next;
                    
        }
        
        
        return headNode.next;
        
    }
}