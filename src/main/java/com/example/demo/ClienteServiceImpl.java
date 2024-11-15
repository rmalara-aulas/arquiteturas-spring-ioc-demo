package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    @Override
    public void insereCliente(Cliente cliente) {
        clienteDAO.salvaCliente(cliente);
    }

    @Override
    public Cliente busca(int id) {
        return clienteDAO.busca(id);
    }
}
