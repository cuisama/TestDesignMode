package _08Iterator;

public class ConcreteIterator extends Iterator{

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	boolean hasNext() {
		return current < aggregate.size();
	}

	@Override
	Object first() {
		return aggregate.get(0);
	}

	@Override
	Object next() {
		return aggregate.get(current++);
	}

	@Override
	Object current() {
		return aggregate.get(current);
	}

}
