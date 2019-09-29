public class Arraycopy{
	public static void main(String[] args){
		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = {0,0,0,0,0,0,0,0,0,0};
		System.arraycopy(array1,0,array2,1,5);//array2的第1个开始到第5个复制给array1，从第0个开始
     	System.out.println("array2:");
     	for(int i=0;i<array2.length;i++)
        	System.out.println(array2[i]+" ");
	}
}