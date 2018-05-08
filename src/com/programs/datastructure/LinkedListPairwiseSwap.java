package com.programs.datastructure;

/**
 * int k=currentNode.Data;
 * currentNode.data = currentNode.next.next.data;
 * currentNode.next.next.data = k; 
 * currentNode = currentNode.next.next;
 */
public class LinkedListPairwiseSwap {
	Node head;

	class Node {
		int data;
		Node next = null;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	private void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	private void printList() {
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}

	private void pairWiseSwap() {
		Node current = head;
		while (current != null && current.next != null) {
			int k = current.data;
			current.data = current.next.data;
			current.next.data = k;
			current = current.next.next;
		}
	}

	public static void main(String[] args) {
		LinkedListPairwiseSwap ps = new LinkedListPairwiseSwap();
		ps.add(1);
		ps.add(2);
		ps.add(3);
		ps.add(4);
		ps.add(5);
		ps.add(6);
		ps.printList();
		ps.pairWiseSwap();
		ps.printList();

	}

}
