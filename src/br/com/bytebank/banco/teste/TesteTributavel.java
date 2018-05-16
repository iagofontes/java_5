package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.CalculadorImposto;
import br.com.bytebank.banco.model.SeguroVida;

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 3455);
		cc.deposita(100);
		
		SeguroVida sv = new SeguroVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());

	}

}
