package cn.sfturing.tree;

import java.util.ArrayList;
import java.util.List;

public class BinayTree {

	public static List<TreeNode> initBinayTree(int[] tree) {
		List<TreeNode> treeNode = new ArrayList<>();
		// 初始化数据
		for (int treeNodedata : tree) {
			treeNode.add(new TreeNode(treeNodedata));
		}
		// 初始化结点的子节点
		/***************
		 * 		0		*
		 * 	   / \		*
		 *    1   2 	*
		 *   / \ / 		*
		 *  3  4 5 		*	
		 ****************
		 * 举例(见上图完全二叉树)：
		 * 除了结点3，其余非叶子结点都初始化子节点（不能保证最后一个结点的度是否为2，所以分情况处理）
		 */
		for (int parentNode = 0; parentNode < tree.length / 2 - 1; parentNode++) {
			//初始化左儿子
			treeNode.get(parentNode).setLeftNode(treeNode.get(2 * parentNode + 1));
			//初始化右儿子
			treeNode.get(parentNode).setRightNode(treeNode.get(2 * parentNode +2));
		}
		//处理最后一个结点的子节点
		int lastNode = tree.length / 2 - 1;
		treeNode.get(lastNode).setLeftNode(treeNode.get(lastNode * 2 + 1));
		if(tree.length % 2 != 0){
			treeNode.get(lastNode).setRightNode(treeNode.get(lastNode * 2 + 2));
		}

		return treeNode;
	}

}
