package 算法;

import Bean.TreeNode;

public class TodayCoding0513 {

	public static void main(String[] args) {
		 
	}
	
	/**
	 * 题目5 给定一颗二叉树的头节点，已知其中所有节点的值都不一样。找到含有节点最多的搜索二叉树。
	 * 返回这棵子树的头节点。
	 */
	
	
	/**
	 * 题目13 二叉树节点间距离最大。
	 * 从二叉树节点A出发，可以向上走或者向下走，但沿途的节点只能经过一次，当到达节点B时，路劲上的节点数叫做A到B的距离，
	 * 给定一棵二叉树的头节点head，求整颗树节点间的最大距离。
	 */
	 
		 int result = 0;
		 public int diameterOfBinaryTree(TreeNode root) {
		        maxTreeHeigh(root);
		        return result;
		 }

		  //求一二叉树的最大深度
		  public int maxTreeHeigh(TreeNode tree){
		        if(tree == null){
		            return 0;
		        }
		        int left = maxTreeHeigh(tree.left);
		        int right = maxTreeHeigh(tree.right);
		        //需要在此更新最长路径 因为不一定穿过根节点
		        result = Math.max(result, left + right);
		        return 1 + Math.max(left,right);
		   }
	
		  /**
		   * 给定一颗二叉树的头节点head,已知所有节点的值都不一样。返回其中最大的且符合搜索二叉树条件的最大拓扑结构。
		   * O(N * logN)
		   * 拓扑贡献记录
		   * @author 斗酒相逢
		   *
		   */
		  
		  /**
		   * 题目 8 
		   * 给定彼此独立的两颗树头节点分别为t1和t2.判断t1中是否有和t2拓扑结构完全一样的树。
		   * 1 序列化
		   * 2 KMP
		   */
		  
		  /**
		   * 题目 9 
		   * 给定一棵树，判断是否是完全二叉树。
		   * 1 按层遍历。
		   * 2 一个节点有右孩子无左孩子。返回false.
		   * 3 一个节点有左孩子无右孩子，则以后的节点无孩子。否则返回false.
		   * 4 返回true.
		   */
}



