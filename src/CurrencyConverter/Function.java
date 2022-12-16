package CurrencyConverter;

import javax.swing.JOptionPane;

public class Function {

	ConvertCoins coins = new ConvertCoins();
	ConvertTemperatures temps = new ConvertTemperatures();

	public void ConvertCoins(double inputReceived) {

		String[] convertOptionCoin = {
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

		String optionCoin = (JOptionPane.showInputDialog(null, "¿Que conversión deseas realizar? ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, convertOptionCoin, "Selecciona")).toString();

		switch (optionCoin) {
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

	public void ConvertTemperatures(double inputReceived) {

		String[] convertOption = {
				"Celsius a Fahrenheit",
				"Celsius a Kelvin",
				//
				"Fahrenheit a Celsius",
				"Kelvin a Celsius",
				};

		String option = (JOptionPane.showInputDialog(null, "¿Que conversión deseas realizar? ", "Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, convertOption, "Selecciona")).toString();

		switch (option) {
		case "Celsius a Fahrenheit": {
			temps.ConvertCelFah(inputReceived);
			break;
		}
		case "Celsius a Kelvin": {
			temps.ConvertCelKel(inputReceived);
			break;
		}
		case "Fahrenheit a Celsius": {
			temps.ConvertFahCel(inputReceived);
			break;
		}
		case "Kelvin a Celsius": {
			temps.ConvertKelCel(inputReceived);
			break;
		}
		}
	}

}
