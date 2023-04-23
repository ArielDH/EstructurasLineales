package TestPilas;

import javax.swing.JOptionPane;

import PilaDinamica.PilaC;
import ToolsPanel.Tools;

public class MenuPilaC {
	public static void menu3(String menu){  
		String sel="";
		PilaC <Integer> pila = new PilaC<Integer>();
		
		do {
				sel=boton(menu);
				switch(sel){
				case "Push":
					pila.push(Tools.leerInt("Escribe un dato entero"));
					Tools.imprime("Datos de la pila \n"+pila.toString());
					break;
				case "Pop":
					if(pila.isEmpty())Tools.imprimeErrorMsje("pila vacia...!!");
					else Tools.imprime("Dato eliminado de la cima..\n"+pila.pop());
					break;
				case "Peek":
					if(pila.isEmpty())Tools.imprimeErrorMsje("pila vacia!!");
					else {
						Tools.imprime("DATO DE LA CIMA DE LA PILA \n"+pila.peek());
					}
					break;
				case "Free":
					if (pila.isEmpty())Tools.imprimeErrorMsje("Pila vacia !!");
					else {
					pila.vaciar();
					
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
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}
	
}
