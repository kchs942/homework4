package homework4;

import java.util.Scanner;

public class GuGuDan2 {

     String su;
   
 
  	void input(){
		do{
            
			
			this.su="";
		Scanner s=new Scanner(System.in);
		System.out.print("E:짝수단,O:홀수단(Q:종료):");
		
		
		this.su=s.next();
		
		if(su.equals("E")){
		jjakprint();
		System.out.print("\n");		
		}
		
		if(su.equals("O")){
			holprint();
			System.out.print("\n");	
		}
	     
		
		}
		while(!su.equals("Q"));
	    
	
	}

	void jjakprint(){		
	   
		for(int i=1;i<=9;i++){
			
				for(int y=1;y<=9;y++){
					if(y%2==0)
		             System.out.print(y+"*"+i+"="+i*y+"\t");
				}
			System.out.println();
		}
		
	}
	void holprint(){		
		   
		for(int i=1;i<=9;i++){
			
			for(int y=2;y<=9;y++){
				if(y%2!=0)
	             System.out.print(y+"*"+i+"="+i*y+"\t");
			}
		System.out.println();
	}
	}
}
