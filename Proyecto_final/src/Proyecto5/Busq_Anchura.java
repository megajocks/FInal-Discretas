package Proyecto5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Busq_Anchura {

	public  void Busqueda_Anchura(int MATRIZ[][]) {
		
		int v[]=new int [MATRIZ.length];
		int raiz=MATRIZ[0][1];
		
		
		JTextArea areaTexto= new JTextArea(); 
		areaTexto.setText("Recorrido:");
		
		areaTexto.append("("+raiz);
		for (int x=1;x<MATRIZ.length;x++) {
			
			for(int y=1;y<MATRIZ[x].length;y++) {
				
				if(MATRIZ[x][y]==1) {
					
						v[y]=MATRIZ[x-x][y];
						
							if (MATRIZ[x][y-y]<=MATRIZ[x-x][y] )
							{	
								areaTexto.append((","+v[y]));
							}
				}

			}
			
		}
		areaTexto.append(")");
		JOptionPane.showMessageDialog(null, areaTexto,"Recorrido en Anchura",1);
	}
	
public void imprimir_Matriz () {
	int matriz[][]= {
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
	

	String ArregloVisualizar="";
	for(int x=0; x<matriz.length; x++)
	{
		for(int y=0; y<matriz.length;y++)
		{
			ArregloVisualizar= ArregloVisualizar + matriz[x][y] + "       ";
		}
		ArregloVisualizar= ArregloVisualizar + "\n";
	}
	JOptionPane.showMessageDialog(null, ArregloVisualizar, "Matriz de Adyacencia ", JOptionPane.INFORMATION_MESSAGE);

}
}
	

