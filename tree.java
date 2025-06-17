// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Tree t=new Tree(new int[]{1,2,3,-1,-2});
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
    Tree(int[] nodes){
        this.root=buildTreeUsingArRAY(nodes);
        system.out.println(index);
    }

public Node buildTreeUSingArray(int[]nodes){
    index++;
    if(index >=nodes.length){
        return null;
    Node newNode=new Node(nodes[index]);
    newNode.left=buildTreeUsingArray(nodes);
    newNodes.right=buildTreeUsingArray(nodes);
    return newNode;
}
public void inOrder(){
    Node temp=root;
    inOrderHelper(temp);
}
public void inOrderHelper(Node temp){
        if(temp==null){
          return;
}
        inOrderHelper(temp.left);
        System.out.print(temp.data+"");
        inOrderHelper(temp.right);
        
}
}
