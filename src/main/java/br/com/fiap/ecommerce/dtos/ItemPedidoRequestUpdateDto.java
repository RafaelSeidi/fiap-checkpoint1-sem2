package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;

public class ItemPedidoRequestUpdateDto {
	private Pedido pedido;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();
    
   
    public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
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


	public ItemPedido toModel(Long id) {
        ItemPedido result = modelMapper.map(this, ItemPedido.class);
        result.setId(id);
        return result;
    }   
}
