package br.com.maquiny.mvc.mudimarketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.maquiny.mvc.mudimarketplace.model.Pedido;
import br.com.maquiny.mvc.mudimarketplace.repository.PedidoRepository;


@Controller
public class HomeController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
