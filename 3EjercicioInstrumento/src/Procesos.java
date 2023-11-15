import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	ArrayList<String> listEmpleados;
	String nombreE;
	int sueldoActual,estrato,cantDescuentos;
	double porcentajeDescuento,descuentoF;
	public Procesos() {
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
				cantDescuentos++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Que tenga buen dia");
				break;
			}
		} while (opcion != 2);
		miData.imprimirMapaForma();
		System.out.println("Cantidad de descuentos realizados: " + cantDescuentos);
	}
	
	public int menu() {
		String menu = "Menu de opciones\n";
		menu+="1. Ingresar Empleado\n";
		menu+="2. Salir e imprimir\n";
		menu+="Ingrese una opcion";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return opc;
	}

		private void ingresarDatos() {
			listEmpleados = new ArrayList<String>();
			nombreE = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
			sueldoActual= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldo actual"));
			estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));
			
			
			validarDescuento(estrato,sueldoActual);
			
			listEmpleados.add("Nombre: " + nombreE);
			listEmpleados.add("Saldo Actual: " + sueldoActual);
			listEmpleados.add("Su descuento es de: " + validarDescuento(estrato, sueldoActual));
			
			miData.guardarDatos(listEmpleados);
			
		}


		public double validarDescuento(int estrato, int sueldoActual) {
			if (estrato >= 1 && estrato <=2 ) {
				porcentajeDescuento = 0.2;
				descuentoF = sueldoActual * porcentajeDescuento;
			} else if (estrato >= 3 && estrato <= 4 ) {
				porcentajeDescuento = 0.4;
				descuentoF = sueldoActual * porcentajeDescuento;
			}else if (estrato == 5) {
				porcentajeDescuento = 0.8;
				descuentoF = sueldoActual * porcentajeDescuento;
			}else if (estrato == 6) {
				porcentajeDescuento = 0.10;
				descuentoF = sueldoActual * porcentajeDescuento;
			}
			return descuentoF;
		}

}


