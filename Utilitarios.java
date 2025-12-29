import java.util.List;

public class Utilitarios {
    public static <T> void imprimirArray(T[] array) {
        for(T elemento: array){
            System.out.println(elemento);
        }
    }

    public static void imprimirLista(List<?> lista) {
        for(Object item: lista){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5};
        String[] palavras = {"Oi", "Caçador", "Amor e Paz"};

        Utilitarios.imprimirArray(numeros);
        Utilitarios.imprimirArray(palavras);
    }

        public void numeros() {
        // Implementation for numeros()
        System.out.println("Método numeros chamado.");
    }
        public void palavras() {
        // Implementation for numeros()
        System.out.println("Método numeros chamado.");
    }
}