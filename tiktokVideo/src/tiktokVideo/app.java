package tiktokVideo;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Video[] videos = new Video[] { new Video(1, "an", "hay", "10 phut"), new Video(3, "lac", "hay cuc", "10 phut"),
				new Video(4, "ngu", "hay", "10 phut"), new Video(6, "uong", "ngon", "11 phut"),
				new Video(5, "nghi", "do", "20 phut"), new Video(2, "nhay", "dep", "12 phut"),
				new Video(7, "hoc", "te", "10 phut"), new Video(9, "hat", "hay", "16 phut") };
		DoubleLinklist list = new DoubleLinklist(videos);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("=================== Menu ===================");
			System.out.println("1. Add Video: ");
			System.out.println("2. Remove videos: ");
			System.out.println("3. Display videos: ");
			System.out.println("4. Search by keyword: ");
			System.out.println("5. Remove by keyword: ");
			System.out.println("6. Exit");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				list.add();
				System.out.println();
				break;
			case 2:
				System.out.print("Enter id want remove: ");
				int id = scanner.nextInt();
				list.removeID(id);
				System.out.println("Done!!!");
				System.out.println();
				break;
			case 3:
				list.display();
				System.out.println();
				break;
			case 4:
				System.out.print("Enter keyword want search: ");
				String keyword1 = scanner.next();
				list.searchKeyword(keyword1);
				System.out.println();
				break;
			case 5:
				System.out.print("Enter keyword want remove: ");
				String keyword2 = scanner.next();
				list.removeKeyword(keyword2);
				System.out.println();
				break;
			case 6:

				System.out.println();
				break;
			}
		} while (choice != 7);
		scanner.close();
		System.out.println("Good bye!!!");
	}
}
