import java.util.*;
import java.io.*;

public class main {
		
	private static Paciente file;
	private static String texto,texto1;
	private static VectorHeap<String> vec;
	
	
	public static void main (String[] args) {
	
try	{	// TODO Auto-generated method stub
		String [] personas=new String [100];
		// Imprime el titulo.
		System.out.println("\nSystema de Pacientes.\n");
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
		
		
		System.out.println("| Prioridad  | Nombre y enfermedad/Herida      	|");
		while(!vec.isEmpty())
		{
			System.out.println("    " + vec.removeFirst());
			
		}
		
	}catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error:\n    ->No se encontro el archivo\n " + e.getMessage());
        }
	
	}

}
