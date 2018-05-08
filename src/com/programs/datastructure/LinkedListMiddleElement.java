package com.programs.datastructure;

public class LinkedListMiddleElement {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	public void addEle(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void printList() {
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}

	public void printMiddleEle() {
		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println(slowPointer.data);

	}

	public static void main(String[] args) {
		LinkedListMiddleElement midEle = new LinkedListMiddleElement();
		midEle.addEle(1);
		midEle.addEle(2);
		midEle.addEle(3);
		midEle.addEle(4);
		midEle.addEle(5);
		midEle.addEle(6);
		midEle.addEle(7);
		//midEle.printList();
		// print middle element
		midEle.printMiddleEle();

	}

}
