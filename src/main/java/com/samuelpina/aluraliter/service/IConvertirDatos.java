package com.samuelpina.aluraliter.service;

public interface IConvertirDatos {
    <T> T obterDados(String json, Class<T> clase);
}
