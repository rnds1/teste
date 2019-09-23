/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Random;

/**
 *
 * @author W7E
 */
public class  word {
     private Random r =  new Random();
    private String[] a = {"casa", "escola","praia"};
     
     public String b(){
     
     return a[r.nextInt(a.length)];
     }

    public word() {
        b().toString();
    }
     
     
}
