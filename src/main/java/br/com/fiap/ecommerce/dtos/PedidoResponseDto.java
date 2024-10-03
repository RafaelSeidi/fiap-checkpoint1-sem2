package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Pedido;

public class PedidoResponseDto {
    private Long id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;
	
    private static final ModelMapper modelMapper = new ModelMapper();

    public PedidoResponseDto toDto(Pedido pedido) {
        return modelMapper.map(pedido, PedidoResponseDto.class);

        // PedidoResponseDto result = new PedidoResponseDto();
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
    
    

    

}
