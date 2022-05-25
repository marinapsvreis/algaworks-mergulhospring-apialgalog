package com.algaworks.algalog.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {
	
	@NotBlank
	@Column(name="destinatario_nome")
	private String nomeDestinatario;
	
	@NotBlank
	@Column(name="destinatario_logradouro")
	private String logradouroDestinatario;
	
	@NotBlank
	@Column(name="destinatario_numero")
	private String numeroDestinatario;
	
	@NotBlank
	@Column(name="destinatario_complemento")
	private String complementoDestinatario;
	
	@NotBlank
	@Column(name="destinatario_bairro")
	private String bairroDestinatario;
}
