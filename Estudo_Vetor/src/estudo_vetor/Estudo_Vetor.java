package estudo_vetor;

import javax.swing.JOptionPane;

public class Estudo_Vetor {

    public static void main(String[] args) {
  int vetor[] = new int [4];
     int valor,mediapares=0,mediaimpares=0,maiorpar=0,menorimpar=0;
     int quanpares=0,quatimpares=0,somapar=0;
     for (int i=0;i<vetor.length;i++){
         valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor: "));
         vetor[i]= valor;
         menorimpar = vetor[i];
         if(vetor[i]%2==0){
           maiorpar = vetor[i];
           quanpares = quanpares + 1;
           somapar = somapar + vetor[i];
           mediapares = quanpares / somapar;
         }
         else{
              menorimpar = vetor[i];
                  quatimpares = quatimpares + 1;
                  mediaimpares = mediaimpares + vetor[i];   
             }
    }
      if(mediapares>maiorpar){
             JOptionPane.showMessageDialog(null,"Números Pares Maior que a Media:"+ maiorpar);
         }
         if(menorimpar<mediaimpares){
             JOptionPane.showMessageDialog(null,"Números Impares Menor que a Media:"+ menorimpar);
         }
     JOptionPane.showMessageDialog(null,"Maior Número Par digitado:"+ maiorpar);
     JOptionPane.showMessageDialog(null,"Menor Número Impar digitado:"+ menorimpar);
     JOptionPane.showMessageDialog(null,"Media De Números Pares:"+ mediapares);
     JOptionPane.showMessageDialog(null,"Media De Números Impares:"+ mediaimpares/quatimpares);
    }
    }