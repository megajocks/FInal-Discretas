package Proyecto5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	
	static int MATRIZ[][]= {
			/*	        a   b   c   d   e   f   g   h 		*/	
					{0, 1,  2,  3,  4,  5,  6,  7,  8},
			/*a*/	{1, 0,	1,	1,	1,	0,	0,	0,	0},
			/*b*/	{2, 1,	0,	0,	0,	0,	0,	0,	0},
			/*c*/	{3, 1,	0,	0,	0,	1,	1,	0,	0},
			/*d*/	{4, 1,	0,	0,	0,	0,	0,	1,	0},
			/*e*/	{5, 0,	0,	1,	0,	0,	0,	0,	1},
			/*f*/	{6, 0,	0,	1,	0,	0,	0,	0,	0},
			/*g*/	{7, 0,	0,	0,	1,	0,	0,	0,	0},
			/*h*/	{8, 0,	0,	0,	0,	1,	0,	0,	0}
			};
	

	public static void main(String[] args) {
		Busq_Anchura anchura= new Busq_Anchura();
		Busq_Profundidad profundidad= new Busq_Profundidad();
	
		
		tree arbol = new tree();
		Scanner leer = new Scanner(System.in);
	
		int op=0;
		
		//Proyecto No.5 - Por Kevin Brennan, Camilo Reigosa, Isaac Carrillo, Brayan Navarro
		
		String menu= 

				 "-----------------\n"
				+"Menu pricipal\n"
				+"------------------\n"
				+"1.Imprimir matriz de adyacencia \n"
				+"2.Realizar busqueda de anchura \n"
				+"3.Realizar busqueda de profundidad\n"
				+"4.Notaciones \nImpresion por consola\n"
				+"5.Salir\n"
				+"---------------------\n"
				+"Opcion:  ";
		
		
		while (op != 5)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op)
				{
				case 1:
					anchura.imprimir_Matriz();
					break;
				case 2:
					anchura.Busqueda_Anchura(MATRIZ);
					break;
				case 3:
					profundidad.Busqueda_Profundidad(MATRIZ);
					break;
				case 4:
					int cant ;
					cant=Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE LA CANTIDAD DE VERTICES: "));
					int n;
										
					for(int x = 0; x < cant; x++)
					{
						
						n=Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE VALOR: (Vertice) "));
						arbol.insert(n);
					}
				
					System.out.println("");
					System.out.println("|RECORRIDO PRE ORDEN|");
					System.out.println("");
					arbol.preorden();
					System.out.println("\n");
					
					System.out.println("");
					System.out.println("|RECORRIDO IN ORDEN|");
					System.out.println("");
					arbol.inorden();
					System.out.println("\n");
					
					System.out.println("");
					System.out.println("|RECORRIDO POST ORDEN|");
					System.out.println("");
					arbol.postorden();
					System.out.println("\n");
					break;		
	}
	
}
	}
}
