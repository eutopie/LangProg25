class NonIntResultExeption extends Exeption {
	int n;
	int d;
	NonIntResultExeption(int i, int j) {
		n = i;
		d = j;
	}

	public String to String() {
		return "Результат деления " + n + " / " + d + "не является целочисленным";
	}
}
class Pr011 {
	public static void main(String args[]) {
		int [] numbers = {4, 8, 15, 32, 64, 127, 256, 512};
		int [] demon = {2, 0, 4, 4, 0, 8};
		for(int i=0; i<numbers.length; i++) {
			try {
				if((numbers[i]%2 != 0))
					throw new NonIntResultExeption(numbers[i], demon[i]);
				System.out.println(numbers[i] + " / " + denom[i] + " равно " + number[i]/demon[i]);
			}
			catch (ArifmeticExeption exc) {
				System.out.println("Недопустимая арифм. операция");
			}
			catch (ArrayIndex) {
				System.out.println("Выход за пределы массива");
			}
		}
	}
}
			
