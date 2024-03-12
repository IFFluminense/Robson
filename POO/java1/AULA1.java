import java.util.*;
/**
 * Escreva uma descrição da classe AULA1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AULA1
{
    static public void main(String Args[]){
        float x, y, z, sum, avg;

        x = Float.parseFloat(Args[0]);
        y = Float.parseFloat(Args[1]);  
        z = Float.parseFloat(Args[2]);
        
        sum = x+y+z;
        avg = sum/3;
        if(avg > 6){
                   System.out.printf("Aprovado. Sua nota foi %f.", avg);
        }
        else{
        if(avg > 4){
                   System.out.printf("Recuperacao. Sua nota foi %f.", avg);
        }
        else{
            System.out.printf("Reprovado. Sua nota foi %f.", avg);
        }
        }

        
    }

}
