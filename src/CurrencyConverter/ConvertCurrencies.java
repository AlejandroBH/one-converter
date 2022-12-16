package CurrencyConverter;

import javax.swing.JOptionPane;

public class ConvertCurrencies {

	private double valueUsd = 887;
	private double valueEur = 940;

	public void ConvertClpUsd(double inputReceived) {
		double ConvertUsd = inputReceived / valueUsd;
		ConvertUsd = (double) Math.round(ConvertUsd * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertUsd + " USD");
	}

	public void ConvertClpEur(double inputReceived) {
		double ConvertEur = inputReceived / valueEur;
		ConvertEur = (double) Math.round(ConvertEur * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertEur + " EUR");
	}

}
