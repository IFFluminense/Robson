import java.util.Scanner;
import java.util.*; 
import java.util.function.Supplier; 

/**
 * Escreva uma descrição da classe aritmetica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class rouboDeDados
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    public rouboDeDados()
    {
    Scanner ler = new Scanner(System.in);
    int a;    
    
    double s, d, media, max;
    String n;
        
    System.out.printf("Insira seu nome: ");      n = ler.next();
    System.out.printf("Insira seu idader: ");    a = ler.nextInt();
    
    s = 0;
    max = 0;
    
    for (int c = 1; c <= 4; c++){
        System.out.printf("Insira seu salario: ");
        d = ler.nextInt();
        s = s + d;
        if (d > max){
            max = d;
        }
    }
    media = s / 4;
    
    System.out.printf("Bem vindo %s, voce tem %d anos. \n", n, a);
    System.out.printf("A media de seus salarios eh de:  %f\n", media);
    System.out.printf("Seu maior salario eh de:  %f\n", max);
    }

}
