package ColaEstatica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ColaB<T>implements ColaTDA<T> {
	private Queue cola;
	
	public ColaB() {
		cola=new LinkedList();
	}

	public int Size() {
		return cola.size();
	}

	@Override
	public boolean isEmptyCola() {
		// TODO Auto-generated method stub
		return (cola.isEmpty());
	}


	@Override
	public T popCola() {
		// TODO Auto-generated method stub
		T dato;
		dato = (T)cola.element();
		cola.remove();
		return dato;
	}


	@Override
	public void pushCola(T dato) {
		// TODO Auto-generated method stub
		
		cola.add(dato);
	}


	@Override
	public T peekCola() {
		// TODO Auto-generated method stub
		return (T)  (cola.element());
	}

	public void vaciar() {
		cola.clear();
	}


	public String toString() {
		String cad="";
		byte j=0;
		for (Iterator i= cola.iterator(); i.hasNext();) {
			cad+= "[  " + i.next() + "  ]" +  j + "      ";
			j++;
		}
		return cad;
	}
	@Override
	public void freeCola() {
		// TODO Auto-generated method stub
	}
	
}
