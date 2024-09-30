package FreqventlyAsked_Qa_Java;

public class CountCharecters_Occurence {

	public static void main(String[] args) {
		String s="This Is Java Programe ";
		int totalcount=s.length();
		int afterreplacecount=s.replace("a","").length();
		int finalcount=totalcount-afterreplacecount;
		System.out.println(finalcount);
		

	}

}
