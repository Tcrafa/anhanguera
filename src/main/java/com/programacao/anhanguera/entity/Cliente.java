package com.programacao.anhanguera.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
public class Cliente {
	@Id
	private Long id;
	private String nome;
	private int idade;
	private String email;
	private String telefone;
	
	
	
}
