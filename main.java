import java.util.*;
import java.io.*;

public class main {
		
	private static Paciente file;
	private static String texto,texto1;
	private static VectorHeap<String> vec;
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		// Imprime el titulo.
		System.out.println("Systema de Pacientes.\n");
		
		// Se inicializan las variable.
		 file = new Paciente();
		 texto = file.leerArchivo("paciente.txt");
		//System.out.println(texto);
		texto1="";
		 vec = new VectorHeap<String>();
		 
		 // Ingreso de los pacientes 
		for (String texto1:texto.split("\n")){
			String texto3 = texto1.substring(texto1.length()-1);
			vec.add(texto3);			
		}	
		
	}

}
