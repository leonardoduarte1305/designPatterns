package dev.leoduarte.designpatterns.composite;

import dev.leoduarte.designpatterns.composite.implementations.Composite;
import dev.leoduarte.designpatterns.composite.implementations.Leaf;

import java.util.Arrays;

public class CompositeTest {

    /*
                                                        O CompositeA
                                                     /     \
                                                 /            \
                                             /                   \
                                          /                         \
                                     0 CompositeB                     0 CompositeC
                                 /        \                        /      \
                              /             \                   /             \
                           0 CompositeD        0 CompositeE    0 CompositeF     0 CompositeG
                         /  \                 / \            /  \              / \
                       /     \              /     \        /     \           /     \
                      0       0            0       0      0       0         0       0
                    LeafA   LeafB       LeafC   LeafD   LeafE    LeafF    LeafG    LeafH

     */


    public static void main(String[] args) {
        Leaf leafA = new Leaf("LeafA", 2);
        Leaf leafB = new Leaf("LeafB", 4);
        Leaf leafC = new Leaf("LeafC", 8);
        Leaf leafD = new Leaf("LeafD", 16);
        Leaf leafE = new Leaf("LeafE", 32);
        Leaf leafF = new Leaf("LeafF", 64);
        Leaf leafG = new Leaf("LeafG", 128);
        Leaf leafH = new Leaf("LeafH", 256);

        Composite compositeG = new Composite("CompositeG", Arrays.asList(leafG, leafH), "*");
        Composite compositeF = new Composite("CompositeF", Arrays.asList(leafE, leafF), "+");
        Composite compositeE = new Composite("CompositeE", Arrays.asList(leafC, leafD), "-");
        Composite compositeD = new Composite("CompositeD", Arrays.asList(leafA, leafB), "*");
        Composite compositeC = new Composite("CompositeC", Arrays.asList(compositeF, compositeG), "+");
        Composite compositeB = new Composite("CompositeB", Arrays.asList(compositeD, compositeE), "-");
        Composite compositeA = new Composite("CompositeA", Arrays.asList(compositeB, compositeC), "*");

        System.err.println(compositeA.executeAndReturnName());
        System.err.println(compositeA.calculate());
    }
}
