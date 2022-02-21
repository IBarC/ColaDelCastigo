package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class ColaDelCastigo<T> {
	private Comparator comparador;
	private ArrayList<T> array;

	public ColaDelCastigo(Comparator comparador) {
		this.comparador = comparador;
		this.array = new ArrayList<T>();
	}

	public int size() {
		return array.size();
	}

	public boolean isEmpty() {
		return array.isEmpty();
	}

	public boolean contains(Object o) {
		boolean esta=false;
		for(T t : array) {
			if(t.equals(o)) {
				esta=true;
				break;
			}
		}
		return esta;
	}

	public Iterator iterator() {
		return null;
	}

	public Object[] toArray() {
		return null;
	}

	public Object[] toArray(Object[] a) {
		return null;
	}

	public boolean remove(Object o) {
		array.remove(o);
		return false;
	}

	public boolean containsAll(Collection c) {
		return false;
	}

	public boolean addAll(Collection c) {
		return false;
	}

	public boolean removeAll(Collection c) {
		return false;
	}

	public boolean retainAll(Collection c) {
		return false;
	}

	public void clear() {
		array.clear();
	}

	public boolean add(T e) throws ColaExceededSizeException {
		if (array.size() < 10) {
			if(e==null) {
				throw new LlevateTuNullDeAquiException("No puedes añadir un valor nulo");
			} else {
				array.add(e);
			}
		} else {
			throw new ColaExceededSizeException("El tamaño de Cola de Castigo no puede ser más de 10");
		}
		return false;
	}

	public boolean offer(Object e) {
		return false;
	}

	public Object remove() {
		return null;
	}

	public Object poll() {
		return null;
	}

	public Object element() {
		return null;
	}

	public Object peek() {
		return null;
	}

}
