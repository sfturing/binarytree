package cn.sfturing.tree;

import java.util.LinkedList;

public class NonRecursiveTraversal {
	/**
	 * 非递归前序遍历 使用栈解决
	 * 
	 * @param treeNode
	 */
	public void preorderTraverse(TreeNode treeNode) {
		// 初始化链栈
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		// 初始化当前结点为根节点
		TreeNode currentNode = treeNode;
		stack.push(currentNode);
		while (!stack.isEmpty()) {
			// 元素出栈打印
			currentNode = stack.pop();
			System.out.print(currentNode.getdata() + ",");
			// 如果结点右孩子不为空，入栈（因为节点顺序为根--左--右，所以右结点先入栈）
			if (currentNode.getRightNode() != null) {
				stack.push(currentNode.getRightNode());
			}
			// 左孩子入栈
			if (currentNode.getLeftNode() != null) {
				stack.push(currentNode.getLeftNode());
			}
		}

	}

	/**
	 * 非递归中序遍历 使用栈解决
	 * 
	 * @param treeNode
	 */
	public void inorderTraverse(TreeNode treeNode) {
		// 初始化链栈
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		// 设置当前结点
		TreeNode currentNode = treeNode;
		// 条件： 栈不为空或者当前结点不为空
		while (currentNode != null || !stack.isEmpty()) {
			// 当前结点不为空，则将结点的左孩子入栈,直到结点左孩子为null,退出循环，执行下一步操作
			while (currentNode != null) {
				// 将当前结点入栈
				stack.push(currentNode);
				// 设置当前结点为当前结点的左孩子
				currentNode = currentNode.getLeftNode();
			}
			// 判断栈是否为空
			if (!stack.isEmpty()) {
				currentNode = stack.pop();
				System.out.print(currentNode.getdata() + ",");
				// 设置当前结点为当前结点的右孩子,如果不为空，则执行上一个循环入栈
				currentNode = currentNode.getRightNode();
			}
		}
	}

	/**
	 * 非递归后序遍历 使用栈解决
	 * 
	 * @param treeNode
	 */
	public void afterorderTraverse(TreeNode treeNode) {
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode rightNode = null;
		TreeNode currentNode = treeNode;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeftNode();
			}
			currentNode = stack.pop();
			// 当上一个访问的结点是右孩子或者当前结点没有右孩子则访问当前结点
			while (currentNode != null
					&& (currentNode.getRightNode() == null || currentNode.getRightNode() == rightNode)) {
				System.out.print(currentNode.getdata() + " ");
				rightNode = currentNode;
				if (stack.isEmpty()) {
					return;
				}
				currentNode = stack.pop();
			}
			stack.push(currentNode);
			currentNode = currentNode.getRightNode();
		}

	}

}
