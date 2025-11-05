class Gen<T> {
	//Объявление переменной обобщенного типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen(T o){
		ob = o;
	}
	//Метод, возвращающий объект
	T getOb() {
		return ob;
	}
	//Метод, получающий информацию об имени типа
	void showType() {
		System.out.println("Тип T " + ob.getClass().getName());
	}
}
class TwoGen<T,V> {
	//Объявление переменной обобщенного типа
	T ob1;
	V ob2;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}                                                        
	//Метод, возвращающий объект
	T getOb1() {
		return ob1;
	}
	V getOb2 {
		return ob2;
	}
	void showType() {
		System.out.println("Тип T" + ob1.getclass().getname());
		System.out.println("Тип V" + ob2.getclass().getname());
	}
}	
class pr001 {
	public static void main(String[] args) {
		//Создаем ссылочную переменную на объект типа Integer
		Gen<Integer> iOb;
		//Присваиваем ссылку на новй объект
		iOb = new Gen <String>("Один обобщенный вид");
		//Выводим информациюо типе объекта
		iOb.showType();
		//Присваиваем целой переменной значение, хранящееся в объекте
		int v = iOb.getOb();
		System.out.println("Значение " + v);

		System.out.println();
		//Создаем ссылочную переменную на объект String и присваиваем ссылку на новый объект
		Gen<String> strOb = new Gen<String>("Строка обобщенного класса");

		//Выводим информацию о типе объекта
		strOb.showType();
		//Присваиваем строковой переменной значение, хранящееся в объектеёЖ
		String str = strOb.getOb();
		System.out.println("Значение в переменной str " + str);
	}
}

