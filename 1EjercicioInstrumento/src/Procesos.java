import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	ModeloDatos miData;
	ArrayList<String> listPersonas;
	String nombre,documento,profesion;
	int edad;
	int personasRe = 0;
	int mayorEdad,menorEdad;
	
	public Procesos(){
		miData = new ModeloDatos();
		iniciar();
	}

	private void iniciar() {
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				ingresarDatos();
				personasRe++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			}
		} while (opcion != 2);
		miData.imprimirMapaForma();
		System.out.println("Personas Registradas: "+ personasRe);
		System.out.println("Mayores de edad: " + mayorEdad);
		System.out.println("Menores de edad: " + menorEdad);
	}
	
	public int menu() {
		String menu = "Menu de opciones\n";
		menu+="1. Ingresar Persona\n";
		menu+="2. Salir e imprimir\n";
		menu+="Ingrese una opcion";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return opc;
	}
	
	private void ingresarDatos() {
		listPersonas = new ArrayList<String>();
		nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
		documento = JOptionPane.showInputDialog("Ingrese el documento de: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
		profesion = JOptionPane.showInputDialog("Ingrese la profesion: ");
		
		valueEdad(edad);
		
		listPersonas.add("Nombre: " + nombre);
		listPersonas.add("Documento:  " + documento);
		listPersonas.add("Edad: "+ edad);
		listPersonas.add("Profesion: "+ profesion);
		
		miData.guardarDatos(listPersonas);
		
	}

	private void valueEdad(int edad) {
		if (edad >= 18) {
			mayorEdad++;
		} else {
			menorEdad++;
		}
	}
}
