import java.util.ArrayList; 
import java.util.Scanner;

public class idade_camila {

  public static void main(String[] args) {
   
    ArrayList<Integer> listaIdades = new ArrayList(); //criando a lista

    Scanner entrada = new Scanner(System.in); //entrada das idades

    for (int i = 0; i<3 ; i++){ //Um for para repetir o input 3x com a restrição 5 ≤ N ≤ 100

      
      System.out.println("Digite a idade "); //imprime o pedido de idades ao usuario

      Integer idades = entrada.nextInt(); //método para ler inteiro

      if (idades <= 100 && idades >= 5){ //restrição de idades
        listaIdades.add(idades); //adiciona as idades convertida de (str para int) na lista
      }else{
        i-=1; //vai diminuir 1 na contagem do for por isso ele retorna para o for
        System.out.println("Digite um valor Válido."); //caso a entrada for fora da restrição
      }
  
    }
    listaIdades.sort(null); //deixando as idades em ordem crescente 
    System.out.println("A idade da Camila é: "+listaIdades.get(1)); //imprime a idade na posição 1 da lista 
    entrada.close(); //fecha o Scanner
}
}