package PilaEstatica;

import ToolsPanel.Tools;

public class PilaA<T>implements PilaTDA<T>{
private T pila[];
public byte tope;
public PilaA(int max) {
	pila =(T[])(new Object [max]);
	tope=-1;
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return (tope==-1);
}
public boolean isSpace(){
	return (tope<pila.length-1);
}
@Override
public T pop() {
	// TODO Auto-generated method stub
	T dato= pila[tope];
	tope--;  
	return dato;
}
@Override
public void push(T dato) {
	// TODO Auto-generated method stub
	if(isSpace()) {
		tope++;
		pila[tope]=dato;
	}
	else Tools.imprime("PILA LLENA...");
}
@Override
public T peek() {
	// TODO Auto-generated method stub
	
	return pila[tope];
}
@Override
public void freePila() {
	// TODO Auto-generated method stub
	
}
public String toSring() {
	return toString(tope);
}
private String toString(int i) {
	return(i>=0)?"\n"+"tope["+i+"]==>"+""+pila[i]+""+toString(i-1):"";
}
}
