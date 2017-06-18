package cn.sfturing.thread.binarytree;

import java.util.List;

public class TestThreadTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化数据
		int[] tree = { 0, 1, 2, 3, 4, 5 };
		// 建立树
		List<BinaryNode> threadBinaryTree = ThreadTree.initBinayTree(tree);
		// 得到树的根
		BinaryNode root = threadBinaryTree.get(0);
		// 线索树的遍历
		Traversal traversal = new Traversal();
		traversal.inOrderTraverse(root);

	}

}
