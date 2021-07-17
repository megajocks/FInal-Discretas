package Proyecto5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Busq_Profundidad {
			
			
public  void Busqueda_Profundidad(int MATRIZ[][]) {
				
				int v[]= new int [MATRIZ.length];
				int raiz=MATRIZ[0][1];
			
				
				JTextArea areaTexto= new JTextArea(); 
				areaTexto.setText("Recorrido: ");
				areaTexto.append("("+raiz);
				
				search:{
				for (int x=1;x<MATRIZ.length;x++) {
					
					for(int y=1;y<MATRIZ[x].length;y++) {
						
						
						if(MATRIZ[x][y]==1) {
							
							v[y]=MATRIZ[x-x][y];
							
							if(v[y]!=raiz) {
								
								if (MATRIZ[x][y-y]<=MATRIZ[x-x][y] ) {
								
							areaTexto.append(","+v[y]);
							
							
								int s=busq_Hijos(y,MATRIZ);
									if (s!=0) {
										
									v[y]=s;
									areaTexto.append(","+v[y]);
									int ss=busq_Hijos(s,MATRIZ);
									
										if(ss!=0) {
											
										v[y]=ss;					
										areaTexto.append(","+v[y]);
										
										}
									v[y]=busq_Hijos(y,s,MATRIZ);
										if(v[y]!=0) {
									areaTexto.append(","+v[y]);
										}	
									
									}
					
								}
							}
						}
						
					}
					break search;
					}
				}	
				areaTexto.append(")");
				JOptionPane.showMessageDialog(null, areaTexto,"Recorrido en Profundidad",1);

}
			

public int busq_Hijos(int y,int MATRIZ[][]) {
	
				int c,v=0;
				int f=y;
				int raiz=MATRIZ[0][1];
				
				for (c=1;c<=8;c++) {
					
						if (MATRIZ[f][c]==1 && MATRIZ[f-f][c]!=raiz ) {
							
							v=MATRIZ[f-f][c];
							
							if(MATRIZ[f][c-c]<MATRIZ[f-f][c]) {
								
								return v;	
							}
							
						}
					
				}
				
				return 0;
}

public int busq_Hijos(int y, int s,int MATRIZ[][]) {
			

		int c,v=0;
		int f=y;
		int raiz=MATRIZ[0][1];
		
		for (c=s+1;c<=8;++c) {
			
				if (MATRIZ[f][c]==1 && MATRIZ[f-f][c]!=raiz ) {
					
					v=MATRIZ[f-f][c];
					
					if(MATRIZ[f][c-c]<MATRIZ[f-f][c]) {
						
						return v;	
					}
					
				}
			
		}

		return 0;
}


}