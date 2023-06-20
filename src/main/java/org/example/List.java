package org.example;

public class List {
    static Node head;
    Node tail;

    static class Node{
        int value;
        Node nextNode;
        Node prevNode;

    }

    public Node findNode(int value){   // нахождения необходимого элемента списка
        Node node = head;
        while (node.nextNode != null){
            node = node.nextNode;
            if(node.value == value){
                return node;
            }
        }
        return null;
    }

    public void lastAdd(int value){  // добавление нового элемента в конец списка
        Node node = new Node();
        node.value = value;
        tail.nextNode = node;   // присвоили следующей ноде после "хвоста" значение
        node.prevNode = tail;   // присвоили предыдущей ноде значение "хвоста". По сути просто выше добавили ноду
        tail = node;    // указали что нода (и её значение теперь "хвост")
    }

    public void add (int value, Node previousNode){   // добавление ноды в список  (ничего не понял)
        Node node = new Node();
        node.value = value;
        Node nextNode = previousNode.nextNode;
        previousNode.nextNode = node;
        node.prevNode = previousNode;
        node.nextNode = nextNode;
        nextNode.prevNode = node;
    }

    public void pushFront(int value){  // указать новое значение
        Node node = new Node();
        node.value = value;

        if (head == null){
            tail = node;
        } else {
            node.nextNode = head;
            node.prevNode = node;
        }
        head = node;
    }


    public void reverse(){   // разворот
        if (head.nextNode != null){  // проверка на одинаковое значение головы и хвоста
            tail = head;
            Node currentNode = head.nextNode;  // становится последним элементом списка (иначе говоря меняем местами)
            head.nextNode = null;   // присваиваем нулл значение, т.к. это хвост
            while (currentNode != null){
                Node next = currentNode.nextNode;  // сохранение ссылки на следующий элемент
                currentNode.nextNode = head;  // ссылке текущего элемента присваиваем head (ссылка на предыдущий элемент)
                head = currentNode;   // ссылка на текущий элемент
                currentNode = next;

            }
        }
    }

    public static void print(){ // печать списка
        Node node = head;
        while (node != null){
            System.out.printf("%d ", node.value);
            node = node.nextNode;
        }
        System.out.println();
    }


}
