package chap18;

public class Exam2 {

	public static void main(String[] args) {
		
		System.out.println("두수(5,2)의 합:"+calc(5,2,(x,y)->x+y));
		System.out.println("두수(5,2)의 곱:"+calc(5,2,(x,y)->x*y));
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr 배열의 최대값:"+calc(arr,(x,y)->x>y?x:y));
		System.out.println("arr 배열의 최소값:"+calc(arr,(x,y)->x<y?x:y));
	}
	private static int calc(int i, int j, LambdaInterface4 f) {
		
		return f.method(i, j);
	}
	private static int calc(int[] arr,LambdaInterface4 f) {
		int result = arr[0];//1	2 3 4 5...  
		for(int i : arr) {	//2	3 4 5 6....
			result = f.method(result,i);
		}
		return result;
	}

}
