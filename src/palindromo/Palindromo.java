package palindromo;

public class Palindromo {

    private String sentenca;

    public Palindromo(String str){
        this.sentenca = str;
    }

    public boolean ehPalindromo(){
        char[] str = sentenca.toCharArray();
        for(int i=0; i< str.length / 2; i ++){
            int compl = str.length - i - 1;
            if(str[i] != str[compl]){
                return false;
            }
        }
        return true;
    }
}
