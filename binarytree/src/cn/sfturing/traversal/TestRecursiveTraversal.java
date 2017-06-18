package cn.sfturing.traversal;

import java.util.List;

/**
 * 
 * @author sfturing
 *
 * @date 2017年6月16日
 */
public class TestRecursiveTraversal {

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
		RecursiveTraversal recursiveTraversal = new RecursiveTraversal();
		System.out.println("*****递归前序遍历开始*****");
		recursiveTraversal.preorderTraverse(root);
		System.out.println();
		System.out.println("*****递归前序遍历结束*****" + "\n");
		System.out.println("*****递归中序遍历开始*****");
		recursiveTraversal.inorderTraverse(root);
		System.out.println();
		System.out.println("*****递归中序遍历结束*****" + "\n");
		System.out.println("*****递归后序遍历开始*****");
		recursiveTraversal.afterorderTraverse(root);
		System.out.println();
		System.out.println("*****递归后序遍历结束*****" + "\n");
	}

}
