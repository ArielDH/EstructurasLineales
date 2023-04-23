package TestPilas;

import javax.swing.JOptionPane;

import PilaDinamica.PilaD;
import ToolsPanel.Tools;

public class MenuPilaD {
	public static void menu3(String menu){  
		String sel="";
		PilaD<Integer> pila = new PilaD<Integer>();
		
		do {
				sel=boton(menu);
				switch(sel){
				case "Push":
					pila.push(Tools.leerInt("escribe un dato entero"));
					Tools.imprime("Datos de la pila \n"+pila.toString());
					break;
				case "Pop":
					if(pila.isEmpty())Tools.imprimeErrorMsje("pila vacia...!!");
					else Tools.imprime("dato eliminado de la cima..\n"+pila.pop());
					break;
				case "Peek":
					if(pila.isEmpty())Tools.imprimeErrorMsje("pila vacia!!");
					else {
						Tools.imprime("DATOS DE LA CIMA DE LA PILA \n"+pila.peek());
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
