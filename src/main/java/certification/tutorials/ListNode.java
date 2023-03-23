package certification.tutorials;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListNode<T> {

	private T data;
	private ListNode<T> next;
	private ListNode<T> prev;

	public ListNode(T data) {
		super();
		this.data = data;
	}

	public ListNode(T data, ListNode<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	/**
	 * 
	 * @param list
	 */
	public ListNode(List<T> list) {

		ListNode<T> currListNode = this;
		currListNode.data = list.get(0);
		for (int i = 0; i < list.size(); i++) {

			currListNode.next = new ListNode<>(list.get(i));
			currListNode.next.prev = currListNode;
			currListNode = currListNode.getNext();
		}
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

	public ListNode<T> getPrev() {
		return prev;
	}

	public void setPrev(ListNode<T> prev) {
		this.prev = prev;
	}

	public void print() {
		ListNode<T> currenListNode = this;

		while (currenListNode != null) {
			System.out.println(currenListNode.data + "t");
			currenListNode = currenListNode.next;

		}
	}

	/**
	 * 
	 * @param class1
	 * @return arr
	 */
	public T[] data(Class<T> class1) {

		List<T> values = new ArrayList<>();
		ListNode<T> currentListNode = this;
		while (currentListNode != null) {
			values.add(currentListNode.data);
			currentListNode = currentListNode.next;
		}

		T[] arr = (T[]) Array.newInstance(class1, values.size());

		for (int i = 0; i < values.size(); i++) {

			arr[i] = values.get(i);
		}
		return arr;
	}

	public int length() {

		ListNode<T> currentListNode = this;
		int length = 0;
		while (currentListNode != null) {
			length++;
			currentListNode = currentListNode.next;
		}
		return length;
	}

	@Override
	public String toString() {
		return data + "";
	}

}
