import java.util.Scanner;
import java.util.*; 
import java.util.function.Supplier; 

/**
 * Escreva uma descrição da classe aritmetica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class medias
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe aritmetica
     */
    public medias()
    {
    Scanner ler = new Scanner(System.in);
    int n, d, s;
    double a;
    
    s = 0;
    
    double ArrayList;
        
    System.out.printf("Insira a quantidade de N a ser lidas");
    n = ler.nextInt();
    
    for (int c = 1; c <= n; c++){
        d = ler.nextInt();
        s = s + d;
    }
    
    a = s/n;
    
    System.out.printf("Sua media eh igual a %f", a);
    }

}