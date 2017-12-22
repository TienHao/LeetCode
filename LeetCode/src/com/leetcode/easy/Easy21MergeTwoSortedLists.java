package com.leetcode.easy;

import com.leetcode.common.ListNode;

public class Easy21MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null ) {
			return l2;
		}
		if(l2==null){
			return l1;
		}
		ListNode baseList;
		ListNode insertList;
		if (l1.val > l2.val) {
			baseList = l2;
			insertList = l1;
		} else {
			baseList = l1;
			insertList = l2;
		}

		ListNode compared = baseList;
		while (insertList != null) {

			while (insertList.val > compared.val) {
				ListNode next = compared.next;
				if (next == null) {
					break;
				}
				if (insertList.val <= next.val) {
					break;
				}
				compared = compared.next;
			}

			if (compared.next == null) {
				compared.next = insertList;
				insertList = null;
				break;
			} else {
				ListNode insertNode = new ListNode(insertList.val);
				insertNode.next = compared.next;
				compared.next = insertNode;
			}

			insertList = insertList.next;
			compared = compared.next;
		}
		return baseList;

	}

	public static void main(String[] args) {
		Easy21MergeTwoSortedLists dfdf = new Easy21MergeTwoSortedLists();
		ListNode a3 = new ListNode(4);
		ListNode a2 = new ListNode(2);
		ListNode a1 = new ListNode(1);
		a2.next = a3;
		a1.next = a2;

		ListNode b3 = new ListNode(4);
		ListNode b2 = new ListNode(3);
		ListNode b1 = new ListNode(1);
		b2.next = b3;
		b1.next = b2;

		ListNode sss = dfdf.mergeTwoLists(a1, b1);
		System.out.println(sss);
	}

}
