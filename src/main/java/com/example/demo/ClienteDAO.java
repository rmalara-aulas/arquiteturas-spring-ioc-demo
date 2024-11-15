package com.example.demo;

// DAO = Data Access Object
public interface ClienteDAO {
    void salvaCliente(Cliente cli);

    Cliente busca(int id);
}
