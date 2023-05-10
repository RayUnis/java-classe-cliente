package net.ray.java_01;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private boolean primeiraVisita;

    public Cliente(String nome, String telefone, String email, boolean primeiraVisita) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.primeiraVisita = primeiraVisita;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isPrimeiraVisita() {
        return primeiraVisita;
    }
}