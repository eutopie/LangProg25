class GenQueue <T> implements IGenQ<T> {
	private int putloc, getloc;
	private T[] q
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;

	}
	public void put(T obj) throws QueueFullExeption {
		if (putloc == q.length)
			throw new QueueFullExeption(q.length);
		q[putloc++] = obj;
	}
	public T get() throws QueueEmptyExeption {
		if(getloc == getloc)
			throw new QueueEmptyException();
		return	q[getloc++];
	}
}
