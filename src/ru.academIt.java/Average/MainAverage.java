package Average;

import java.util.Scanner;

import static Average.Average.isNumeric;

public class MainAverage {
	public static void main(String[] args) {
		System.out.print("Найдем среднее арифметическое всех (и отдельно - только четных) цлых чисел от a до b.\n");
		Scanner scanner = new Scanner(System.in);
		String a = "";
//		int intA = Integer.parseInt(a);
		while (isNumeric(a) = false) {
			System.out.print("Задайте значение a: ");
			a = scanner.nextLine();
//			{
				if (isNumeric(a)){
					System.out.print("Вы ввели: " + a +".");
				}
//			}
		}
	}
}

//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		String strA = Integer.toString(a);
//		while (strA.length() == 0) {
//			System.out.print("Введите значение a: ");
//			a = scanner.nextInt();
//			if (a < 2) {
//				System.out.print("Ошика, введите заного");
//			} else {
//				System.out.print("Программа завершена");
//			}
//		}
//	}
//}

//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextLine();
//		while (a.equals() = 0) {
//			System.out.print("Введите значение a, которое является целым числом и больше \"1\": ");
//			a = scanner.nextLine();
//			if (a.length() > 0) {
//				if (a < 2) {
//					System.out.print("Введите корректное значение a: ");
//					a = scanner.nextLine();
//				} else {
//					System.out.print(a);
//				}
//			}
//		}


//		System.out.print("Введите значение b: ");
//		int b = scanner.nextLine();


//	String name = "";
//		while (name.length() == 0) {
//				System.out.print("Задайте значение a: ");
//				name = scanner.nextLine();
//				if (name.length() > 0) {
//				System.out.print("Привет, " + name + "!");
//				}
//				}
//				}}