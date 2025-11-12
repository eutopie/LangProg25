public interface IGenQ<T> {
	//Метод помещения элемента в очередь
	void put(T ch) throws QueueFullException;
	//Метод извлесения символа из очереди
	T get() throws QueueEmptyException;
}

