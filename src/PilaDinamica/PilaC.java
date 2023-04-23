package PilaDinamica;
import java.util.ArrayList;

import PilaEstatica.PilaTDA;

public class PilaC<T> implements PilaTDA<T>{
private ArrayList pila;
int tope;

public PilaC() {
	pila = new ArrayList();
	tope=-1;
	
}
public int Size() {
	return pila.size();
}
public boolean isEmpty() {
	return pila.isEmpty();
}
public void vaciar() {
	pila.clear();
}
public void push(T dato) {
	pila.add(dato);
	tope++;
}
public T pop () {
	T dato=(T)pila.get(tope);
	pila.remove(tope);
	tope--;
	return dato;
}
public T peek() {
	return (T)pila.get(tope);
}
public String toString() {
	return toString(tope);
}
private String toString(int i) {
	return(i>=0)?"\n"+"tope ==>"+""+pila.get(i)+""+toString(i-1):"";
}
public void freePila() {
	// TODO Auto-generated method stub
	
}
public boolean isSpace(){
	return (tope<pila.size()-1);
}

}
