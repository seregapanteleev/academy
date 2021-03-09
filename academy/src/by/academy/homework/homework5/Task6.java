package by.academy.homework.homework5;

//Попробовать добавить в массив int на 8 элементов 10 чисел. 
//Обернуть в try/catch, словить ArrayIndexOutOfBoundsException
//и вывести на экран сообщение:
//"Array is to small, expand the array".

public class Task6 {

	public static void main(String[] args) {

		int[] arr = new int[8];
		int a = 10;
		try {
			for (int i = 0; i < a; i++) {
				arr[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}
	}

}
