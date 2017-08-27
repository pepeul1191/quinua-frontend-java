package configs;

import java.util.HashMap;

public class Constantes {
	static HashMap<String, String> mapita = new HashMap<String, String>();
	
	public static HashMap getMapita() {
		mapita.put("BASE_URL", "http://127.0.0.1:8080/");
		mapita.put("STATIC_URL", "localhost:4567/");
		return mapita;
	}
}
