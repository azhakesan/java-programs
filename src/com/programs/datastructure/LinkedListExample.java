package com.programs.datastructure;

/**
 * 
 * Add and Delete node into the Linked List
 *
 */
public class LinkedListExample {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	public void addEle(int newData) {
		Node node = new Node(newData);
		if (head == null) {
			head = node;
		} else {
			while (head.next != null) {
				head = head.next;
			}
			System.out.println(node.data);
			head.next = node;
		}
	}

	public void deleteEle(int delData) {
		Node headCopy = head, prev = null;
		if (headCopy != null && headCopy.data == delData) {
			head = headCopy.next;
			return;
		}
		while (headCopy != null && headCopy.data != delData) {
			prev = headCopy;
			headCopy = headCopy.next;
		}
		if (headCopy == null) {
			return;
		}
		prev.next = headCopy.next;
	}

	public void printLinkedList() {

		Node nd = head;
		while (nd != null) {
			System.out.print(nd.data + "->");
			nd = nd.next;
		}
	}

	public static void main(String arg[]) {
		LinkedListExample linkedList = new LinkedListExample();
		linkedList.addEle(1);
		linkedList.addEle(2);
		linkedList.addEle(3);
		linkedList.addEle(4);
		System.out.println();
		linkedList.printLinkedList();

		// linkedList.deleteEle(4);
		// linkedList.printLinkedList();
	}
}
