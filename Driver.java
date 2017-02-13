import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Driver {
	public static void main(String args[]) throws IOException
	{
		Scanner input = null;
		FileWriter f =null;
	    try {

	    	input = new Scanner(new File(args[0]));
	    	f = new FileWriter(new File(args[1]));
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	        System.exit(0);
	    }
	    
	    student[] studentArray=new student[12];
	    int i=0;
	    while (input.hasNextLine()) 
	    {	    
	    	studentArray[i]=new student();
	    	Scanner Line = new Scanner(input.nextLine());	       
	     	       	    	
	    			String s1 = Line.next();
	    			String a = Line.next();	    		
	    			String b = Line.next();	    		    	
	    			String c = Line.next();
	    			String d = Line.next();
	            studentArray[i].set_student(s1, Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c), Integer.parseInt(d));

	        	i++;   
	    }
	    bruteforce[] logicArray=new bruteforce[12];
	    limiter limit= new limiter();
	    for(int j=0;j<12;j++)
	    {
	    	logicArray[j]=new bruteforce();
	    	logicArray[j].assign1(j, studentArray[j],limit);

	    }
	    for(int j=0;j<12;j++)
	    {
	    	logicArray[j].assign2(j, studentArray[j], limit);
	    }
	    double avg=0.0;
	    for(int j=0;j<12;j++)
	    {
	    	logicArray[j].assign3(j, studentArray[j], limit);
	    	
	    	logicArray[j].assign_sum(j, studentArray[j], limit);
	  
	    	f.write(logicArray[j].get_studentName()+" "+logicArray[j].get_sub1()+" "+logicArray[j].get_sub2()+" "+logicArray[j].get_sub3()+" "+logicArray[j].get_sum()+"\n");
	    	avg=avg+logicArray[j].get_sum();
	    }
	    avg=avg/12.0;
	    DecimalFormat df = new DecimalFormat("#.#");
	    f.write("\nAverage preference_score is:"+df.format(avg));
	    f.close();
	   }
	
}
