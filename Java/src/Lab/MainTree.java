//package Lab;
//
//import Java.core.List;
//import Java.core.Tree;
//
//public class MainTree {
//    public static Tree<String> createDefinedTree() {
//        Tree<String> root = new Tree<>("root");
//        Tree<String> node1 = root.addChild(new Tree<String>("node 1"));
//        Tree<String> node11 = node1.addChild(new Tree<String>("node 11"));
//        Tree<String> node111 = node11.addChild(new Tree<String>("node 111"));
//        Tree<String> node112 = node11.addChild(new Tree<String>("node 112"));
//
//        Tree<String> node12 = node1.addChild(new Tree<String>("node 12"));
//        Tree<String> node2 = root.addChild(new Tree<String>("node 2"));
//        Tree<String> node21 = node2.addChild(new Tree<String>("node 21"));
//        Tree<String> node22 = node2.addChild(new Tree<String>("node 22"));
//        return root;
//    }
//
//    public static void main(String[] args) {
//        Tree<String> a = MainTree.createDefinedTree();
//        a.addChild(new Tree<>("node 123"));
//        List<Tree<String>> aChildren = a.getChildren();
//        for (Tree<String> c: aChildren){
//            if(c.getRoot().equals("node 2")){
//                c.addChild(new Tree<>("node 23"));
//            }
//        }
//    }
//}