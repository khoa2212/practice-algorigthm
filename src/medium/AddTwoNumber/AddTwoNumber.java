package medium.AddTwoNumber;

public class AddTwoNumber {
    public ListNode solution (ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode result = new ListNode(sum % 10);
        ListNode curNode = result;
        int remain = sum /10;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + remain; // 6 + 9 = 15
            remain = sum / 10; // 15 / 10 = 1
            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode remainNode = l1 != null ? l1 : l2;

        while (remainNode != null) {
            sum = remainNode.val + remain;
            remain = sum / 10;
            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;
            remainNode = remainNode.next;
        }

        if(remain != 0) {
            curNode.next = new ListNode(remain);
        }

        return result;
    }
}
