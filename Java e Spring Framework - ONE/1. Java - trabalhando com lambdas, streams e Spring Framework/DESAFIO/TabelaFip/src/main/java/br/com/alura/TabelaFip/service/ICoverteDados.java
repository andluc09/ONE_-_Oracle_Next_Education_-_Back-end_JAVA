package br.com.alura.TabelaFip.service;

import java.util.List;

public interface ICoverteDados {
    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}
