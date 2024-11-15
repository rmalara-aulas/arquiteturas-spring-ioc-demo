package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ClientDAOMemoria implements ClienteDAO {

    private static Map<Integer, Cliente> dados;

    static {
        dados = new HashMap<>();
    }
    @Override
    public void salvaCliente(Cliente cli) {
        dados.put(cli.getId(), cli);
    }

    @Override
    public Cliente busca(int id) {
        return dados.get(id);
    }
}
