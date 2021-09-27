package com.BO.TiendaVirtualSB;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
public class ClienteController {
	
	
	@RequestMapping("/registrarPersona")
	public void registrarPersona(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarPersona(persona);
	    
	 }
	   
	 
	 
	/**
	 * permite consultar el Cliente asociado al documento enviado
	 * como parametro 
	 * @param documento 
	 * @return
	 */
	
	@RequestMapping("/consultarPersona")
	public ArrayList<ClienteVO> consultarPersona(int documento) {
		ClienteDAO Dao=new ClienteDAO(); 
	return 	Dao.consultarpersona(documento);
		
	}



	/**
	 * permite consultar la lista de Clientes
	 * @return
	 */
	@RequestMapping("/listarPersonas")
	public ArrayList< ClienteVO> listaDePersonas() {
		ClienteDAO Dao=new ClienteDAO(); 
			
		return Dao.listaDePersonas();
		
	}


}