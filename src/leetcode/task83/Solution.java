package leetcode.task83;
//Учитывая head отсортированного связанного списка, удалите все дубликаты так,
//чтобы каждый элемент появлялся только один раз. Верните связанный список,
//также отсортированный
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}