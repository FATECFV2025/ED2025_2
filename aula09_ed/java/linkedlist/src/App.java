import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // listaSimples();
        listaEncadeada();
    }

    public static void listaSimples(){
        ArrayList<String> listaCompras = new ArrayList<>();

        //adicionando elementos na lista
        listaCompras.add("Pão");
        listaCompras.add("Café");
        listaCompras.add("Leite");
        listaCompras.add("Manteiga");

        //acessando um elemento da lista
        System.out.println(listaCompras.get(0));

        //removendo um elemento da lista
        listaCompras.remove(1);

        //exibindo a lista
        System.out.println(listaCompras.toString());

        //obtendo o tamanho da lista 
        System.out.println(listaCompras.size());


        //verificando se a lista esta vazia
        System.out.println(listaCompras.isEmpty());
    }


    public static void listaEncadeada(){
        LinkedList<String> veiculo = new LinkedList<>();

        //adicionando elementos
        veiculo.add("Gol");
        veiculo.add("Uno");

        //adicionando elementos no fim
        veiculo.addLast("HB20");
        veiculo.addLast("HRV");

        //adicionando elementos no inicio
        veiculo.addFirst("Palio");
        veiculo.addFirst("Corsa");

        //exibindo elementos 
        System.out.println(veiculo.toString());

        //removendo elementos da lista
        //no fim
        veiculo.removeLast();

        //no inicio
        veiculo.removeFirst();

        //uma posicao especifica
        veiculo.remove(0);

        //recuperando um veiculo
        System.out.println(veiculo.get(0));

        //tamanho da lista
        System.out.println(veiculo.size());

        //limpando a lista
        veiculo.clear();
        System.out.println(veiculo.size());


    }
}
