package br.com.dimdim.resources;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import br.com.dimdim.entities.Correntista;

public class EnviarEmailResouce {
	
	
	public void enviaEmail(String nome, String email, boolean isNegativado) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("user_email_address", email);
		map.add("user_name", nome);
		map.add("dd_status", isNegativado);
		HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(map, headers);

		restTemplate.postForObject("https://rgm-nodemailer.herokuapp.com/email/send", httpEntity, Correntista.class);
		
	}
	
}
