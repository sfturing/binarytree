package cn.sfturing.traversal.binarytree;

import java.util.List;

public class TestNonRecursiveTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化数据
		int[] tree = { 0, 1, 2, 3, 4, 5 };
		// 初始化二叉树
		/*
		 * BinayTree binayTree = new BinayTree(); List<TreeNode> treeNode =
		 * binayTree.initBinayTree(tree);
		 */
		List<TreeNode> treeNode = BinayTree.initBinayTree(tree);
		// 得到二叉树的根
		TreeNode root = treeNode.get(0);
		// 前序遍历递归方法
		NonRecursiveTraversal nonRecursiveTraversal = new NonRecursiveTraversal();
		System.out.println("*****递归前序遍历开始*****");
		nonRecursiveTraversal.preorderTraverse(root);
		System.out.println();
		System.out.println("*****递归前序遍历结束*****" + "\n");

		System.out.println("*****递归中序遍历开始*****");
		nonRecursiveTraversal.inorderTraverse(root);
		System.out.println();
		System.out.println("*****递归中序遍历结束*****" + "\n");
		System.out.println("*****递归后序遍历开始*****");
		nonRecursiveTraversal.afterorderTraverse(root);
		System.out.println();
		System.out.println("*****递归后序遍历结束*****" + "\n");

	}

}
