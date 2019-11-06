package weekseven;

class BTree{
	BTree left;
	BTree right;
	boolean isGoodNode;
	String name;
	
	public BTree(BTree left, BTree right, boolean isGoodNode, String name){
		this.left = left;
		this.right = right;
		this.isGoodNode = isGoodNode;
		this.name = name;
	}
}


public class BinaryTreeGB {
	public static void main(String [] args) {
		BTree bt = makeTree();
		System.out.println(getGoodNode(bt).name);
	}
	
	public static BTree makeTree() {
		BTree c2 = new BTree(null, null, false, "c2");
		BTree c3 = new BTree(null, null, true, "c3");
		BTree c4 = new BTree(null, null, false, "c4");
		BTree c1 = new BTree(c3, c4, false, "c1");
		BTree c = new BTree(c1, c2, false, "c");
		
		return c;
	}
	
	public static BTree getGoodNode(BTree tree) { // solve()
		BTree res1, res2;
		if (tree.left == null && tree.right == null) { //if n is a leaf node
			if (tree.isGoodNode) {
				return tree;
			}  else {
				return null;
			}
		} else {
			res1 = getGoodNode(tree.left);
			res2 = getGoodNode(tree.right);  
		}
		
		if(res1 != null) {
			return res1;
		} else {
			return res2;
		}
	}
}