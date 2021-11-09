package br.org.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Diz que ela vai gerar uma tabela no banco.
@Table(name  = "tb_produtos")  // Definir Nome Da Tabela.
public class Produto {
	
	@Id  // anotação para chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private long id;
	
	private String nome;
	
	@NotBlank (message = "Descrição é obrigatória")
	private String descricao;
	
	private int quantidade;
	
	private String laboratorio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "")
	@Positive(message = "Digite um número maior que zero.")
	private BigDecimal preco;
	
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties ("Produto") // EVITA RECURSIVIDADE
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
