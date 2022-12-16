package CurrencyConverter;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {

		String[] mainOption = {
				"Convertir Monedas",
				"Convertir Temperatura"
				};

		Function coins = new Function();

		String option = (JOptionPane.showInputDialog(null, "Elige la opcion ", "Currency Converter",
				JOptionPane.QUESTION_MESSAGE, null, mainOption, "Selecciona")).toString();

		switch (option) {
		case "Convertir Monedas": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir:");

			try {
				double inputReceived = Double.parseDouble(input);
				coins.ConvertCurrencies(inputReceived);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "La entrada ingresada no es valida, solo se permiten numeros.");
			}
			break;
		}
		case "Convertir Temperatura": {
			// Codificar convertidor temperatura
			System.out.println("Convertidor de temperatura.");
		}
		}

		int select = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");

		if (JOptionPane.OK_OPTION == select) {
			main(mainOption);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Terminado, gracias por utilizar.");
		}

	}

}
