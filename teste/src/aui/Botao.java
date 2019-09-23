package uai;


import teste.Rules;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W7E
 */
public class Botao {
    public char value;
    public int pox;
    private boolean active = true;

    public Botao(char x) {
        value = x;
        pox = (int)x;
    }
    
    public void check(){
       
        active = false;
        
    }
}
