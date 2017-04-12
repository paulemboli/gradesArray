package Review.java;

	import java.util.Scanner;

	public class gradesArray {

		public static void main(String[] args) {
			int[] arr = new int[10];

			int min = 0;
			int max = 0;
			int sumVal = 0;
			int numAbove = 0;
			int numBelow = 0;
			int index = 0;
			
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter a grade: ");
			int num = scnr.nextInt();

			while (num >= 0 && num <= 100) {
				if (index == arr.length - 1) {
					int[] arr1 = new int[arr.length + 10];
					for (int i = 0; i < arr.length; i++) {
						arr1[i] = arr[i];
					}
					arr = arr1;
				}
				arr[index] = num;
				index++;
				System.out.println("Enter a grade: ");
				num = scnr.nextInt();
			}

			for (int i = 0; i < index  ; i++) {
				sumVal = sumVal + arr[i];
				

			}

			double avg = sumVal / (index );
			

			for (int i = 0; i < index; i++) {
				if (arr[i] >= avg) {
					numAbove++;

				} else {
					numBelow++;
				}
			}
			System.out.println("Number of grades            = " + (index ));
			System.out.println("Number of grades >= average = " + numAbove);
			System.out.println("Number of grades <  average = " + numBelow);

		}

	}
