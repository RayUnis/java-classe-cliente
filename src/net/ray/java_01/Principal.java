package net.ray.java_01;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123456789", "joao@email.com", true);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.isPrimeiraVisita());
    }
}