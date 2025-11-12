//Повторная генерация исключений
class Rethrow {
	public static void genExeption(String args[]) {
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int demon[] = {2, 0, 4, 4, 0, 8};

		for(int i =0; i<number.length; i++) {
			try {
				System.out.println(number[i] + " / " + demon[i] + " равно " + number[i]/demon[i]);
			}
			catch (AriphmeticExeption exc) {
				//Перехват первого исключения
				System.out.println("Недопустимая арифметическая операция");
			catch (ArrayIndex exc) {
			//Перехват исключения за выход за границы массива
			System.out.println("Выход за границы массива");
			throw exc; //Повторная генерация исключения
			}
		}
	}
}
class Pr006 {
	publick static void main(String args[]) {
		try {
			Rethrow.genExeption():
		}
		catch (ArrayIndex exc) {
			System.out.println("Выход за границы массива");
			System.out.println("Аварийное завершение программы");
		}
	}
}
