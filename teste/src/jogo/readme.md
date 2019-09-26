Base do jogo deve seguir os seguites scripts:
 que deveram ser otimizados!...

Scanner l = new Scanner(System.in);

     <b>   String letra; </b>
	
        String aux;
	
        char[] bux;
	
        String palavra = "abcdef";
	
        String superMask = "------";
	
        int chances = 6;
	
        char[] mask;
	
        mask = superMask.toCharArray();
	
        int conpletos =0;
	
        boolean ctn =true;
	
        
        
        while(chances > 0&& ctn ==true){
            //leitura de linha
            letra = l.nextLine();
            // trasforma linha em array de char
            bux = letra.toCharArray();
            aux = String.valueOf(bux[0]);
           // System.out.println("Letra foi:"+aux);
            //se digitar a palavra.
            if(palavra.equals(letra)){
                System.out.println("win");
              chances = -1;
            }//end if
            //se contem a letra
            else if(palavra.contains(aux)){
                //System.out.println("tem algo certo");
                for(int i=0;i<6;i++){
                    if(bux[0] == palavra.charAt(i)){
                        mask[i] = bux[0];
                    }
                }
                System.out.println(mask);
            }//end else
            else{
              chances --;
               
                Jogo.mostrarForca(7-chances);
            }
            //ver se ja completou
          ctn = false;
            for(int i=0;i<6;i++){
            if(mask[i] == '-'){
                ctn =true;
            }
            
            }//end for
            if(ctn == false){
             System.out.println("win");
			
            }
           
