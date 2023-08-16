// ======= Case 3.1 ============
public class OneDirectionLinkedList<T> {

    protected Node<T> head;
    public void add(T element) {
        Node<T> item = new Node<>(element);
        if (head == null) {
            head = item;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = item;
        }
    }

    protected void reverse() {

        Node<T> temp = null;
        Node<T> next = null;
        while (head != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        head = temp;
    }

    void printList(Node<T> node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            super();
            this.data = data;
        }

    }
}
