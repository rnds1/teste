package jogo;

import java.util.Scanner;


public class Jogo{
    
        private Scanner ler = new Scanner(System.in);
        private String letra;
        private String aux;
        private char[] bux;
        private String palavra = "abcdef";
        private String mask = "------"; //usar char[] para tirar redundancia ao converter;
        private char[] maskconv;
        private int chances;
        private int completos;
        private boolean cont = true;
    
      /*  
	private String palavra;
	private String mascara;
	public int chances = 6;
	private int w; */
	public static String ex[]	 = {
	"|||||||", //1
	"|   o", //2 
	"|  /|\\", //3
	"| / | \\", //4
	"|   |", //5
	"|  / \\", //6
	"| /   \\\n\n YOU LOSE OTARO."}; //7
	//funcionando
	public void ler(){
        letra = ler.nextLine();
        }
      
        public void getFirstchar(){
            System.out.println("Gerando caractere,,,");
            bux = letra.toCharArray();
            aux =  String.valueOf(bux[0]);
        }
     
        public void checkPalavra(){
            System.out.println("checando palavra,,,");
        if(palavra.equals(letra)){
            System.out.println("WIN");
            mask = palavra;
            }
            else {
            chances --;
            System.out.println("Tente novamente");
            }
        }
       
        public void checkLetra(){
             getFirstchar();
             
            System.out.println("checando letra...");
           
        if(palavra.contains(aux)){
            
             System.out.println("algo certo");
             
             for(int i=0;i<palavra.length();i++){
                 
                    if(palavra.charAt(i) == aux.charAt(0)){
                        
                        maskconv = mask.toCharArray(); //reduntante
                        
                        maskconv[i] = aux.charAt(0);
                        
                        mask = String.valueOf(maskconv); //redundante
                    }
                   }
            }else {
            
            chances --;
            
            System.out.println("Tente novamente");            
            }
            
        }//end checar letra
        
        public boolean completo(){
            System.out.println("...");
            if(mask.equals(palavra)) return true; else{return false;}                   
        }
        public void lp(){
            System.out.println("lp...");
        if(letra.length()<1){
            System.out.println("letra invalida\n tente novamente");
            ler();
            }
        else if(letra.length()>0&letra.length()<2){            
            checkLetra();            
            }else{            
                checkPalavra();            
            }        
        }
        
        /*
        
        
        
	public void jogar(){
		this.palavra = "abcdef";
		//funcionando
                
		//System.out.println("AFB:"+ this.palavra);
		
                
	}
	*/
	
	/*
	//define a mascara
	public void setMascara(){
            
            //Funcionando
		//this.mascara = this.palavra;
		int i = this.palavra.length();
                char[] b = this.palavra.toCharArray();
                for(int x =0;x<i;x++){
                //HERE chance all characters 
                b[x] = '-';
                    
                }
                this.mascara = String.valueOf(b);
		System.out.println(mascara);
	}
        */
	/*public void mostrarMascara(){
            System.out.println(mascara);
            
            //done
		//System.out.println("mostrando mascara");
	}*/
	
	public static void mostrarForca(int x){
            //Funcionando
	
		for(int w =0;w < x;w ++){ 
	System.out.println(Jogo.ex[w]);
		}
	
	
	}
	/*
	
	public void jogadaN(char[] x){
            boolean contem = false;
                if(this.chances <= 0){
                    mostrarForca(7-this.chances);
                }else{
            
                //Funcionando
                
		char[] b = this.palavra.toCharArray();
                int i,max;
                max = this.palavra.length();
              for(i=0;i<max;i++){
		if(b[i] == x[0]  ){
                    contem = true;
                    subistituir(i, x);
                    //System.out.println("xfx");
                    
                    } else {contem =false;}
              }//end for
                
                System.out.println(this.mascara);
                
                
              } // if
		if(contem == false){
                this.chances --;
                }
	}//end void
	
	public void subistituir(int pox, char c){
            
        
        }

    private void subistituir(int i, char[] x) {
        char[] d = this.mascara.toCharArray();
            d[i] = x[0];
            this.mascara = String.valueOf(d);
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	*/
	
}