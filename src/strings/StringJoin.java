package strings;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] firstname={"Sumeet","Sandeep","Abhinav","Abdul","Aryabhatt","Ramanujan"};
		String[] lastname={"Kumar","Maheshwari","Bindra","Kalam","Mathematician","Great"};
//		StringBuffer name = null;
		for(int i=0;i<firstname.length;i++)
		{
//			name=new StringBuffer(firstname[i]+lastname[i]+"\t");
			System.out.println(firstname[i]+" " +lastname[i]+"\t");			
		}
//		System.out.println(name.toString());
	}

}
