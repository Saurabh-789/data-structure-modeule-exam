class arraySort{
	static void insert(int[] arr){
		int length=arr.length;
		int elementInserted = arr[length -1];
		for(int i=length-2;i>=0;i--){
			if(arr[i]>elementInserted){
				arr[i+1]=arr[i];
				print(arr);
			}else{
				arr[i+1]=elementInserted;
				print(arr);
				break;
			}
			if((i==0)  && (arr[i]>elementInserted)){
				arr[i]=elementInserted;
				print(arr);
			}
			}
		}
		public static void main(String... args){
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
			int[] arr=new int[s];
			for(int i=0;i<s;i++){
				arr[i]=sc.nextInt();
			}
			insert(arr);
			sc.close();
			private static void print(int[] arr){
				for(int n:arr){
					System.out.print(n+" ");
				}
				System.out.print();
			}
		}
		}
