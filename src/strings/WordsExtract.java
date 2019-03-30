package strings;

public class WordsExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="Hi myself Sumeet kumar. I am a technocrat sumeet.kumar with 8+ years of experience in Automation testing. Automation is highly recommended skillset in QA field";
		String words[]=sentence.split(" ");
		System.out.println(sentence);
		System.out.println("****** Words in sentence are ******");
		for(String s:words)
		{
			if (s.endsWith("."))
				s=s.replace(".", "");
			System.out.println(s.toString());
		}

	}

}
