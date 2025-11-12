//Демонстрация перехвата исключительных ситуац
class Pr010 {
	public static void main (String[] args) {
		int a =100, b = 0;
		int result;
		char[] chrs = {'A', 'B', 'C'};
		for (int i = 0; i<2; i++) {
			try {
				if (i==0)
					result = a/b;
				else
					chrs[6] = 'B';
			}
			catch(ArithmeticException | ArrayIndex e) {
				System.out.println("Перехвачено исключение: " + e);
			}
		}
		System.out.println("Выполнение кода после мнжественного прехвата");
	}
}
