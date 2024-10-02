class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        element = e;

        Node<String> head = new Node<>("Chicago");;
        Node<String> tail = head;
        

        // Añadir más nodos a la lista
        tail.next = new Node<>("Denver");
        tail = tail.next;
        tail.next = new Node<>("Dallas");
        tail = tail.next;

        // Recorrer y mostrar los elementos de la lista
        Node<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }
}
