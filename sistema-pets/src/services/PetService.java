package services;

import enums.SexoPet;
import enums.TipoPet;
import exceptions.*;
import models.Pet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetService {
    public Pet cadastrarPet(String nome, String sobrenome,
                            int tipo, String sexo,
                            String rua, String numeroCasa,
                            String bairro, String cidade,
                            String idade, String peso, String raca) {

        String NAO_INFORMADO = "NÃO INFORMADO";
        TipoPet tipoPet;
        SexoPet sexoPet;

        if (raca == null) {
            raca = NAO_INFORMADO;
        }
        if (numeroCasa == null) {
            numeroCasa = NAO_INFORMADO;
        }
        if (idade.isEmpty()) {
            idade = NAO_INFORMADO;
        } else {
            if ( Double.parseDouble(idade) > 20) {
                throw new InvalidAgeException("Idade inválida. Seu pet deve ter menos de 20 anos!");
            }
            if (Double.parseDouble(idade) < 1) {
                idade = String.valueOf(Double.parseDouble(idade)/12);
            }
        }
        if (peso.isEmpty()) {
            peso = NAO_INFORMADO;
        } else {
            if (Double.parseDouble(peso) < 0.5 || Double.parseDouble(peso) > 60) {
                throw new InvalidWeightException("Peso inválido. O seu pet deve ter entre 0.5kg e 60kg");
            }
        }
        if (nome == null || sobrenome == null) {
            throw new NameOrLastNameNotFound("Campos nome e sobrenome devem ser preenchidos");
        }
        String nomeCompleto = nome + " " + sobrenome;
        String regexNome = "([a-zA-ZÁ-ú0-9]+(\\s|$))+";
        Pattern patternNome = Pattern.compile(regexNome);
        Matcher matcherNome = patternNome.matcher(nomeCompleto);
        boolean isNomeCompletoValido = matcherNome.matches();
        if (!isNomeCompletoValido) {
            throw new InvalidCompleteNameException("Nome e sobrenome não podem ter caracteres especiais");
        }
        tipoPet = switch (tipo) {
            case 1 -> TipoPet.GATO;
            case 2 -> TipoPet.CACHORRO;
            default -> throw new InvalidTypeException("Tipo de pet inválido!");
        };

        sexoPet = switch (sexo) {
            case "M" -> SexoPet.MACHO;
            case "F" -> SexoPet.FEMEA;
            default -> throw new InvalidSexException("Sexo do pet inválido!");
        };

        String regexRaca = "([a-zA-ZÁ-ú]+(\\s|$))+";
        Pattern patternRaca = Pattern.compile(regexRaca);
        Matcher matcherRaca = patternRaca.matcher(raca);
        boolean isRacaValida = matcherRaca.matches();
        if (!isRacaValida) {
            throw new InvalidBreedException("Raça não pode ter números e caracteres especiais");
        }

        return new Pet(nome, sobrenome, tipoPet, sexoPet, rua, numeroCasa, bairro, cidade, idade, peso, raca);
    }
}
