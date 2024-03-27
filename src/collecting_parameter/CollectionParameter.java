package collecting_parameter;

import java.util.List;
/**
 * Collecting Parameter é um padrão de projeto que permite
 * passar uma coleção (como uma lista, conjunto, mapa, etc.)
 * como parâmetro para um método ou função, em vez de passar
 *  múltiplos parâmetros individuais.
 */
public class CollectionParameter {

    public static void processElements(List<String> elements) {
        for (String element : elements) {
            System.out.println("Processando elemento: " + element);
        }
    }

    public static void main(String[] args) {
        List<String> lista = List.of("elemento1", "elemento2", "elemento3");
        processElements(lista);
    }
}