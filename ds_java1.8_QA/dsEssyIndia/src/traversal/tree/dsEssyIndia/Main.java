package traversal.tree.dsEssyIndia;

import tree.dsEssyIndia.TreeNode;

public class Main {
	public static void main(String[] args) {
		TreeNode objTreeNode=new TreeNode();
		DeclareTree objDeclareTree=new DeclareTree();
		TreeNode objTreeNodeLeft;
		TreeNode objTreeNodeRight;
		objTreeNode.setData(10);
		objTreeNodeLeft=objDeclareTree.addLeft(objTreeNode, 8);
		objTreeNodeRight=objDeclareTree.addRight(objTreeNode, 12);
		objDeclareTree.addLeft(objTreeNodeLeft, 7);
		objDeclareTree.addRight(objTreeNodeLeft, 9);
		objDeclareTree.addLeft(objTreeNodeRight, 11);
		objDeclareTree.addRight(objTreeNodeRight, 13);
		
		System.out.println("--Level Order Traversal--");
		LevelOrder objLevelOrder=new LevelOrder();
		objLevelOrder.levelOrderTraversal(objTreeNode);
		System.out.println("\n--End--");

		System.out.println("--Pre Order Traversal--");
		PreOrder objPreOrder=new PreOrder();
		objPreOrder.preOrderTraversal(objTreeNode);
		System.out.println("\n--End--");
	}	
}
