package Aula4;

public class Numero {
    private int numero;

    private Numero(int i){
        this.numero = i;
    }

    public int getNumero(){
        return numero;
    }

    public static Numero getInstance(int numero) {
        return new Numero(numero);
    }
    @Override
    public String toString() {
        return "" + numero;
    }
}
