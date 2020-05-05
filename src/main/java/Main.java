import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Aluno a1 = new Aluno("Joao");
//        Aluno a2 = new Aluno("Jose");
//
//        Vetor lista = new Vetor();
//
//        lista.adiciona(1, a1);
//        lista.adiciona(2, a2);
//
//        System.out.println(lista);
//
//        Aluno a3 = new Aluno("Danilo");
//        System.out.println(lista.contem(a3));


        //--------------------------------------------//
//        ListaLigada lista = new ListaLigada();
//
//        System.out.println(lista);
//        lista.adicionaNoComeco("mauricio");
//        System.out.println(lista);
//        lista.adicionaNoComeco("paulo");
//        System.out.println(lista);
//        lista.adicionaNoComeco("guilherme");
//        System.out.println(lista);
//
//        lista.adiciona("marcelo");
//        System.out.println(lista);
//
//        lista.adiciona(2, "gabriel");
//        System.out.println(lista);
//
//        Object x = lista.pega(2);
//        System.out.println(x);
//
//        lista.removeDoComeco();
//        System.out.println(lista);

        //-------------------------------------------//

//        Pilha pilha = new Pilha();
//        pilha.insere("Mauricio");
//        System.out.println(pilha);
//
//        pilha.insere("Guilherme");
//        System.out.println(pilha);
//
//        String r1 = pilha.remove();
//        System.out.println(r1);
//
//        String r2 = pilha.remove();
//        System.out.println(r2);
//
//        System.out.println(pilha);

        //-------------------------------------------//

//        Stack<String> stack = new Stack<String>();
//        stack.push("Mauricio");
//        stack.push("Marcelo");
//
//        System.out.println(stack);
//
//        stack.pop();
//        System.out.println(stack);
//
//        String nome = stack.peek();
//        System.out.println(nome);

        //--------------------------------------------//

        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);

        Queue<String> filaDoJava = new LinkedList<String>();

        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();

    }
}
