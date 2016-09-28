import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Paciente {
	
	private String name;
	private String sintoma;
	private String codigo;
	

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
		String res = "";
		String temp = "";
		try {
			FileReader f = new FileReader(direccion);
			BufferedReader b = new BufferedReader(f);
			try {
				while ((temp = b.readLine()) != null) {
					res += temp + "-";
				}
				b.close();
			} catch (IOException e) {
				return "";
			}
		} catch (FileNotFoundException e) {
			return "";
		}
		return res;
	}
}
