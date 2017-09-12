package cn.sfturing.traversal.binarytree;

public class RecursiveTraversal {
	/**
	 * 递归前序遍历 root --left -- right
	 * 
	 * @param treeNode
	 */
	public void preorderTraverse(TreeNode treeNode) {
		if (treeNode == null) {
			return;
		}
		System.out.print(treeNode.getdata() + ",");
		preorderTraverse(treeNode.getLeftNode());
		preorderTraverse(treeNode.getRightNode());
	}

	/**
	 * 递归中序遍历 left--root  -- right
	 * 
	 * @param treeNode
	 */
	public void inorderTraverse(TreeNode treeNode) {
		if (treeNode == null) {
			return;
		}
		inorderTraverse(treeNode.getLeftNode());
		System.out.print(treeNode.getdata() + ",");
		inorderTraverse(treeNode.getRightNode());
	}

	/**
	 * 递归中序遍历 left --right -- root
	 * 
	 * @param treeNode
	 */
	public void afterorderTraverse(TreeNode treeNode) {
		if (treeNode == null) {
			return;
		}
		afterorderTraverse(treeNode.getLeftNode());
		afterorderTraverse(treeNode.getRightNode());
		System.out.print(treeNode.getdata() + ",");
	}
}
