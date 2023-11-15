import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapEmpleados;

	public ModeloDatos() {
		mapEmpleados = new HashMap<String, ArrayList<String>>();
	}
	public void guardarDatos(ArrayList<String> listIngresos) {
		mapEmpleados.put(listIngresos.get(0), listIngresos);
		JOptionPane.showMessageDialog(null, "Registro Exitoso");
	}
	
	public void imprimirMapaForma() {
		for (String nombre:mapEmpleados.keySet()) {
		System.out.println(mapEmpleados.get(nombre));
		}
	}
}
