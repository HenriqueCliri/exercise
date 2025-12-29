
import java.util.List;
import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		List<String> nomeDeBanda = new ArrayList<String>();
		nomeDeBanda.add("Iron Maiden");

        //acessar a class Caixa.
        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(123);

        Integer meuNumero = caixaDeNumero.pegar();
        System.out.println(meuNumero);

        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Muito Bom Generics");

        String meuTexto = caixaDeTexto.pegar();
        System.out.println(meuTexto);
    }
}

class Caixa<T> {
    private T conteudo;

    public void guardar(T coisa){
        this.conteudo = coisa;
    }

    public T pegar() {
        return this.conteudo;
    }
}
