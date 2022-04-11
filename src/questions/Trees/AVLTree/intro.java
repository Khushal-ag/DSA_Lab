/*
* self balancing BST
* having all parameters of BST
* NEED :-
    *  Balnacing factor(height difference : left - right) {-1,0,1}
    * Left and right subtree
    * two type of rotations :- single and double
    * single rotation :-
    * 1. left rotation(RR rotation) :- left subtree is bigger than right subtree
    * 2. right rotation(LL rotation) :- right subtree is bigger than left subtree
    * double rotation :-
    * 1. left-right rotation(LR) :-It is a sequence of single left rotation followed by a single right rotation.
    * 2. right-left rotation :- It is a sequence of single right rotation followed by a single left rotation.

    * AVLNode{
    * int data;
    * int height; // height = max(LH,RH)+1
    * AVLNode left;
    * AVLNode right;
    *int balance;
    * }
* */

package questions.Trees.AVLTree;

public class intro {
    // create AVL tree

}
