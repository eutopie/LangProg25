public class QueueFullException extends Exeption{
	int size;
	QueueFullException(int s) {
		size = s;
	}
	public String toString() {
		return "/nОчередь переполненаю. Максимальный размер " + size
	}
}
		
