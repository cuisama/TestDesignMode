package _08Iterator;

public abstract class Aggregate {

	abstract Iterator createIterator();
	abstract void add(Object o);
	abstract int size();
	abstract Object get(int x);
}
