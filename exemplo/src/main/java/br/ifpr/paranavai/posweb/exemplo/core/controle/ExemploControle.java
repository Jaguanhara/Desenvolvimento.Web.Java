package br.ifpr.paranavai.posweb.exemplo.core.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExemploControle {

	@RequestMapping("/dados")
	
	public String getDados(Model model){
		
		model.addAttribute("mensagem","Hello World! Consegui");
		
		return "dados/index";
		
	}
			
		
}
