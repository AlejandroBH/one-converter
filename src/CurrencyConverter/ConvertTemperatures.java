package CurrencyConverter;

import javax.swing.JOptionPane;

public class ConvertTemperatures {

	public void ConvertCelFah(double inputReceived) {
		double ConvertTem = inputReceived * 1.8 + 32; // Cel a Fah = F = C x 1.8 + 32
		ConvertTem = (double) Math.round(ConvertTem * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + ConvertTem + "° Fahrenheit");
	}

	public void ConvertCelKel(double inputReceived) {
		double ConvertTem = inputReceived + 273.15; // Cel a Kel = K = C + 273.15
		ConvertTem = (double) Math.round(ConvertTem * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + ConvertTem + "° Kelvin");
	}

	public void ConvertFahCel(double inputReceived) {
		double ConvertTem = (inputReceived - 32) / 1.8; // Fah a Cel = C = (F-32) / 1.8
		ConvertTem = (double) Math.round(ConvertTem * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + ConvertTem + "° Celsius");
	}

	public void ConvertKelCel(double inputReceived) {
		double ConvertTem = inputReceived - 273.15; // Kel a Cel = C = K - 273.15
		ConvertTem = (double) Math.round(ConvertTem * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + ConvertTem + "° Celsius");
	}

}
