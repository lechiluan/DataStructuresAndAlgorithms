package Java.core;
import java.util.List;

public class Tree<E> {
    private E root;
    private Tree<E> parent;
    private List<Tree<E>> children;


    public E getRoot() {
        return root;
    }

    public void setRoot(E root) {
        this.root = root;
    }

    public Tree<E> getParent() {
        return parent;
    }

    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    public List<Tree<E>> getChildren() {
        return children;
    }

    public void setChildren(List<Tree<E>> children) {
        this.children = children;
    }

    public Tree(E root, Tree<E>... child){/* ... là có cũng dc ko có cũng dc cả 2 cái cug dc*/
        this.root = root;
        this.children = (List<Tree<E>>) new ArrayList<E>();
        for (Tree<E> c:child){
            this.children.add(c);
            c.parent = this;
        }
    }

    public Tree<E> addChild(Tree<E> child){
        child.setParent(this); // cha vao con. set father
        this.children.add(child); // con vao cha. set child
        return child;
    }
    public void preOrder(){
        if (this==null) return;
        System.out.print(this.getRoot()+" ");
        for (Tree<E> c:this.getChildren()) {
            c.preOrder();
        }
    }
}
