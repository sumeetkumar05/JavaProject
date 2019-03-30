package dateTime;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddFolder_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Java Test");
		Date d= new Date();
		SimpleDateFormat form= new SimpleDateFormat("MM_dd_YYYY");
		SimpleDateFormat form1= new SimpleDateFormat("hh_mm_ss");
		
		if(file.exists())
		{
			new File("C:\\Java Test"+"\\"+form.format(d)).mkdir();
			new File("C:\\Java Test"+"\\"+form.format(d)+"\\"+form1.format(d)).mkdir();
		}
		else
			System.out.println("File path not exist: "+ file.getPath());
	}
}