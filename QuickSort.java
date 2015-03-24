import java.util.Random;

import tools.Tool;

public class QuickSort {
	public void swap(int a[], int j, int i) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	private void quicksort(int[] a, int start,int end){
		int i=start,j=end;
		while(i!=j){
			while(i<j&&a[i]<=a[j])
				j--;
			swap(a,i,j);
			while(i<j&&a[i]<=a[j])
				i++;
			swap(a,i,j);
		}
		if(i-start>1)
			quicksort(a, start, i-1);
		if(end-j>1)
			quicksort(a, j+1, end);
	}
	private void sort(int[] a, int length) {
		// TODO Auto-generated method stub
		quicksort(a,0,length-1);
	}
	/**
	 *功能:快速排序,最快的内部排序算法。
	 *时间复杂度：n*logn
	 *辅助空间：O(1)
	 *不稳定
	 *  @author jie 时间 2013-10-20 下午10:18:32	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort sr = new QuickSort();
		Random rand=new Random();
		int length=rand.nextInt(10)+5;
		int a[] = new int[length];
		for(int i=0;i<length;i++){
			a[i]=rand.nextInt(length*2);
		}
		System.out.print("排序前：");
		//int []a={8,11,2,15,10,13,10,12,3,18};
		Tool.print(a);
		System.out.println();
		sr.sort(a, a.length);
		System.out.print("排序后：");
		Tool.print(a);
	}

}
