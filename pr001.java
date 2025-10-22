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
class pr001 {
	public static void main(String[] args) {
		//Создаем ссылочную переменную на объект типа Integer
		Gen<Integer> iOb;
		//Присваиваем ссылку на новй объект
		iOb = new Gen <Integer>(88);
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

