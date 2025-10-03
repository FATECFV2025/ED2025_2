import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // Stack é a estrutura que imita o comportamento de uma filha
        // Faz parte das categorias do TAD
        Stack<String> pilha_pratos = new Stack();

        // Empilhando Pratos
        pilha_pratos.push("Prato Laranja"); // Base
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho"); // Topo

        // Visualizar o elemento que esta no Topo da Pilha (Peek)
        System.out.println("O elemento do topo é: " + pilha_pratos.peek());

        // Verificar se a pilha esta vazia (Is Empty)
        System.out.println("Esta pilha vazia: " + pilha_pratos.isEmpty());

        // Verificar o tamanho da pilha (Size)
        System.out.println("Tamanho da Pilha: " + pilha_pratos.size());

        // Removendo(desempilhando) um elemento da pilha
        System.out.println("Elemento removido: "+pilha_pratos.pop());

        // Convertendo uma pilha para String
        System.out.println(pilha_pratos.toString());

        System.out.println(pilha_pratos.get(2));

        //Percorrer uma pilha
        for( int i = pilha_pratos.size()-1; i>=0;i--){
            //Get é uma função utilizada para acessar o elemento da Pilha através do seu Index
            System.out.println(pilha_pratos.get(i));
        }

        //All-mussar

        Stack<Caixa> pilhaCaixas = new Stack<>();
       
        // Estamos criando objeto Caixa dentro do método PUSH
        // Os valores estão sendo inseridos no Construtor
        pilhaCaixas.push(new Caixa(1,"Caixa do Mouse Lenovo"));
        pilhaCaixas.push(new Caixa(2, "Caixa de Mouse DELL"));
        pilhaCaixas.push(new Caixa(3, "Caixa de Mouse HP"));


        //Recuperar uma caixa
        System.out.println( );
        //Recuperando objeto.propriedades ou objeto.funcao
        pilhaCaixas.get(1).Exibir();


        
    }
}
