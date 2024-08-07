class NoListaEncadeada {
    int data;
    NoListaEncadeada next;

    NoListaEncadeada(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCycleDetection {

    public static Integer has_cycle(NoListaEncadeada head) {
        if (head == null) {
            return null;
        }

        NoListaEncadeada slow = head;
        NoListaEncadeada fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        NoListaEncadeada listaVazia = null;
        System.out.println(has_cycle(listaVazia));

        NoListaEncadeada node1 = new NoListaEncadeada(1);
        NoListaEncadeada node2 = new NoListaEncadeada(2);
        NoListaEncadeada node3 = new NoListaEncadeada(3);
        node1.next = node2;
        node2.next = node3;

        System.out.println(has_cycle(node1));


        NoListaEncadeada node4 = new NoListaEncadeada(1);
        NoListaEncadeada node5 = new NoListaEncadeada(2);
        NoListaEncadeada node6 = new NoListaEncadeada(3);
        node4.next = node5;
        node5.next = node6;
        node6.next = node4;

        System.out.println(has_cycle(node4));
    }
}
