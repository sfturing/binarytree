package cn.sfturing.traversal;

public class TreeNode {
	private TreeNode leftNode;
	private TreeNode rightNode;
	private int data;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode leftNode,TreeNode rightNode){
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getdata() {
		return data;
	}

	public void setdata(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TreeNode [leftNode=" + leftNode + ", rightNode=" + rightNode + ", data=" + data + "]";
	}
	
	
}
