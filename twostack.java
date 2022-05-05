class twostack{
	int[] arr;
	int size;
	int top1,top2;
	
	twostack(int n){
		size=n;
		arr= new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	void push1(int x){
		if(top1>0){
			top1--;
			arr[top1]=x;
			System.out.println(x+" pushed");
		}else{
			System.out.println("Stack OverFlowed");
			return;
		}
	}
	
	void push2(int x){
		if(top2 < size-1){
			top2++;
			arr[top2]=x;
			System.out.println(x+" pushed");
		}else{
			System.out.println("Stack OverFlowed");
			return;
		}
	}
	int pop1(){
		if(top1<=size/2){
			int x=arr[top1];
			System.out.println(x+" popped");
			top1++;
			return x;
		}
		else{
			System.out.println("Stack UnderFlowed");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2>=size/2+1){
			int x=arr[top2];
			System.out.println(x+" popped");
			top2--;
			return x;
		}
		else{
			System.out.println("Stack UnderFlowed");
			System.exit(1);
		}
		return 1;
	}
	
	public static void main(String... args){
		twostack ts = new twostack(60);
		ts.push1(5); 
		ts.push2(10); 
		ts.push2(15); 
		ts.push1(11); 
		ts.push2(7); 
		ts.push2(40);
		System.out.println();
		ts.pop1();
		ts.pop2();
	}
	
}