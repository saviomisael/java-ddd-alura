package br.com.alura.codechella.vendas.dominio.evento;

import br.com.alura.codechella.vendas.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID id;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos;

    public Evento() {
        this.tipoIngressos = new ArrayList<>();
        gerarIdentificadorUnico();
    }

    private void gerarIdentificadorUnico() {
        this.id = UUID.randomUUID();
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentaCapacidadeDeIngressosPorTipo() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    public void setTipoIngressos(List<TipoIngresso> tipoIngressos) {
        this.tipoIngressos = tipoIngressos;
    }
}
