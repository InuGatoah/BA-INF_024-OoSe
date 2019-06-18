/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 18-6-2019                              *
 * Description: Uebung zu Baum strukturen       *
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/

import java.util.LinkedList;
/* a) -Preorder:  10, 5, 3, 4, 7, 12, 15, 13
 *    -Postorder: 4, 3, 7, 5, 13, 15, 12, 10
 *    -Inorder:   3, 4, 5, 7, 10, 12, 13, 15
 */

public class No3 {
// b)
    public static class TNode {
        int number;
        TNode left;
        TNode right;

        public TNode(int data) {
            this.number = data;
            right = null;
            left = null;
        }

        public TNode getLeft() {
            return this.left;
        }

        public void setLeft(TNode child) {
            this.left = child;
        }

        public TNode getRight() {
            return this.right;
        }
        
        public void setRight(TNode child) {
            this.right = child;
        }

        public void setLeftandRight(TNode lchild, TNode rchild) {
            this.left = lchild;
            this.right = rchild;
        }

    }
    
    public static class Baum {
        TNode root;

        public Baum(TNode Wurzel) {
            this.root = Wurzel;   
        }

        public TNode getRoot() {
            return this.root;
        }


        // c)
        public void Print(TNode node) {
            System.out.println(node.number);
        }

        public void printPre(TNode current) {
            if(root == null) {
                return;
            }

            Print(current);
            if(current.left != null) {
                printPre(current.getLeft());
            }
            if(current.right != null) {
                printPre(current.getRight()); 
            }
        }

        public void printPost(TNode current) {
            if(current == null) {
                return;
            }

            if(current.left != null) {
                printPost(current.getLeft());
            }
            if(current.right != null) {
                printPost(current.getRight());
            }
            Print(current);
        }

        public void printIn(TNode current) {
            if(current == null) {
                return;
            }

            if(current.left != null) {
                printIn(current.getLeft());
            }
            Print(current);
            if(current.right != null) {
                printIn(current.getRight());
            }
        }
        

        //d)
        public void printLevel() {
            LinkedList<TNode> = new LinkedList();
            queue.add(this.root);
            while(!queue.isEmpty()) {
                Print(queue.getFirst());
                if(queue.getFirst().left != null) {
                    queue.add(queue.getFirst().getLeft());
                }
                if(queue.getFirst().right != null) {
                    queue.add(queue.getFirst().getRight());
                }
                queue.pop();
            }
        }
    }
    

    //e
    public static class Main {
        public static void main (String[] args) {
            TNode root = new TNode(10);
            TNode five = new TNode(5);
            TNode three = new TNode(3);
            TNode four = new TNode(4);
            TNode seven = new TNode(7);
            TNode twelve = new TNode(12);
            TNode fifteen = new TNode(15);
            TNode thirteen = new TNode(13);

            root.setLeftandRight(five, twelve);
            five.setLeftandRight(three, seven);
            three.setRight(four);
            twelve.setRight(fifteen);
            fifteen.setLeft(thirteen);

            Baum tree = new Baum(root);

            System.out.println("Preorder: ");
            tree.printPre(tree.getRoot());

            System.out.println("Postorder: ");
            tree.printPost(tree.getRoot());

            System.out.println("Inorder: ");
            tree.printIn(tree.getRoot());
    
            System.out.println("Levelorder: ");
            tree.printLevel(tree.getRoot());
        }
    }
}
