package Practice5_3_1;

import java.util.Scanner;

public class Practice5_3_1 extends BSTree {
	
	public static void main(String[] args) {
		BSTree bsTree = new Practice5_3_1();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入二叉排序树的结点个数：");
		int n = sc.nextInt();
		System.out.print("请输入结点的关键字序列：");
		for (int i = 0; i < n; i++) {
			bsTree.insertBST(sc.nextInt(), null);
		}

		System.out.println("\n创建的二叉排序树的中序遍历序列为：");
		bsTree.inOrderTraverse(bsTree.getRoot());
		System.out.println();
	}

}
