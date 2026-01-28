package br.com.adminfo.session;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class TabelaItensSession {
	
	private Set<TabelaItensVenda> tabelas = new HashSet<>();
}
