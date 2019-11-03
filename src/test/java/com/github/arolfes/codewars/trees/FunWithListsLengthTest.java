package com.github.arolfes.codewars.trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FunWithListsLengthTest {

    @Test
    public void basicTests() {
        assertEquals(0, FunWithListsLength.length(null));
        assertEquals(4, FunWithListsLength.length(listFromArray(1, 2, 3, 4)));
    }

    private Node<Integer> listFromArray(int... arr) {

            Node<Integer> node = null;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (node == null) {
                    node = new Node<>(arr[i]);
                } else {
                    node = new Node<>(arr[i], node);
                }
            }

            return node;
        }

}
