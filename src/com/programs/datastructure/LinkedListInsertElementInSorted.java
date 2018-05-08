package com.programs.datastructure;


public class LinkedListInsertElementInSorted {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}
	}

	public void addEle(int value) {
		Node newEle = new Node(value);
		Node headEle = head;
		if (headEle == null) {
			head = newEle;
		} else {
			while (headEle.next != null) {
				headEle = headEle.next;
			}
			headEle.next = newEle;
		}
	}

	public void insertEleInSorted(int value) {
		Node newNode = new Node(value);
		Node current = head;
		if (current == null) {
			System.out.println("Head Null");
			current = newNode;
			return;
		}

		while (current.next != null && current.next.data < value) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public void printList() { 
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListInsertElementInSorted linkeList = new LinkedListInsertElementInSorted();
		linkeList.addEle(1);
		linkeList.addEle(3);
		linkeList.addEle(5);
		linkeList.addEle(7);
		System.out.println("Inserted");
		linkeList.insertEleInSorted(6);
		linkeList.printList();
	}

}
