package cn.sfturing.thread.binarytree;

public class Traversal {
	/**
	 * 传入根节点
	 * @param p
	 */
	public void inOrderTraverse(BinaryNode p){
		while(p != null){
			while(p.isLfalg() == false){
				p = p.getLeftNode();
			}
			System.out.print(p.getData()+",");
			//如果结点的右flag为true且不为空，则打印结点的后继
			while(p.isRflag() == true && p.getRightNode() != null){
				p = p.getRightNode();
				System.out.print(p.getData() + ",");
			}
			//p进入右子树根
			p = p.getRightNode();
		}
	}
}
