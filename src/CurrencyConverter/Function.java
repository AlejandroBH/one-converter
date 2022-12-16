package CurrencyConverter;

import javax.swing.JOptionPane;

public class Function {

	ConvertCurrencies coins = new ConvertCurrencies();

	public void ConvertCurrencies(double inputReceived) {

		String[] convertOption = {
				"De Pesos a Dolar",
				"De Pesos a Euro"
				};

		String option = (JOptionPane.showInputDialog(null, "¿Que conversión deseas realizar? ",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, convertOption, "Selecciona")).toString();

		switch (option) {
		case "De Pesos a Dolar": {
			coins.ConvertClpUsd(inputReceived);
			break;
		}
		case "De Pesos a Euro": {
			coins.ConvertClpEur(inputReceived);
			break;
		}
		}

	}

}
