import javax.swing.JOptionPane;

public class Procesos {
    int arr1[] = new int[5];
    int arr2[] = new int[5];
	
	public void iniciar(){
		int opcion = 0;
		int arr1[] = new int[5];
        int arr2[] = new int[5];
		do {
			opcion=menu();
			
			switch (opcion) {
			case 1:
				
		        for (int i = 0; i < arr1.length; i++) {
		            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
		        }
		        for (int i = 0; i < arr2.length; i++) {
		            arr2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
		        }
		        
		        sumaArreglos(arr1, arr2);
		        System.out.print("La suma de los dos arreglos ingresados es: ");
		        for (int num : sumaArreglos(arr1,arr2)) {
		            System.out.print(num + " ");
		        }
		        System.out.println("\n");
		        imprimirArreglos(arr1,arr2);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			}
	        
		} while (opcion != 2);
	}
	
    public int[] sumaArreglos(int[] arr1, int[] arr2) {
        int resultado[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] + arr2[i];
        }
        return resultado;
    }
    
    public int menu() {
    	String menu = "Menu de opciones\n";
		menu+="1. Ingresar Numeros\n";
		menu+="2. Terminar\n";
		menu+="Ingrese una opcion";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return opc;
    }
    
    public void imprimirArreglos(int[] arr1, int[] arr2) {
    	for (int num : arr1) {
            System.out.print(num + " ");
        }
    	System.out.println("Arreglo N-1");
    	System.out.println("\n");
    	
    	for (int num : arr2) {
            System.out.print(num + " ");
        }
    	System.out.println("Arreglo N-2");
    }
    
}
