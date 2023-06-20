package org.example;

import org.w3c.dom.Node;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class dList{

}

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        list.print();

        list.reverse();

        list.print();



    }
}