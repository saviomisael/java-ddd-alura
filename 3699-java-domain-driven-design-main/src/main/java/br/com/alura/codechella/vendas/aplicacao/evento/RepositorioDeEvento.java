package br.com.alura.codechella.vendas.aplicacao.evento;

import br.com.alura.codechella.vendas.dominio.evento.Evento;
import br.com.alura.codechella.vendas.infra.evento.Endereco;

public interface RepositorioDeEvento {
    Evento buscarEventoPorCidade(Endereco endereco);
}
