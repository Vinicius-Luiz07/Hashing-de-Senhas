package com.hashingpassword.hashingpassword;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class HashObjeto {
    
    public static String hashMetodo(String senha) {
        try {
            
            // cria uma instância do MessageDigest para SHA-256 (gera um hash de 64 caracteres hexadecimais)

            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // converte a senha para bytes aplicando o hash utilizando UTF-8

            byte[] hash = digest.digest(senha.getBytes(StandardCharsets.UTF_8));

            // converte os bytes do hash para hexadecimal 

            StringBuilder hexaHash = new StringBuilder();
                for( byte b : hash) {
                hexaHash.append(String.format("%02x", b));
            }

            return hexaHash.toString(); // para retornar o valor de hexadecimal em string

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar a hash !" , e);
        }
    }

}
