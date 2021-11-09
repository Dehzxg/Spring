package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Diz que ela vai gerar uma tabela no banco.
@Table(name  = "tb_categorias")  // Definir Nome Da Tabela.
public class Categoria {

	@Id  // anotação para chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private long id;
	
	@NotBlank(message = "Não pode ser nulo e não pode conatr espaço vazio.") // NÃO PODE SER NULO E NÃO ACEITA ESPAÇO EM BRANCO.
	private String categoria;
	
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("categoria") // EVITA REPETITIVIDADE.
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
