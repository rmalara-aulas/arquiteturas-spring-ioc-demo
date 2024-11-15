package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

// UI = User Interface
@Component
public class ClienteUI {

    @Autowired
    ClienteService clienteService;

    public void cadastraCliente() {
        String id = JOptionPane.showInputDialog("Digite o id");
        String nome = JOptionPane.showInputDialog("Digite o nome");
        Cliente cli = new Cliente();
        cli.setId(Integer.parseInt(id));
        cli.setNome(nome);
        clienteService.insereCliente(cli);
    }

    public void pesquisaCliente() {
        String id = JOptionPane.showInputDialog("Digite o id para pesquisa");
        Cliente cli = clienteService.busca(Integer.parseInt(id));
        if (cli != null) {
            JOptionPane.showMessageDialog(null,
                    "Encontrado " + cli.getNome());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nao encontrado ");
        }
    }
}
