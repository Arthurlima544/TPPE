package exercicio;

public class App {
    public String str;
    public String command;

    public App(String s, String c){
        this.str = s;
        this.command = c;
    }


    public String result(){
        String result = "";
        String aux1;
        var list = command.toCharArray();
        if(command.contains("y") && command.contains("p")){
            aux1 = command.substring(command.indexOf("y") +1, command.indexOf("p"));

            int number = Integer.parseInt(aux1);
            for(int i=0 ; i< number; i++ ){
                result += this.str;
            }
        }else if(command.contains("s/") && command.contains("/g")){
            // take string that will be used later 
            String subs = command.substring(command.indexOf("s") + 1,command.indexOf("g"));
            //remove '/' from string
            String aux = subs.replace("/", "");

            char[] auxArray = aux.toCharArray();
            char[] stringCharlist = str.toCharArray();
            
            //replace char auxArray[0] for auxArray[1] on string 
            for(int i=0; i < stringCharlist.length ; i++){
                if(stringCharlist[i] == auxArray[0]){
                    stringCharlist[i] = auxArray[1];
                }
            }
            // convert charlist to string
            result = new String(stringCharlist);
            
        }
        return result;
    }
}
