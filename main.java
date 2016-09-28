import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente temp = new Paciente();
		String nombret, nombre;
		
	    String texto1=temp.leerArchivo("texto.txt");
	    String texto=texto1.substring(0, texto1.length()-1);
	    System.out.println("Paciente: \n"+texto);
	}

}
