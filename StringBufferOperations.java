package Arithmetic1;

import java.util.Scanner;

public class StringBufferOperations {
	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Choose an operation to perform:");
			System.out.println("1.Append");
			System.out.println("2.Insert");
			System.out.println("3.Delete");
			System.out.println("4. DeleteCharAt");
			System.out.println("5. Replace");
			System.out.println("6. Substring (Start Index)");
			System.out.println("7. Substring (Start Index, End Index)");
			System.out.println("8. Reverse");
			System.out.println("9. Length");
			System.out.println("10. Capacity");
			System.out.println("11. CharAt");
			System.out.println("12. SetCharAt");
			System.out.println("13. IndexOf");
			System.out.println("14. LastIndexOf");
			System.out.println("15. Convert StringBuffer to String");
			System.out.println("0. Exit");

			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			switch (choice) {
			case 1:
				System.out.println("**1. Append***");
				System.out.println("Enter string to append:");
				stringBuffer.append(scanner.nextLine());
				break;
			case 2:
				System.out.println("***2. Insert***");
				System.out.println("Enter index to insert at:");
				int index = scanner.nextInt();
				System.out.println("Enter string to insert:");
				scanner.nextLine(); // Consume newline character
				String strToInsert = scanner.nextLine();
				System.out.println(stringBuffer.insert(index, strToInsert));
				break;
			case 3:
				System.out.println("3.Delete");
				System.out.println("Enter start index to delete:");
				int start = scanner.nextInt();
				System.out.println("Enter end index to delete:");
				int end = scanner.nextInt();
				stringBuffer.delete(start, end);
				break;
			case 4:
				System.out.println("4. DeleteCharAt");
				System.out.println("Enter index to delete character:");
				int charIndex = scanner.nextInt();
				stringBuffer.deleteCharAt(charIndex);
				break;
			case 5:
				System.out.println("5. Replace");
				System.out.println("Enter start index to replace:");
				int replaceStart = scanner.nextInt();
				System.out.println("Enter end index to replace:");
				int replaceEnd = scanner.nextInt();
				System.out.println("Enter replacement string:");
				scanner.nextLine(); // Consume newline character
				String replacement = scanner.nextLine();
				stringBuffer.replace(replaceStart, replaceEnd, replacement);
				break;
			case 6:
				System.out.println("6. Substring (Start Index)");
				System.out.println("Enter start index for substring:");
				int subStartIndex = scanner.nextInt();
				System.out.println("Substring: " + stringBuffer.substring(subStartIndex));
				break;
			case 7:
				System.out.println("7. Substring (Start Index, End Index)");
				System.out.println("Enter start index for substring:");
				int subStart = scanner.nextInt();
				System.out.println("Enter end index for substring:");
				int subEnd = scanner.nextInt();
				System.out.println("Substring: " + stringBuffer.substring(subStart, subEnd));
				break;
			case 8:
				System.out.println("8. Reverse");
				stringBuffer.reverse();
				System.out.println("Reversed StringBuffer: " + stringBuffer);
				break;
			case 9:
				System.out.println("9. Length");
				System.out.println("Length of StringBuffer: " + stringBuffer.length());
				break;
			case 10:
				System.out.println("10. Capacity");
				System.out.println("Capacity of StringBuffer: " + stringBuffer.capacity());
				break;
			case 11:
				System.out.println("11. CharAt");
				System.out.println("Enter index to get character:");
				int charIdx = scanner.nextInt();
				System.out.println("Character at index " + charIdx + ": " + stringBuffer.charAt(charIdx));
				break;
			case 12:
				System.out.println("12. SetCharAt");
				System.out.println("Enter index to set character:");
				int setIdx = scanner.nextInt();
				System.out.println("Enter character to set:");
				char setChar = scanner.next().charAt(0);
				stringBuffer.setCharAt(setIdx, setChar);
				break;
			case 13:
				System.out.println("13. IndexOf");
				System.out.println("Enter string to find index of:");
				String searchStr = scanner.next();
				System.out.println("Index of '" + searchStr + "': " + stringBuffer.indexOf(searchStr));
				break;
			case 14:
				System.out.println("14. LastIndexOf");
				System.out.println("Enter string to find last index of:");
				String searchLastStr = scanner.next();
				System.out.println("Last Index of '" + searchLastStr + "': " + stringBuffer.lastIndexOf(searchLastStr));
				break;
			case 15:
				System.out.println("15. Convert StringBuffer to String");
				System.out.println("StringBuffer to String: " + stringBuffer.toString());
				break;
			case 0:
				System.out.println("Exiting program.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 0);

		scanner.close();
	}
}
