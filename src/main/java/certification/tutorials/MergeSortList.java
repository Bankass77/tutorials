package certification.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortList {

	private ListNode<Integer> mergeKList(List<ListNode<Integer>> listNodes) {

		if (listNodes == null || listNodes.isEmpty()) {

			return null;
		}

		if (listNodes.size() == 1) {

			return listNodes.get(0);

		}

		int interval = 1;

		while (interval < listNodes.size()) {

			for (int i = 0; i + interval < listNodes.size(); i = i + interval * 2) {

				listNodes.set(i, mergedTwoList(listNodes.get(i), listNodes.get(i + interval)));
			}
			interval *= 2;
		}
		return listNodes.get(0);

	}

	private static ListNode<Integer> mergedTwoList(ListNode<Integer> firstListNode, ListNode<Integer> secondListNode) {

		ListNode<Integer> firtHead = firstListNode;
		ListNode<Integer> secondHead = secondListNode;

		if (firtHead == null && secondHead == null) {
			return firtHead;
		}

		if (firtHead == null) {
			return secondHead;
		}

		ListNode<Integer> head = new ListNode<Integer>(0);
		ListNode<Integer> resulListNode = head;
		while (firtHead != null && secondHead != null) {
			if (firtHead.getData() < secondHead.getData()) {
				head.setNext(firtHead);
				firtHead = firtHead.getNext();

			} else {

				head.setNext(secondHead);
				secondHead = secondHead.getNext();

			}

			head = head.getNext();
		}

		if (firtHead == null) {
			head.setNext(secondHead);
		}
		if (secondHead == null) {
			head.setNext(firtHead);
		}
		return resulListNode.getNext();

	}

	public static void main(String[] args) {

		ListNode<Integer> listNode1 = new ListNode<Integer>(Arrays.asList(10, 15, 30));
		ListNode<Integer> listNode2 = new ListNode<Integer>(Arrays.asList(12, 15, 20));
		ListNode<Integer> listNode3 = new ListNode<Integer>(Arrays.asList(17, 20, 32));
		List<ListNode<Integer>> listNodes = new ArrayList<>();
		listNodes.add(listNode1);
		listNodes.add(listNode2);
		listNodes.add(listNode3);

		assertArrayEquals(new Integer[] { 10, 12, 15, 15, 17, 20, 20, 30, 32 },
				new MergeSortList().mergeKList(listNodes).data(Integer.class));

	}

}
