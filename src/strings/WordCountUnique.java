package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordCountUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String sentence="Hi myself Sumeet kumar. Sumeet is a technocrat with strong knowledge and experience in Automation testing. Automation is highly recommended skillset in QA field";
		String words[]=sentence.split(" ");
		Set<String> word= new LinkedHashSet();
		for(String s:words)
		{
			word.add(s.replace(".", "").toString());
		}
		System.out.println("**** UNIQUE Words *****");
		System.out.println(word.toString());
//		for(Object newWord:word.toArray())
//		{
//			System.out.println(newWord.toString());
//		}
		System.out.println(" *** Count of words: "+word.size());
	}

}
