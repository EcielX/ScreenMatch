package com.gmail.ecielxavier.screenmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String Json, Class<T> classe);
}
