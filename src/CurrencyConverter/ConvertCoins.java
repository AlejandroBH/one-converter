package CurrencyConverter;

import javax.swing.JOptionPane;

public class ConvertCoins {

	private double valueUsd = 887;
	private double valueEur = 940;
	private double valueGbp = 1076.92;
	private double valueJpy = 6.47;
	private double valueWon = 0.68;

	public void ConvertClpUsd(double inputReceived) {
		double ConvertCoin = inputReceived / valueUsd;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " USD");
	}

	public void ConvertClpEur(double inputReceived) {
		double ConvertCoin = inputReceived / valueEur;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " EUR");
	}

	public void ConvertClpGbp(double inputReceived) {
		double ConvertCoin = inputReceived / valueGbp;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " GBP");
	}

	public void ConvertClpJpy(double inputReceived) {
		double ConvertCoin = inputReceived / valueJpy;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " JPY");
	}

	public void ConvertClpWon(double inputReceived) {
		double ConvertCoin = inputReceived / valueWon;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " WON");
	}

	//
	public void ConvertUsdClp(double inputReceived) {
		double ConvertCoin = inputReceived * valueUsd;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " CLP");
	}

	public void ConvertEurClp(double inputReceived) {
		double ConvertCoin = inputReceived * valueEur;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " CLP");
	}

	public void ConvertGbpClp(double inputReceived) {
		double ConvertCoin = inputReceived * valueGbp;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " CLP");
	}

	public void ConvertJpyClp(double inputReceived) {
		double ConvertCoin = inputReceived * valueJpy;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " CLP");
	}

	public void ConvertWonClp(double inputReceived) {
		double ConvertCoin = inputReceived * valueWon;
		ConvertCoin = (double) Math.round(ConvertCoin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + ConvertCoin + " CLP");
	}

}
