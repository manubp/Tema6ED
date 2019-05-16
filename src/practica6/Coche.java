package practica6;

/**
 * Esta es la Clase Coche, en ella estudiaremos un total de 5 metodos
 * que son los siguientes:
 * combustibleCoche, matriculaCoche, gasolinaCoche, dieselCoche, hibridoCoche.
 * 
 * @author Manuel Barroso Pecell�n
 * 
 * @version 2019
 * 
 *
 */
public class Coche {
	
	//Variables
	private static final String NO_DISPONE_DE_INFORMACI�N = "no dispone de informaci�n";
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	/**
	 * 
	 * @return Nos devolvera informaci�n del coche dependiendo del combustible utilizado.
	 * 
	 */
	
	public String combustibleCoche() {
		String resultado = "";
		
		if (combustible == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += gasolinaCoche(modelo, fabricante);
		}
		
		else if (combustible == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += dieselCoche(modelo, fabricante);
		}
		
		else if (combustible == "H�brido") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += hibridoCoche(modelo, fabricante);
		}
		
		else {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += NO_DISPONE_DE_INFORMACI�N;
		}
		
		return resultado;
	}
}