/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael
 */
public class Btn {
    private int id;
    private char value;

    public Btn(char letra) {
       id = (int)letra;
       value = letra;
               
    
    }
    public void showAttr(){
        //System.out.println(id);
        System.out.println(value);
    }
    
   
    
    
    
    
}
