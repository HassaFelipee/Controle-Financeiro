package com.fatec.controle_financeiro.entities;

public class User {
    private String nome;
        private Integer idade;

        public User(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }
        public Integer getIdade() {
            return idade;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setIdade(Integer idade) {
            this.idade = idade;
        }
}
