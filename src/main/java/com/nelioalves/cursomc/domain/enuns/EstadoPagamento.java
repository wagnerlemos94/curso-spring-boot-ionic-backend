package com.nelioalves.cursomc.domain.enuns;

public enum EstadoPagamento {
	
	PEDENTE(1, "pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descrica) {
		this.cod =  cod;
		this.descricao = descrica;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;  
			}
		}
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}

}
