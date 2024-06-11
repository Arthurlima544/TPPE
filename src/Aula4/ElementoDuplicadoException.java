package Aula4;

public class ElementoDuplicadoException extends Exception {
    public ElementoDuplicadoException(int n){
        super(n + "ja existe o elemento ");
    }

}
