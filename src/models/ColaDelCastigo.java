package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import excepciones.ColaExceededSizeException;
import excepciones.ElementBlockedException;
import excepciones.LlevateTuNullDeAquiException;

public class ColaDelCastigo<T> {
	private Comparator<T> comparador;
	private ArrayList<T> array;

	public ColaDelCastigo(Comparator<T> comparador) {
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
		boolean esta = false;
		for (T t : array) {
			if (t.equals(o)) {
				esta = true;
				break;
			}
		}
		return esta;
	}

	public Iterator<T> iterator() {
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

	public boolean containsAll(Collection<T> c) {
		return false;
	}

	public boolean addAll(Collection<T> c) {
		return false;
	}

	public boolean removeAll(Collection<T> c) {
		return false;
	}

	public boolean retainAll(Collection<T> c) {
		return false;
	}

	public void clear() throws ElementBlockedException {
		if (array.size() >= 10) {
			throw new ElementBlockedException("La cola está llena por lo que no la puedes vaciar");
		} else {
			array.clear();
		}

	}

	public boolean add(T e) throws ColaExceededSizeException {
		if (array.size() < 10) {
			if (e == null) {
				throw new LlevateTuNullDeAquiException("No puedes añadir un valor nulo");
			} else {
				array.add(e);
				Collections.sort(array, comparador);
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
