package traversal.tree.dsEssyIndia;

import tree.dsEssyIndia.TreeNode;

public class DeclareTree { 
	public TreeNode addLeft(TreeNode node,int data){
		TreeNode objTreeNode=new TreeNode();
		objTreeNode.setData(data);
		objTreeNode.setLeft(null);
		objTreeNode.setRight(null);
		node.setLeft(objTreeNode);
		return objTreeNode;
	}  
	public TreeNode addRight(TreeNode node,int data){
		TreeNode objTreeNode=new TreeNode();
		objTreeNode.setData(data);
		objTreeNode.setLeft(null);
		objTreeNode.setRight(null);
		node.setRight(objTreeNode);
		return objTreeNode;
		
	} 
}
