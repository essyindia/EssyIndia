package traversal.tree.dsEssyIndia;

import tree.dsEssyIndia.TreeNode;

public class InOrderRecA {
	public void inOrderTraversal(TreeNode objTreeNode){
		if(objTreeNode!=null){
			System.out.print(objTreeNode.getData()+", ");
			if(objTreeNode.getLeft()!=null){
				inOrderTraversal(objTreeNode.getLeft());
			}
			if(objTreeNode.getRight()!=null){
				inOrderTraversal(objTreeNode.getRight());
			}
		}
	}

}
