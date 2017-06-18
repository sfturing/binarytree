package cn.sfturing.thread.binarytree;

public class BinaryNode {
	private BinaryNode leftNode;
	private BinaryNode rightNode;
	private int data;
	private boolean lfalg =false;
	private boolean rflag = false;
	
	public BinaryNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public BinaryNode getLeftNode() {
		return leftNode; 
	}

	public void setLeftNode(BinaryNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isLfalg() {
		return lfalg;
	}

	public void setLfalg(boolean lfalg) {
		this.lfalg = lfalg;
	}

	public boolean isRflag() {
		return rflag;
	}

	public void setRflag(boolean rflag) {
		this.rflag = rflag;
	}

	@Override
	public String toString() {
		return "BinaryNode [leftNode=" + leftNode + ", rightNode=" + rightNode + ", data=" + data + ", lfalg=" + lfalg
				+ ", rflag=" + rflag + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
