package com.github.arolfes.codewars.trees;

/**
 * https://www.codewars.com/kata/581e476d5f59408553000a4b
 */
public class FunWithListsLength {

    static int length(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        
        return length(head.next) + 1;
    }


}
