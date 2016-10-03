import java.io.*;

public class Paciente {
	
	private String name;
	private String sintoma;
	private String codigo;
	private String [] nombres=new String[100];
	private String [] grado=new String[100];
	
	//FileReader file;
	//BufferedReader buffer;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public String getName(){
		
		return name;
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public String getSintoma(){
		
		return sintoma;
	}
	
	public void setSintoma(String sintoma){
		
		this.sintoma = sintoma;
	}
	
	public String getCodigo(){
		
		return codigo;
	}
	
	public void setCodigo(String codigo){
		
		this.codigo = codigo;
	}
	
	
	public String leerArchivo (String direccion) {
		String linea="";
		String linea2;
		
		 
           
		try {
			FileInputStream fstream = new FileInputStream("paciente.txt");
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
		
		linea = null;
			
			linea2= null;
			try {
				while ((linea2 = buffer.readLine()) != null) 
				{
					linea += linea2 + "\n";
				}
				buffer.close();
			} 
			catch (Exception e) {}
		} 
		catch (Exception e){}
		return linea;
	}
//fin 
}

