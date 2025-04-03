package controllers;

import exceptions.*;
import models.Pet;
import services.PetService;

public class PetController {
    public void cadastrarNovoPet(String nome, String sobrenome,
                                 int tipo, String sexo,
                                 String rua, String numeroCasa,
                                 String bairro, String cidade,
                                 String idade, String peso, String raca) {
        PetService service = new PetService();
        try{
            Pet pet = service.cadastrarPet(nome, sobrenome, tipo, sexo, rua, numeroCasa, bairro, cidade, idade, peso, raca);
            System.out.println("Pet " + pet.getNome() + " cadastrado com sucesso!");
        } catch (InvalidAgeException | InvalidBreedException |
                InvalidCompleteNameException | InvalidSexException |
                InvalidTypeException | InvalidWeightException | NameOrLastNameNotFound ex) {
            System.out.println(ex.getMessage());
            System.out.println("O seu cadastro não foi realizado. Tente novamente!");
        }
    }
}
