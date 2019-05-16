package practica6;

/**
 * Esta es la Clase Coche, en ella estudiaremos un total de 5 metodos
 * que son los siguientes:
 * combustibleCoche, matriculaCoche, gasolinaCoche, dieselCoche, hibridoCoche.
 * 
 * @author Manuel Barroso Pecellín
 * 
 * @version 2019
 * 
 *
 */
public class Coche {
	
	//Variables
	private static final String NO_DISPONE_DE_INFORMACIÓN = "no dispone de información";
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
	 * @return Nos devolvera información del coche dependiendo del combustible utilizado.
	 * 
	 */
	
	public String combustibleCoche() {
		String resultado = "";
		
		if (combustible == "Gasolina") {
			resultado = matriculaCoche();
			resultado += gasolinaCoche(modelo, fabricante);
		}
		
		else if (combustible == "Diesel") {
			resultado = matriculaCoche();
			resultado += dieselCoche(modelo, fabricante);
		}
		
		else if (combustible == "Híbrido") {
			resultado = matriculaCoche();
			resultado += hibridoCoche(modelo, fabricante);
		}
		
		else {
			resultado = matriculaCoche();
			resultado += NO_DISPONE_DE_INFORMACIÓN;
		}
		
		return resultado;
	}

	/**
	 * 
	 * @param resultado
	 * @return Nos devolvera un String ("El coche con matricula ") junto con la matricula.
	 */
	//Metodo matriculaCoche
	public String matriculaCoche() {
		
		return EL_COCHE_CON_MATRICULA + matricula + " ";
	}
	
	

	public String dieselCoche(String modeloDelCoche	, String fabricanteDelCoche) {

		return null;
	}

	public String hibridoCoche(String modelmodeloDelCocheo2, String fabricanteDelCoche) {

		return null;
	}

	public String gasolinaCoche(String modeloDelCoche, String fabricanteDelCoche) {

		return null;
	}
}