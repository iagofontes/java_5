package br.com.bytebank.banco.model;

public class SeguroVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 40;
	}

}
