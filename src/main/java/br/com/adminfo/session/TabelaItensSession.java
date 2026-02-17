package br.com.adminfo.session;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import br.com.adminfo.model.Cerveja;
import br.com.adminfo.model.ItemVenda;

@SessionScope
@Component
public class TabelaItensSession {
	
	private Set<TabelaItensVenda> tabelas = new HashSet<>();
	
	public void adicionarItem(String uuid, Cerveja cerveja, int quantidade){
		TabelaItensVenda tabela = buscarPorTabelaUuid(uuid);
		tabela.adicionarItem(cerveja, quantidade);
		tabelas.add(tabela);
	}

	private TabelaItensVenda buscarPorTabelaUuid(String uuid) {
		TabelaItensVenda tabela = tabelas.stream().filter(t -> t.getUuid().equals(uuid)).findAny().orElse(new TabelaItensVenda(uuid));
		return tabela;
	}

	public List<ItemVenda> getItens(String uuid) {
		
		return buscarPorTabelaUuid(uuid).getItens();
	}
	

	public Object getValorTotal(String uuid) {
		return buscarTabelaPorUuid(uuid).getValorTotal();
	}

	private TabelaItensVenda buscarTabelaPorUuid(String uuid) {
		TabelaItensVenda tabela = tabelas.stream().filter(t -> t.getUuid().equals(uuid)).findAny().orElse(new TabelaItensVenda(uuid));
		return tabela;
	}

	public void alterarQuantidadeItens(String uuid, Cerveja cerveja, Integer quantidade) {
		TabelaItensVenda tabela = buscarTabelaPorUuid(uuid);
		tabela.alterarQuantidade(cerveja, quantidade);
		
	}

	public void excluirItem(String uuid, Cerveja cerveja) {
		TabelaItensVenda tabela = buscarTabelaPorUuid(uuid);
		tabela.excluirItem(cerveja);
		
	}
}
