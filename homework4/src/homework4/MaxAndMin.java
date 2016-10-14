package homework4;

import java.util.Scanner;

public class MaxAndMin {
	 int num;
     String q;
    int max=0;
    int min=100;
	void input(){
		do{
     
			this.q="";
		Scanner s=new Scanner(System.in);
		System.out.print("0~100사이의 숫자를 입력(Q:종료):");
		
		if(s.hasNextInt()){
		this.num=s.nextInt();
		
		
		if(this.max<this.num)
			this.max=this.num;
				
		 if(this.min>this.num)
			 this.min=this.num;
		
		
		
	
		}
		else this.q=s.next();
		}
		while(!q.equals("Q"));
	
		 print();
	}

	void print(){
		
		 
		System.out.println("가장큰수는"+this.max+"가장작은수는"+this.min);
	}
	
}
