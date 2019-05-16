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
	public static final String NO_DISPONE_DE_INFORMACIÓN = "no dispone de información";
	
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	
	String matricula, combustible, modelo, fabricante;

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
			
			resultado += matriculaCoche() + gasolinaCoche(modelo, fabricante);
		}
		
		else if (combustible == "Diesel") {
			
			resultado += matriculaCoche() + gasolinaCoche(modelo, fabricante);

		}
		
		else if (combustible == "Híbrido") {


			resultado += matriculaCoche() + gasolinaCoche(modelo, fabricante);

		}
		
		else {
			resultado = matriculaCoche() + NO_DISPONE_DE_INFORMACIÓN;
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
	
	
	/**
	 * 
	 * @param modeloDelCoche
	 * @param fabricanteDelCoche
	 * @return Nos devolvera un String, el modelo, el fabricante y el precio euros/litro dependiendo del combustible
	 */
	
	
	//Metodo dieselCoche
	public String dieselCoche(String modeloDelCoche	, String fabricanteDelCoche) {

		return "Es un " + fabricanteDelCoche + modeloDelCoche + " y gasta 1,052 euros por litro.";
	}

	//Metodo hibridoCoche
	public String hibridoCoche(String modeloDelCoche, String fabricanteDelCoche) {

		return "Es un " + fabricanteDelCoche + modeloDelCoche + " y no necesita combustible.";
	}


	//Metodo gasolinaCoche
	public String gasolinaCoche(String modeloDelCoche, String fabricanteDelCoche) {

		return "Es un " + fabricanteDelCoche + modeloDelCoche + " y gasta 1,337 euros por litro.";
	}
}