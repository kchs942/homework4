package homework4;
import java.util.*;
public class SumOfNumbers {
       int num;
       String q;
     
	void input(){
		do{
			this.q="";
			
		Scanner s=new Scanner(System.in);
		System.out.print("마지막 수를 입력(Q:종료)");
		if(s.hasNextInt()){
		this.num=s.nextInt();
		print();
		}
		else this.q=s.next();
		}
		while(!q.equals("Q"));
	}

	void print(){
		  int hap=0;
		for(int i=1;i<=this.num;i++)
			 hap+=i;
		System.out.println("총합은"+hap+"입니다");
	}
	
	
}
