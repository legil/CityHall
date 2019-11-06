package reviewweekeight;

import java.util.Arrays;
import java.util.Stack;

public class Btree {
    private static Stack<Btree> stk = new Stack<>();
    private Btree leftN = null;
    private Btree rightN = null;
    private boolean goalNode;
    private String name;

    private Btree(Btree leftN, Btree rightN, boolean goalNode, String name) {
        this.leftN = leftN;
        this.rightN = rightN;
        this.goalNode = goalNode;
        this.name = name;

    }

    private Btree getLeftN() {
        return leftN;
    }

    private Btree getRightN() {
        return rightN;
    }

    public String getName() {
        return name;
    }


    private static Btree makeTree(){
        Btree c5 = new Btree(null, null, true, "C5");
        Btree c6 = new Btree(null, null, false, "C6");

        Btree c3 = new Btree(null, null, false, "C3");
        Btree c4 = new Btree(null, null, true, "C4");

        Btree c1 = new Btree(c3, c4, false, "C1");
        Btree c2 = new Btree(c5, c6, false, "C2");

        return new Btree(c1, c2, false, "ROOT");
    }

    private static boolean isLeaf(Btree tree){
        return tree.getLeftN() == null && tree.getRightN() == null;
    }

    private static void solve(Btree tree){
        stk.push(tree);
        if(isLeaf(tree)){
            if(tree.goalNode){
                while(stk.size() > 1) {
                    System.out.print(stk.pop().getName()+ " <- ");
                }
                tree = stk.pop();
                System.out.println(tree.getName());
                stk.push(tree);
            }else {
                stk.pop();
            }
        }else{
            solve(tree.rightN);
            //stk.push(tree);
            solve(tree.leftN);
        }
    }


    public static void main(String[] args) {
        Btree tree = makeTree();
        solve(tree);
    }
}
