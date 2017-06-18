package cn.sfturing.thread.binarytree;

import java.util.ArrayList;
import java.util.List;

public class ThreadTree {
	// 定义前驱结点
	private static BinaryNode pre;

	public static List<BinaryNode> initBinayTree(int[] tree) {
		List<BinaryNode> treeNode = new ArrayList<>();
		// 初始化数据
		for (int treeNodedata : tree) {
			treeNode.add(new BinaryNode(treeNodedata));
		}

		// 初始化结点的子节点
		/***************
		 * 0 * / \ * 1 2 * / \ / * 3 4 5 *
		 ****************
		 * 举例(见上图完全二叉树)： 除了结点3，其余非叶子结点都初始化子节点（不能保证最后一个结点的度是否为2，所以分情况处理）
		 */
		for (int parentNode = 0; parentNode < tree.length / 2 - 1; parentNode++) {
			// 初始化左儿子
			treeNode.get(parentNode).setLeftNode(treeNode.get(2 * parentNode + 1));
			// 初始化右儿子
			treeNode.get(parentNode).setRightNode(treeNode.get(2 * parentNode + 2));
		}
		// 处理最后一个结点的子节点
		int lastNode = tree.length / 2 - 1;
		treeNode.get(lastNode).setLeftNode(treeNode.get(lastNode * 2 + 1));
		if (tree.length % 2 != 0) {
			treeNode.get(lastNode).setRightNode(treeNode.get(lastNode * 2 + 2));
		}
		// 树的线索化
		inthreading(treeNode.get(0));
		return treeNode;
	}

	/**
	 * 二叉树线索化
	 * 
	 * @param p
	 */
	public static void inthreading(BinaryNode p) {
		// 判断结点是否为空
		if (p != null) {
			// 递归左子树线索化
			inthreading(p.getLeftNode());
			// 如果没有左孩子，则设置左指针指向前驱
			if (p.getLeftNode() == null) {
				p.setLfalg(true);
				p.setLeftNode(pre);
			}
			// 因为后继还没有遍历，所以换另一种情况，判断传入结点的前驱是否有右孩子
			// 如果没有，则设置前驱结点右指针（前驱的后继为传入的结点）
			if (pre != null) {
				if (pre.getRightNode() == null) {
					pre.setRflag(true);
					pre.setRightNode(p);
				}
			}
			pre = p;
			// 右子树线索化
			inthreading(p.getRightNode());

		}

	}
}
