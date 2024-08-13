package com.trybe.agenda;

import java.util.HashMap;

/**
 * author joao.
 *
 */
public class AgendaMapa {
  private HashMap<String, String> contatos = new HashMap<String, String>();

  public void incluirContato(String nome, String telefone) {
    this.contatos.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    this.contatos.remove(nome);
  }

  /**
   * nome. param nome The name of the contact to check. return true if the contact exists, false
   * otherwise.
   */
  public boolean verificaContato(String nome) {
    return this.contatos.containsKey(nome);
  }

  public int tamanhoAgenda() {
    return this.contatos.size();
  }

  public void atualizarTelefone(String nome, String telefone) {
    incluirContato(nome, telefone);
  }

  public String obterTelefone(String nome) {
    return this.contatos.get(nome);
  }
}
