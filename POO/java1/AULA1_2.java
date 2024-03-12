
public class AULA1_2
{
      static public void main(String Args[]){
            int pass, lastNumber;
            pass = Integer.parseInt(Args[0]);
            lastNumber = pass % 10;
            
            if ((pass - 999) < 0){
            System.out.println("Sua matricula eh invalida!");}
            else{
            if ((pass - 9999) > 0){
            System.out.println("Sua matricula eh invalida!");}
            
            else{
            switch(lastNumber){
                case 1, 2:
                    System.out.println("Voce eh um medico");
                    break;
                case 3, 4, 5:
                    System.out.println("Voce eh um comprador");
                    break;
                case 6:
                    System.out.println("Voce eh um vendedor");
                    break;    
                case 7, 8:
                    System.out.println("Voce eh um RH");
                    break;  
                case 9:
                    System.out.println("Voce eh um ADM");
                    break;   }}
            }
        }
}
