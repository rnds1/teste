/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Main {
    
    public static void main(String[] arg){
        System.out.println("hello world");
        
        Btn[] teste = new Btn[26];
        
        Ta.alfabeto(teste);
        
        for (Btn teste1 : teste) {
            teste1.showAttr();
        }
        
        
        
    
    }
}
