class NumFns<T extends Number> {
	T num;
	NumFns (T n) {
		num = n;
	}

	double inverse () {
		return 1/num.doubleValue();
	}

	int whole() {
		return num.intValue();
	}
	double dr() {
		return num.doubleValue() - num.intValue();
	
	}
}
class pr001 {
	public static void main (String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная связь iOb " + iOb.inverse());

		System.out.println("Целая часть iOb " + iOb.whole());

		System.out.println("Дробная часть iOb " + iOb.dr());
		
		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная связь iOb " + dOb.inverse());
		
		System.out.println("Целая часть iOb " + dOb.whole());
		
		System.out.println("Дробная часть iOb " + dOb.dr());
		
		//NumFns<Double> dOb = new NumFns<Double>(10.14);
	}
}
