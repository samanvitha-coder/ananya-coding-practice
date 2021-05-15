package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class GetDecimalValue {
    static class ListNode
    {
        int val;
        ListNode next;
    };

    static ListNode newNode(int data)
    {
        ListNode temp = new ListNode();
        temp.val = data;
        temp.next = null;
        return temp;
    }

    static int getDecimalValue(ListNode head) {
        int n=head.val;
        while(head.next!=null){
            n = n*2 + head.next.val;
            head = head.next;
        }
        return n;
    }
    public static void main(String args[])
    {
        // Start with the empty list /
        ListNode head = newNode(1);
        head.next = newNode(0);
        head.next.next = newNode(1);
        head.next.next.next = newNode(1);

        System.out.print( "Decimal value is "+getDecimalValue(head));
    }
}
