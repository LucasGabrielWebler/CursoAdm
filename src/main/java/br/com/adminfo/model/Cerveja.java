package br.com.adminfo.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "cerveja")
public class Cerveja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = "SKU é obirgatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@Size(min = 1, max = 50, message = "O tamanho da descrição deve estar entre 1 e 50 caracteres")
	private String descricao;
	
	@NotNull(message = "Valor é obrigatório")
	@DecimalMin(value = "0.50", message = "O valor precisa ser maior que R$0,50")
	@DecimalMax(value = "9999999.99", message = "O valor deve ser menor que R$9.999.999,99")
	private BigDecimal valor;
	
	@Column(name = "teor_alcoolico")
	private BigDecimal teorAlcoolico;
	
	private BigDecimal comissao;
	
	@NotNull(message = "Estoque é obrigatório!")
	@DecimalMax(value = "9999999", message = "O Estoque deve ser menor que R$9.999.999")
	@Column(name = "quantidade_estoque")
	private Integer quantidadeEstoque;
	
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	
	@Enumerated(EnumType.STRING)
	private Origem origem;
	
	@ManyToOne
	@JoinColumn(name = "codigo_estilo")
	private Estilo estilo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(BigDecimal teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerveja other = (Cerveja) obj;
		return Objects.equals(codigo, other.codigo);
	}

}