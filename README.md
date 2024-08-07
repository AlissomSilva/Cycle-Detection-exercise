# Detecção de Ciclos em Lista Encadeada

Este repositório contém uma implementação em Java de umu exercício do HackerRank para detectar ciclos em uma lista encadeada. O algoritmo determina se uma lista encadeada contém um ciclo, onde um ciclo é definido como um nó que é visitado mais de uma vez enquanto percorremos a lista.


- `NoListaEncadeada.java`: Define a estrutura do nó da lista encadeada.
- `LinkedListCycleDetection.java`: Contém a lógica para detectar ciclos na lista encadeada e uma função `main` para testar o código.

## Como Executar

1. **Clonar o Repositório**

   ```sh
   git clone https://github.com/SEU_USUARIO/Cycle-Detection-exercise.git
   cd Cycle-Detection-exercise
2. **Compilar o Código**

Compile o código usando javac. Certifique-se de estar na pasta src:
  
  javac com/example/linkedlistcycledetection/*.java

3. **Executar o Programa**

Execute o programa Java:

  java com.example.linkedlistcycledetection.LinkedListCycleDetection

## Testando o Código

O método has_cycle na classe LinkedListCycleDetection é usado para detectar ciclos na lista encadeada. Ele retorna 1 se houver um ciclo e 0 se não houver. Se a lista estiver vazia, o método retornará null.

Exemplo de Uso:
```java
NoListaEncadeada listaVazia = null;
System.out.println(LinkedListCycleDetection.has_cycle(listaVazia)); // Deve imprimir: null

NoListaEncadeada node1 = new NoListaEncadeada(1);
NoListaEncadeada node2 = new NoListaEncadeada(2);
NoListaEncadeada node3 = new NoListaEncadeada(3);
node1.next = node2;
node2.next = node3;
System.out.println(LinkedListCycleDetection.has_cycle(node1)); // Deve imprimir: 0

NoListaEncadeada node4 = new NoListaEncadeada(1);
NoListaEncadeada node5 = new NoListaEncadeada(2);
NoListaEncadeada node6 = new NoListaEncadeada(3);
node4.next = node5;
node5.next = node6;
node6.next = node4;
System.out.println(LinkedListCycleDetection.has_cycle(node4)); // Deve imprimir: 1

## Contribuição
Sinta-se à vontade para contribuir com este projeto. Para contribuir, siga estes passos:

Faça um fork do repositório.
Crie uma branch para suas alterações (git checkout -b minha-contribuicao).
Faça suas alterações e commit (git commit -am 'Adiciona nova funcionalidade').
Faça o push para sua branch (git push origin minha-contribuicao).
Abra um Pull Request no GitHub.
