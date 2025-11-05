//Пример обощенного интерфейса
interface Containment<T> {
	//Проверка содержимого объекта класса, на наличе, указанного элемента
	boolean contains(T, o);
}
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
class Summation {
	private int sum;
//oboshen konstrucr
	<T extends Number> Summation (T arg) {
		sum = 0;

		for(int i=0; i<=arg.intValue(); i++)
			sum += i;
	}
	int getSum() {
		return sum;
	}
}
//realiz obobshen interface
class ClassGenInt<T> implements Containment<T> {
	T[] arrayRef;
	ClassGetInt(T[] o) {
		arrayRef = o
	}
	publock boolean contains (T o) {
		for(T x: arrayRef)
			if (x.equals(o)) return true;
		return false;
	}
}
//При реализации обощенного интерфейса можно ограничить тип данных в объявлении интерфейса:
//class ClassGenInt2 implements<Intrger>
//...
//}
//
//class ClassGenInt3 <T extends>

class Pr002 {
	publick static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns <Integer>(5);
		System.out.println("Обратная связь iOb " + dOb.inverse());
		System.out.println("Целая часть iOb " + dOb.whole());
		System.out.println("Дробная часть iOb " + dOb.dr());
                NumFns<Double> dOb = new NumFns<Double>(10.14);
		System.out.println("Обратная связь iOb " + dOb.inverse());
		System.out.println("Целая часть iOb " + dOb.whole());
		System.out.println("Дробная часть iOb " + dOb.dr());
	}
}
