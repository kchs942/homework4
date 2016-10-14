package homework4;

import java.util.Scanner;

public class GuGuDan {
	 int num;
     String q;
 
  	void input(){
		do{
     
			this.q="";
		Scanner s=new Scanner(System.in);
		System.out.print("숫자를 입력(Q:종료):");
		
		if(s.hasNextInt()){
		this.num=s.nextInt();
		if(this.num>=2&&this.num<=9){
		print();
		System.out.print("\n");		
		}
		else System.out.println("잘못입력");
		
		}
		else this.q=s.next();
		}
		while(!q.equals("Q"));
	    
	
	}

	void print(){		
	   
		for(int i=1;i<=9;i++){
		System.out.print(this.num+"*"+i+"="+this.num*i+"\t");
		if(i==2)
			System.out.print("\n");	
		if(i==4)
			System.out.print("\n");	
		if(i==6)
			System.out.print("\n");	
		if(i==8)
			System.out.print("\n");	
		}
		
	}
}
