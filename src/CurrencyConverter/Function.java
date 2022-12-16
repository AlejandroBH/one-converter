package CurrencyConverter;

import javax.swing.JOptionPane;

public class Function {

	ConvertCurrencies coins = new ConvertCurrencies();

	public void ConvertCurrencies(double inputReceived) {

		String[] convertOption = {
				"Pesos a Dolar",
				"Pesos a Euro",
				"Pesos a Libra",
				"Pesos a Yen",
				"Pesos a Won",
				//
				"Dolar a Pesos",
				"Euro a Pesos",
				"Libra a Pesos",
				"Yen a Pesos",
				"Won a Pesos"
				};

		String option = (JOptionPane.showInputDialog(null, "¿Que conversión deseas realizar? ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, convertOption, "Selecciona")).toString();

		switch (option) {
		case "Pesos a Dolar": {
			coins.ConvertClpUsd(inputReceived);
			break;
		}
		case "Pesos a Euro": {
			coins.ConvertClpEur(inputReceived);
			break;
		}
		case "Pesos a Libra": {
			coins.ConvertClpGbp(inputReceived);
			break;
		}
		case "Pesos a Yen": {
			coins.ConvertClpJpy(inputReceived);
			break;
		}
		case "Pesos a Won": {
			coins.ConvertClpWon(inputReceived);
			break;
		}
		case "Dolar a Pesos": {
			coins.ConvertUsdClp(inputReceived);
			break;
		}
		case "Euro a Pesos": {
			coins.ConvertEurClp(inputReceived);
			break;
		}
		case "Libra a Pesos": {
			coins.ConvertGbpClp(inputReceived);
			break;
		}
		case "Yen a Pesos": {
			coins.ConvertJpyClp(inputReceived);
			break;
		}
		case "Won a Pesos": {
			coins.ConvertWonClp(inputReceived);
			break;
		}
		}

	}

}
