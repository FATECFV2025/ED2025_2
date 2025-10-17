import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        filaPrioridade();
    }
    public static void filaDupla(){
        Deque<String> filaDupla = new ArrayDeque<>();
        //Deque: Double-Ended Queue (Fila de duas pontas)
        
        //adicionar elementos na fila
        //no fim
        filaDupla.addLast("Francisco");
        filaDupla.addLast("Daisy");
        filaDupla.addLast("Rogério");
        
        //no inicio
        filaDupla.addFirst("Márcia");

        //exibir os elementos da fila em forma de texto
        System.out.println(filaDupla.toString());

        //exibir o primeiro elemento
        System.out.println(filaDupla.peekFirst());
        
        //exibir o ultimo elemento
        System.out.println(filaDupla.peekLast());

        //remover o primeiro elemento   
        filaDupla.removeFirst();
        System.out.println(filaDupla.toString());
        
        //remover o ultimo elemento   
        filaDupla.removeLast();
        System.out.println(filaDupla.toString());

        //LIFO e FIFO: Fila dupla mistura esses dois conceitos



    }
    public static void filaPrioridade(){
        PriorityQueue<Integer> filaPriori = new PriorityQueue<>();
        filaPriori.add(5);
        filaPriori.add(10);
        filaPriori.add(1);
        filaPriori.add(2);
        filaPriori.add(15);

        System.out.println("Primeiro a ser atendido: "+filaPriori.peek());
        
        //Percorrendo uma fila de prioridade
        while(!filaPriori.isEmpty()){
            System.out.println(" "+filaPriori.poll());
        }

    }
    public void filaSimples(){
        Queue<String> veiculos = new LinkedList<>();
        
        //adicionando veiculos na fila
        veiculos.offer("Corsa");
        veiculos.offer("Astra");
        veiculos.offer("Uno");
        veiculos.offer("Kwid");
        veiculos.offer("Mobi");

        //Visualizar o primeiro elemento da fila
        System.out.println("1º Veiculo da fila: "+veiculos.peek());

        //Remover o elemento da fila
        System.out.println("Veiculo removido: "+veiculos.poll());

        //Verificar se a fila esta vazia
        System.out.println("A fila esta vazia? "+veiculos.isEmpty());

        //Verificar o tamanho da fila
        System.out.println("Tamanho da fila: "+veiculos.size());

        //Percorrer um fila
        int i=1;
        for(String veiculo: veiculos){
            
            System.out.println("Posição da fila ["+i+"]: "+veiculo);
            i++;
        }

    }


}
