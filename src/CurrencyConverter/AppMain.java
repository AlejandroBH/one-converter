package CurrencyConverter;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {

		String[] mainOption = { "Convertir Monedas", "Convertir Temperatura" };

		Function coins = new Function();

		String option = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion ", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, mainOption, "Selecciona")).toString();

		switch (option) {
		case "Convertir Monedas": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");

			try {
				double inputReceived = Double.parseDouble(input);
				coins.ConvertCurrencies(inputReceived);
			} catch (NumberFormatException e) {
				System.out.println("Formato no valido");
			}

			break;
		}
		}

		int select = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");

		if (JOptionPane.OK_OPTION == select) {
			System.out.println("Selecciona opcion afiermativa");
		} else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}

	}

}
