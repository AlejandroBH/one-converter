package CurrencyConverter;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {

		try {
			String[] mainOptionCoins = {
					"Convertir Monedas",
					"Convertir Temperatura"
					};

			Function coins = new Function();
			Function temps = new Function();

			String option = (JOptionPane.showInputDialog(null, "Elige la opcion ", "Currency Converter",
					JOptionPane.QUESTION_MESSAGE, null, mainOptionCoins, "Selecciona")).toString();

			switch (option) {
			case "Convertir Monedas": {
				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir:");

				try {
					double inputReceived = Double.parseDouble(input);
					coins.ConvertCoins(inputReceived);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La entrada ingresada no es valida, solo se permiten numeros.");
				}
				break;
			}
			case "Convertir Temperatura": {

				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir:");

				try {
					double inputReceived = Double.parseDouble(input);
					temps.ConvertTemperatures(inputReceived);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "La entrada ingresada no es valida, solo se permiten numeros.");
				}
				break;
			}
			}

			int select = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");

			if (JOptionPane.OK_OPTION == select) {
				main(mainOptionCoins);
			} else {
				JOptionPane.showMessageDialog(null, "Programa Terminado, gracias por utilizar.");
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa Terminado, gracias por utilizar.");
		}

	}

}
