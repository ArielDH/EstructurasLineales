package TestColas;

import javax.swing.JOptionPane;

import ColaEstatica.ColaB;
import ToolsPanel.Tools;

public class MenuColaB {
	public static void menu3(String menu){
		String sel="";
		ColaB<Integer> cola = new ColaB<Integer>();
		do {
			sel=boton(menu);
			switch(sel){
			case "Push":
				cola.pushCola(Tools.leerInt("Escribe un dato entero"));
				Tools.imprime("Datos de la cola \n"+cola.toString());
				break;
			case "Pop":
				if(cola.isEmptyCola())Tools.imprimeErrorMsje("Cola vacia...!!");
				else Tools.imprime("Dato eliminado de la cima..\n"+cola.popCola());
				break;
			case "Peek":
				if(cola.isEmptyCola())Tools.imprimeErrorMsje("Cola vacia!!");
				else {
					Tools.imprime("DATO DE LA CIMA DE LA COLA \n"+cola.peekCola());
				}
				break;
			case "Free":
				if (cola.isEmptyCola())Tools.imprimeErrorMsje("Cola vacia !!");
				else {
					cola.vaciar();
				}
				break;
			case"Salir": Tools.imprime("Fin del programa");
				break;
			}
	}while(!sel.equalsIgnoreCase("Salir"));
	}
		
	public static void main(String []args) {
		String menu2="Push,Pop,Peek,Free,Salir";
		menu3(menu2);
	}
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", 
				" M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,
				valores[0]);
		return ( valores[n]);
}

}
