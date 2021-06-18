

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) throws IOException {
             
            Scanner sc = new Scanner(System.in); 
                ReaderandWriter rdw = new ReaderandWriter(); //Criando objeto da classe de escrita/leitura  do arquivo 
	          int op;
	          System.out.println("----DIGITE O NOME DO AQUIVO E A SUA EXTENSÃO----(ex: arquivo.txt)");
                  String nomeArq = sc.nextLine();
	             
        do {
            System.out.print("\n-------O QUE DESEJA FAZER COM SEU ARQUIVO? ---------"
                    + "\n(1) Ler Arquivo"
                    + "\n(2) Escrever no arquivo"
                    + "\n(3) SAIR \nEscolha: ");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    rdw.reader(nomeArq);
                    
                    break;
                    
                case 2:
                    rdw.writer(nomeArq);
                    break;
                  
                case 3:
                   System.exit(0);
                    break;
            }
        } while (op != 3); 
                 
                  
		
                
		
        
	}
    }
    

