package Aula4;

import java.util.List;

public class Ordenacao {
    private Numero[] numeros;
    
    public Ordenacao(int[] ints) {
        int tamanho =  ints.length;
        numeros = new Numero[tamanho];
        for(int i =0 ; i< tamanho; i++){
            Numero n = Numero.getInstance(ints[i]);
            numeros[i] = n;
        }
    }

    

    public int[] getNumeros(){
        int resposta[] = new int[numeros.length];
        for(int i = 0; i< numeros.length ;  i++){
            resposta[i] = numeros[i].getNumero();
        }
        return resposta;
    }

    public Numero[] getterNumeros(){
        return this.numeros;
    }

    public Numero[] inserir(int integer){
        Numero n = Numero.getInstance(integer);
        Numero[] temp = new Numero[ numeros.length +1 ];
        for(int i = 0; i< numeros.length  ;  i++){
            temp[i] = numeros[i];
        }
        temp[numeros.length] = n;
        numeros = temp;
        return temp;
    }

}
