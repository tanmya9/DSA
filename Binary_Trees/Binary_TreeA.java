package Binary_Trees;
import java.util.*;
public class Binary_TreeA {
	//blueprint of node
	static class Node{
		int data;
		Node left; //left child node
		Node right; //right child node
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTree{
		//visit each data given in the array
		//create nodes using that data
		static int idx=-1;
		public static Node buildTree(int nodes[]) //traverses only the root
		{
			idx++;
			if(nodes[idx]== -1)//if data at given index is leaf node
			{
				return null;
			}
			
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes); //buildTree builds the left subtree and attaches
			newNode.right=buildTree(nodes);//buildTree builds the right subtree and attaches
			
			return newNode;
		}
	}
	public static void main(String args[])
	{
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.print(root);
	}
}
