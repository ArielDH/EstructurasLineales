package PilaDinamica;

import PilaDinamica.Nodo;
import PilaEstatica.PilaTDA;
public class PilaD <T> implements PilaTDA<T>{
	private Nodo pila;
	public PilaD() {
		pila = null;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (pila==null);
	}
	public void vaciar() {
		pila=null;
	}
	@Override
	public boolean isSpace() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T dato = (T) pila.getInfo();
		pila=pila.getSig();
		return dato;
	}
	@Override
	public void push(T dato) {
		// TODO Auto-generated method stub
		Nodo tope = new Nodo(dato);
		if (isEmpty()) pila=tope;
		else
				{ tope.sig=pila;
				  pila=tope;
				}
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return (T)(pila.getInfo());
	}
	@Override
	public void freePila() {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		Nodo tope=pila;
		return toString(tope);
	}
	private String toString(Nodo i) {
		return(i!=null)?"tope ==>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
	}
	
}
