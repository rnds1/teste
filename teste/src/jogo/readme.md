Base do jogo deve seguir os seguites scripts:
 que deveram ser otimizados!...

        @autor Rafael Nascimento dos Santos
            Formando em CST Jogos digitais Unime (LF)
        @projeto Jogo da forca
        @Status em andamento:incompleto
        @prof Othon 


            Objetivo:
        Criar um jogo da forca com palavra predefinida, onde o jogador ira 
digitar uma letra, ou tentar a sorte digitando toda a palavra, que caso esteja 
até completar a palavra. Porem ele tem um numero(6) limitado de chances.
Como é o jogo da forca uma <imagem> vai se formando casa vez que o jogador erra;

    Codigo:
        
    1.Basta apenas criar o objeto do jogo no main para ele ser executado;
       
    2 Script do jogo:
    2.1 Variaveis utilizadas :
    2.2 Funcoes:
    2.3 Autostart:
    No construtor do jogo chama a função Run que controla o estado do jogo.





























Scanner l = new Scanner(System.in);

        String letra; 
	
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
           
            }
//fiz até aqui.