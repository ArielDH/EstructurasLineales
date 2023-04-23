package PilaDinamica;
import java.util.Stack;

import PilaEstatica.PilaTDA;

public class PilaB<T>implements PilaTDA<T> {
	
private  Stack<T> pila;


public PilaB() {
	pila=new Stack<T>();
}

public int Size() {
	return pila.size();
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return (pila.isEmpty());
}


@Override
public T pop() {
	// TODO Auto-generated method stub
	T dato;
	dato = (T)pila.peek();
	pila.pop();
	return dato;
}


@Override
public void push(T dato) {
	// TODO Auto-generated method stub
	
	pila.push(dato);
	
}


@Override
public T peek() {
	// TODO Auto-generated method stub
	return (T)(pila.peek());
}

public void vaciar() {
	pila.clear();
}


public String toString() {
	return toString(pila.size()-1);
}
private String toString(int i) {
	return(i>=0)?"\n"+"tope ==>"+""+pila.get(i)+""+toString(i-1):"";
}

@Override
public boolean isSpace() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void freePila() {
	// TODO Auto-generated method stub
	
}
}
