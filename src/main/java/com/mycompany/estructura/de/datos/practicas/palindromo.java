/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura.de.datos.practicas;

/**
 *
 * @author Danie
 */
public class palindromo {
    
    public class Palindromo {

    // Método wrapper (público y limpio para el usuario)
    public static boolean esPalindromo(String palabra) {
        if (palabra == null) return false;
        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }

    // Método auxiliar recursivo (privado)
    private static boolean esPalindromoAux(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        } else if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return esPalindromoAux(palabra, inicio + 1, fin - 1);
    }
}
}
