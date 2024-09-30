package FreqventlyAsked_Qa_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndRightInTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("D:\\Kalyan_Devops\\Documents\\jenkins.txt");
		BufferedReader brr=new BufferedReader(fr);
		String str;
		while((str=brr.readLine()) !=null)
		{
			System.out.println(str);
		}
		brr.close();
		
		
		//Wrighting Into File
		
		FileWriter fwr=new FileWriter("D:\\Kalyan_Devops\\Documents\\jenkins.txt");
		BufferedWriter brw=new BufferedWriter(fwr);
		brw.write("Hello Kalyan From FileReader ");
		brw.write("Hello Kalyan From FileReader ");
		brw.write("Hello Kalyan From FileReader ");
		brw.write("Hello Kalyan From FileReader ");
		
		

	}

}
