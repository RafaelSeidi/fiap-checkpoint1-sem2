package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_pedido", nullable = false)
    private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_produto", nullable = false)
    private Produto produto;

    @Column(precision = 16, scale = 2, nullable = false)
    private BigDecimal quantidade;

    @Column(precision = 16, scale = 2, nullable = false)
    private BigDecimal valorTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getIdPedido() {
		return pedido;
	}

	public void setIdPedido(Pedido idPedido) {
		this.pedido = idPedido;
	}

	public Produto getIdProduto() {
		return produto;
	}

	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
    
    
    
}
