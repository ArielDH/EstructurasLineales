package ColaEstatica;

import java.util.ArrayList;

public class ColaC <T>implements ColaTDA<T>{
private ArrayList cola;
byte u;
public ColaC() {
	cola = new ArrayList();
	u=0;
}
@Override
public boolean isEmptyCola() {
	// TODO Auto-generated method stub
	return cola.isEmpty();
}
public int Size() {
	return cola.size()-1;
}
@Override
public void pushCola(Object dato) {
	// TODO Auto-generated method stub
	cola.add(dato);
	u++;
}
public void vaciar() {
	cola.clear();
}
@Override
public T popCola() {
	// TODO Auto-generated method stub
	T dato = (T)cola.get(0);
	cola.remove(0);
	u--;
	return dato;
}

@Override
public T peekCola() {
	// TODO Auto-generated method stub
	return (T)cola.get(0);
}

@Override
public void freeCola() {
	// TODO Auto-generated method stub
	
}
public String toString() {
	return toString(0);
}
private String toString(int i) {
	return (i<u)?"" + i + " [" +cola.get(i) + "] ----> " + toString(i+1):"";
}
}
