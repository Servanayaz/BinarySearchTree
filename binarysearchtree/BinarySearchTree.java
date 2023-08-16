

package binarysearchtree;
public class BinarySearchTree {
    Yaprak root;

    public BinarySearchTree() {
        this.root = null;
    }

    
    public void ekleme(int newData) {
        this.root = ekleme(root, newData);
    }

    public Yaprak ekleme(Yaprak root, int newData) {
        
        if (root == null) {
        
            root = new Yaprak(newData);
        
            return root;
        }
        
        else if (root.data >= newData) {
        
            root.sol = ekleme(root.sol, newData);
        } else {
        
            root.sag = ekleme(root.sag, newData);
        }
        return root;
    }

    
    public boolean ara(int data) {
        return ara(this.root, data);
    }

    private boolean ara(Yaprak root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return ara(root.sol, data);
        }
        return ara(root.sag, data);
    }

    
    public void gez() {
        gez(root);
        System.out.println();
    }

    public void gez(Yaprak root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        gez(root.sol);
        gez(root.sag);
    }

    public static void main(String[] args) {
        
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.ekleme(1);
        bst.ekleme(21);
        bst.ekleme(99);
        bst.ekleme(101);
        bst.ekleme(44);
        bst.gez();
        System.out.println(bst.ara(21));
        System.out.println(bst.ara(77));
       
    }
}

