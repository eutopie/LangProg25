class UseFinally {
	public static void getExeption(int what) {
		int t;
		int[]nums = new int[2];
		System.out.println("Получено: " + what);
		try {
			switch (what) {
				case 0:
					t = 10/what;
					break
				case 1:
					nums[4] = 10;
					break
				case 2:
					return;
			}
		}

		catch (ArithmeticExeption exc) {
			System.out.println("Ошибочная операия");
			return;
		}

		catch (ArrayIndex exc ) {
			System.out.println("Не найденэлемен массива");
		}
		finally {
			System.out.println("Выход из блока")
		}
	}
}
clas Pr008 {
	public static void main(String args[]) {
		for (int i =0; i<3; i++) {
			UseFinally.getExeption(i);
			System.out.println();
		}
	}
}
