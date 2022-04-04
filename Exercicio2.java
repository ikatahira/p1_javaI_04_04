/**
 * 
 * 2) Imprima todos os múltiplos de 6, entre 1 e 100.

Exibirá assim: 0, 6, 12, 18, 24, 
30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90 e 96.
 */

public class Exercicio2 {
    public static void main(String[] args) {
        
        for (int index = 0; index <= 100; index+=6) {
            System.out.println(index);
        }
        for ( int index = 0; index <=100; index++) {
            if(index % 6==0){
                System.out.println(index);
            }
        }
    }
    
}
