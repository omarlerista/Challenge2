package Main;

import javax.swing.JOptionPane;

import ConversorPesos.OpcionMoneda;
import ConversorTemperatura.OpcionTemperatura;



public class Principal {
public static void main(String[] args) {
		
		OpcionMoneda conversionM = new OpcionMoneda();
		OpcionTemperatura conversionT= new OpcionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversionM.ConvertirMonedas(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				
				
				int respuestaT = 0;
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                if((respuesta == 0) && (ValidarNumero(input1) == true)) { 
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");                     
                }
			break;
		}
	
	}
}

	private static boolean ValidarNumero(String input) {
		try {
	        double x = Double.parseDouble(input);
	        if(x >= 0 || x < 0);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
}
