package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. 1���� �Է��� ������ ���ϱ�");
	    	System.out.println("2. �ִ밪/�ּҰ����ϱ�");
	    	System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
	    	System.out.println("4. ���ϴ� ������ ����ϱ� ");
	    	System.out.println("5. ¦����/Ȧ���� ����ϱ�");
	    	System.out.println("6. �����ϱ�");
	    	System.out.println("���ϴ� �޴���>>");
	    	number=s.nextInt();
	    	
	    		if(number==1)
	    			new SumOfNumbers().input();
	    		
	    		else if(number==2)
	    			new MaxAndMin().input();
	    		
	    		else if(number==3)
	    			new SumAndAvg().input();
	    		
	    		else if(number==4)
	    			new GuGuDan().input();
	    		
	    		else if(number==5)
	    			new GuGuDan2().input();
	    		
	    	
	    }
	    while(number==6); 
	    System.out.print("����Ǿ����ϴ�");
	   
	    	
	    	
	   

	}

}
