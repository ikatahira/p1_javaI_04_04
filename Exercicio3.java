/**
 * 3) Cria uma classe com um vetor preenchido
 *  com todos os nomes de cinco principais commodities 
 * agrícolas brasileiras e um outro vetor com o preço de cada 
 * uma delas. Exiba esses dois vetores. Exemplos de commodities 
 * agrícolas:

 

Soja ; Trigo; Milho; Café; Laranja; Açúcar; Algodão; Carne.

 

No mercado de commodities 
agrícolas, estes itens podem negociados por meio de
 ações ou através do produto propriamente dito. 
 Desta forma, são negociadas a partir de quantidades 
 pré-estabelecidas, por exemplo:

Sacos de grãos de soja (60 kg).
Arrobas de boi gordo (15 kg).
Sacos de açúcar cristal (50 kg), etc.
Saca de café (60 kg), etc.
Algodão (1 kg), etc.
Saca de Milho (60 kg), etc.
 * 
 * 
 * 
 */

public class Exercicio3 {
    public static void main(String[] args) {

        String [] commodities=new String[5];
        double [] precos = new double [5];

        commodities[0]="milho";
        commodities[1]="feijão";
        commodities[2]="carne";
        commodities[3]="arroz";
        commodities[4]="café";

        precos[0]=1;
        precos[1]=2;
        precos[2]=3;
        precos[3]=4;
        precos[4]=5;
        
        for (int i = 0; i < precos.length; i++) {
            System.out.println(commodities[i] + " preços: "+precos[i]);
            
        }
    }
}
