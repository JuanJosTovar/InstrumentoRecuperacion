import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapPersonas;
	public ModeloDatos() {
		mapPersonas = new HashMap<String, ArrayList<String>>();
	}
	public void guardarDatos(ArrayList<String> listIngresos) {
		mapPersonas.put(listIngresos.get(0), listIngresos);
		JOptionPane.showMessageDialog(null, "Registro Exitoso");
	}
	
	public void imprimirMapaForma() {
		for (String nombre:mapPersonas.keySet()) {
		System.out.println(mapPersonas.get(nombre));
		}
	}
}
