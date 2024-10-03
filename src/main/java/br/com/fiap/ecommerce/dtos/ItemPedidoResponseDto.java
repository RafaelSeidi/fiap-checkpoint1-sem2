package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;

public class ItemPedidoResponseDto {
    private Long id;
    private Pedido pedido;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
	
    private static final ModelMapper modelMapper = new ModelMapper();

    public ItemPedidoResponseDto toDto(ItemPedido itemPedido) {
        return modelMapper.map(itemPedido, ItemPedidoResponseDto.class);

        // ProdutoResponseDto result = new ProdutoResponseDto();
        // result.setId(produto.getId());
        // result.setNome(produto.getNome());

        // return result;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
   

    

}
