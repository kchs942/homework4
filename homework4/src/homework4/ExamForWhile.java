package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. 1부터 입력한 수까지 더하기");
	    	System.out.println("2. 최대값/최소값구하기");
	    	System.out.println("3. 입력받은숫자의 합계와 평균구하기");
	    	System.out.println("4. 원하는 구구단 출력하기 ");
	    	System.out.println("5. 짝수단/홀수단 출력하기");
	    	System.out.println("6. 종료하기");
	    	System.out.println("원하는 메뉴는>>");
	    	number=s.nextInt();
	    	
	    		if(number==1)
	    			new SumOfNumbers();
	    		
	    		else if(number==2)
	    			new MaxAndMin();
	    		
	    		else if(number==3)
	    			new SumAndAvg();
	    		
	    		else if(number==4)
	    			new GuGuDan();
	    		
	    		else if(number==5)
	    			new GuGuDan2();
	    		
	    	
	    }
	    while(number==6); 
	    System.out.print("종료되었습니다");
	   
	    	
	    	
	   

	}

}
