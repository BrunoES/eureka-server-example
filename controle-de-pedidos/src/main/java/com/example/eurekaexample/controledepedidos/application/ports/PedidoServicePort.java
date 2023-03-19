package com.example.eurekaexample.controledepedidos.application.ports;

import java.util.List;

import com.example.eurekaexample.controledepedidos.application.domain.Pedido;

public interface PedidoServicePort {
	
	List<Pedido> findAll();
	
	Pedido findById(Long id);
	
	List<Pedido> findByQuery(String query);
	
	Pedido save(Pedido Pedido);
	
	Pedido update(Pedido Pedido);
	
	Pedido aprove(Long idPedido);
	
	void delete(Pedido Pedido);

	List<Pedido> findBySituacaoPedido(int idSituacao);
	
}
