package configs;

import java.util.HashMap;

public class Constantes {
	static HashMap<String, String> mapita = new HashMap<String, String>();
	
	public static HashMap getMapita() {
		mapita.put("BASE_URL", "http://localhost:8080/");
		mapita.put("STATIC_URL", "http://localhost:8080/public/");
		return mapita;
	}
}
