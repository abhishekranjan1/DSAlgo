package com.interview.tree.nodedefinition;

public class Node {


	public int data;
	public Node left;
	public Node right;

	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public int hd;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public static void main(String[]Args)
	{
		
		BinaryTree tree =new BinaryTree();
		tree.addNode(3);
		tree.addNode(9);
		tree.addNode(20);
		tree.addNode(15);
		tree.addNode(7);
		//tree.addNode(112);
//		tree.removeNode(85);

		tree.preOrderTraversal(tree.root);
		System.out.println("-----------------------");


		System.out.println("Height of tree before deletion:"+tree.height(tree.root));
		System.out.println("-----------------------");
		tree.removeNode(85);
		tree.inOrderTraversal(tree.root);
		System.out.println("-----------------------");
		tree.postOrderTraversal(tree.root);
		System.out.println("-----------------------");
		tree.preOrderTraversal(tree.root);

		System.out.println("-----------------------");
		System.out.println("Height of tree after deletion:"+tree.height(tree.root));

		System.out.println("-----------------------");
		System.out.println("kth Smallest no:"+ tree.kLowest(tree.root,4));

	}

}
