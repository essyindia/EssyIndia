package traversal.tree.dsEssyIndia;

import java.util.LinkedList;
import java.util.Queue;

import tree.dsEssyIndia.TreeNode;

public class LevelOrder {
	
	Queue objQ;
	
	void levelOrderTraversal(TreeNode root){
		
		objQ=new LinkedList<TreeNode>();
		objQ.add(root);
		TreeNode node;
		
		while(!objQ.isEmpty()){
			node=(TreeNode) objQ.poll();
			if(node==null){
				
			}else{
				System.out.print(node.getData()+", ");
			}

			if(node.getLeft()!=null){
				objQ.add(node.getLeft());
				
			}
			
			if(node.getRight()!=null){  
				objQ.add(node.getRight());
			}
		}
		
	}



}