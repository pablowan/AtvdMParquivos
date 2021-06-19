

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

// @author Pablo

public class ReaderandWriter {

	public  void reader(String path) throws IOException {
              

try {
            FileReader arq = new FileReader(path); // Classe FileReader para abertura do arquivo informado pelo usuário.
            BufferedReader lerArq = new BufferedReader(arq); // Classe BufferedReader para leitura do arquivo.
            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) { // Tratamento de exceção caso haja erro na abertura do arquivo.
            System.err.printf("Ocorreu um erro na abertura do arquivo: %s.\nEscreva em seu arquivo para que ele seja criado no diretorio(pasta do projeto), assim será possivel realizar a sua leitura.\n", 
                    e.getMessage());
        }
        System.out.println();

	}
        
        
        

	public void writer(String path) throws IOException {
            try{
               BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		String linha = ExibeEscrita();
		buffWrite.append(linha + "\n");
		buffWrite.close(); 
            }
            catch(IOException i){
                System.err.println("Arquivo não encontrado!!!");
            }
		
	}


    public String ExibeEscrita(){
        Scanner l = new Scanner(System.in);
            System.out.println("Digite o conteudo do arquivo: ");
            return l.nextLine();
        
    }
} 
