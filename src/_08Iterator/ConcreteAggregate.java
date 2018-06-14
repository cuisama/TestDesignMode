package _08Iterator;

public class ConcreteAggregate extends Aggregate{

	private Object[] os = new Object[10];
	private int size = 0;
	@Override
	Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	@Override
	void add(Object o) {
		if(size>=os.length){
			Object[] nos = new Object[this.os.length*5/3+1];
			System.arraycopy(this.os, 0, nos, 0, this.os.length);
			this.os = nos;
		}
		os[size++] = o;
	}

	@Override
	int size() {
		return size;
	}

	@Override
	Object get(int x) {
		return this.os[x];
	}
	
	
	
	

}
