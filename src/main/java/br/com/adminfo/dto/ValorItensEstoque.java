package br.com.adminfo.dto;

import java.math.BigDecimal;

public class ValorItensEstoque {

	private BigDecimal valor;
	private Long totalItens;
	
	
	public ValorItensEstoque(BigDecimal valor, Long totalItens) {
		super();
		this.valor = valor;
		this.totalItens = totalItens;
	}
	
	public ValorItensEstoque() {
		
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Long getTotalItens() {
		return totalItens;
	}
	public void setTotalItens(Long totalItens) {
		this.totalItens = totalItens;
	}
	
}
