package traversal.tree.dsEssyIndia;

import tree.dsEssyIndia.TreeNode;

public class PostOrderRecA {
	public void postOrderTraversal(TreeNode objTreeNode){
		if(objTreeNode!=null){
			if(objTreeNode.getLeft()!=null){
				postOrderTraversal(objTreeNode.getLeft());
			}
			if(objTreeNode.getRight()!=null){
				postOrderTraversal(objTreeNode.getRight());
			}
		}
		System.out.print(objTreeNode.getData()+", ");
	}

}
