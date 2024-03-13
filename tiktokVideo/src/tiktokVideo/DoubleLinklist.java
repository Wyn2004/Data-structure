package tiktokVideo;

import java.util.Scanner;

class Node {
	Video value;
	Node prev;
	Node next;

	Node(Video value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	Node(Video value, Node prev, Node next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
}

public class DoubleLinklist {
	Node head, tail;
	Scanner scanner = new Scanner(System.in);

	public DoubleLinklist(Video[] arr) {
		for (Video video : arr)
			addLast(video);
	}

	public DoubleLinklist(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}

	public void addLast(Video video) {
		Node newNode = new Node(video);
		if (head == null)
			head = tail = newNode;
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void add() {
		System.out.print("Enter id: ");
		int id = scanner.nextInt();
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		System.out.print("Enter decription: ");
		String decription = scanner.nextLine();
		System.out.print("Enter time: ");
		String time = scanner.nextLine();
		Video newVideo = new Video(id, title, decription, time);
		addLast(newVideo);
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value.toString());
			temp = temp.next;
		}
	}

	public void removeID(int id) {
		if (head == null) {
			System.err.println("List is empty!!!");
			return;
		}
		if (head.value.video_id == id) {
			head = head.next;
			head.prev = null;
			return;
		}
		if (tail.value.video_id == id) {
			tail = tail.prev;
			tail.next = null;
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.value.video_id == id) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
			}
			temp = temp.next;
		}
	}

	public void searchKeyword(String keyWord) {
		if (head == null) {
			System.err.println("List is empty!!!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.value.decription.contains(keyWord) || temp.value.title.contains(keyWord)) {
				System.out.println(temp.value.toString());
			}
			temp = temp.next;
		}
	}
	public void removeKeyword(String keyword) {
		if (head == null) {
			System.err.println("List is empty!!!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.value.decription.contains(keyword) || temp.value.title.contains(keyword)) 
				removeID(temp.value.video_id);
			temp = temp.next;
		}
		System.out.println("Done!!!");
	}
}
