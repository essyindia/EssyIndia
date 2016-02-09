package traversal.tree.dsEssyIndia;

import tree.dsEssyIndia.TreeNode;


public class PreOrderRecA {
	public void preOrderTraversal(TreeNode objTreeNode){
		if(objTreeNode!=null){
			if(objTreeNode.getLeft()!=null){
				preOrderTraversal(objTreeNode.getLeft());
			}
			System.out.print(objTreeNode.getData()+", ");
			if(objTreeNode.getRight()!=null){
				preOrderTraversal(objTreeNode.getRight());
			}
		}
	}
}
