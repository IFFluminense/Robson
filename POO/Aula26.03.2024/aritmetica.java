import java.util.Scanner;
/**
 * Escreva uma descrição da classe aritmetica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class aritmetica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe aritmetica
     */
    public aritmetica()
    {
    Scanner ler = new Scanner(System.in);
    int a, b;
    
    System.out.printf("Informe o primeiro valor: ");
    a = ler.nextInt();
    
    System.out.printf("Informe o segundo valor: ");
    b = ler.nextInt();
    
    System.out.printf("Resultados: \n");
    System.out.printf("%d + %d = %d \n", a, b, (a+b));
    
    System.out.printf("%d - %d = %d \n", a, b, (a-b));
    
    System.out.printf("%d * %d = %d \n", a, b, (a*b));
    
    System.out.printf("Intei: %d / %d = %d \n", a, b, (a/b));
    
    System.out.printf("Exata: %d / %d = %1.10f \n", a, b, (double)a/b); 
    }

}
