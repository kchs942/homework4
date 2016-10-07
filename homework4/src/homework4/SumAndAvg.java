package homework4;

import java.util.Scanner;

public class SumAndAvg {
	 int num;
     String q;
    int hap=0;
    double avg;
    double count=0;
	void input(){
		do{
     
			this.q="";
		Scanner s=new Scanner(System.in);
		System.out.print("숫자를 입력(Q:종료):");
		
		if(s.hasNextInt()){
		this.num=s.nextInt();
	    this.hap+=this.num;
	    this.count++;
		}
		else this.q=s.next();
		}
		while(!q.equals("Q"));
	    
		 this.avg=this.hap/this.count;
		 
		 print();
	}

	void print(){		
	
		System.out.println("합계는"+this.hap+"평균은"+this.avg);
	}
}
