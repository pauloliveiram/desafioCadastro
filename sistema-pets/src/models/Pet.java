package models;

import enums.SexoPet;
import enums.TipoPet;

public class Pet {
    private String nome;
    private String sobrenome;
    private TipoPet tipo;
    private SexoPet sexo;
    private String rua;
    private String numeroCasa;
    private String bairro;
    private String cidade;
    private String idade;
    private String peso;
    private String raca;

    public Pet(String nome, String sobrenome,
               TipoPet tipo, SexoPet sexo,
               String rua, String numeroCasa,
               String bairro, String cidade,
               String idade, String peso, String raca) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
}
