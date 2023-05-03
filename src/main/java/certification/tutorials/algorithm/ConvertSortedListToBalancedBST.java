package certification.tutorials.algorithm;

public class ConvertSortedListToBalancedBST {

	private ListNode listNode;

	private TreeNode sortedListToBST(int start, int end) {

		if (start > end)
			return null;

		int mid = (start + end) / 2;
		TreeNode nodeLeft = sortedListToBST(start, mid - 1);
		TreeNode parent = new TreeNode(listNode.val);
		parent.left = nodeLeft;
		listNode = listNode.next;
		TreeNode nodeRight = sortedListToBST(mid + 1, end);
		parent.right = nodeRight;

		return parent;

	}
	public TreeNode sortedListToBST(ListNode head) {
		
		int n= 0;
		
		ListNode p= head;
		while (p !=null) {
			
			p=p.next;
			n++;
		}
		
		listNode= head;
		
		return sortedListToBST(0, n-1);
	}
	public static void main(String[] args) {

		ListNode listNode= new ListNode(-10);
		
		 listNode.next= new ListNode(-3);
		 listNode.next.next= new ListNode(0);
		 listNode.next.next.next= new ListNode(5);
		 listNode.next.next.next.next= new ListNode(9);
		 
		 ConvertSortedListToBalancedBST convertSortedListToBalancedBST= new ConvertSortedListToBalancedBST();
	convertSortedListToBalancedBST.sortedListToBST(listNode);
	}

}
