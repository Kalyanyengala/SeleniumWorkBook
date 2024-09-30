package FreqventlyAsked_Qa_Java;

public class Remove_Junk_String {

	public static void main(String[] args) {
		
		String s="73829199*^%$#^^&^ @linear expreaa";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
