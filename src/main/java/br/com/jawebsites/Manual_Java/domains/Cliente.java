package br.com.jawebsites.Manual_Java.domains;

import java.util.HashSet;
import java.util.Set;

import br.com.jawebsites.Manual_Java.domains.enuns.TipoCliente;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cnpjCpf;
	private TipoCliente tipo;
	private Set<String> telefone = new HashSet<>();

}
