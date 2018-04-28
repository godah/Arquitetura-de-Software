package com.observer;

import javax.swing.JOptionPane;

public class EstacaoDoTempo {
	public static void main(String[] args) {
		DadosTempo dados = new DadosTempo();
		
		@SuppressWarnings("unused")
		MostraCondicoesTempo condicoes = new MostraCondicoesTempo(dados);
		
		while(true) {
			dados.setMedidas(retornaTemperatura(), retornaUmidade());
			int opcao = JOptionPane.showConfirmDialog(null, "Nova Verificão?",
								"Verificar novas medidas (Temperatura e Umidade)",
								JOptionPane.YES_NO_OPTION);
			if (opcao == JOptionPane.NO_OPTION) {
				break;
			}
			
		}
	}
	
	public static double retornaTemperatura() {
		double t = Math.random()*100;
		t = Math.round(t);
		return t;
	}
	
	public static double retornaUmidade() {
		double u = Math.random()*100;
		u = Math.round(u);
		return u;
	}
}
