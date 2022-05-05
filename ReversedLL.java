class ReversedLL{
	node head;
	node tail;
	static class node{
		node next;
		node prev;
		int data;
	node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	}
	
	void append(int data){
		node newnode = new node(data);
		if(head==null){
			head=newnode;
		}else if(head!=null && head.data!=data){
		newnode.next=head;
		head=newnode;
		}
		
	}
	
	void display(){
		node temp =head;
		if(head==null){
		System.out.println("linked List Not Exist");
		}else{
			while(temp!=null){
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.print("NULL");
		}
	}
	
	/* void Revdisplay(){
		node temp =head;
		while(temp.next!=null){
			temp=temp.next;
			}
			System.out.println("NULL-->");
			while(temp.prev!=null){
			System.out.println(temp.data+"-->");
			temp=temp.prev;
			}
	} */
	
	
	public static void main(String... args){
		ReversedLL LL = new ReversedLL();
		LL.append(1);
		LL.append(5);
		LL.append(1);
		LL.append(2);
		LL.append(3);
		LL.append(4);
		LL.append(5);
		LL.display();
		//LL.Revdisplay();
	}
}