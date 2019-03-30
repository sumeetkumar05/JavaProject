package dateTime;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class GetElapsedTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date();
//		long startTime=d.getTime();
		Instant startTime=Instant.now();
		System.out.println("StartTime:"+startTime);
		File file=new File("C:\\Java Test");
		SimpleDateFormat form= new SimpleDateFormat("MM_dd_YYYY");
		SimpleDateFormat form1= new SimpleDateFormat("hh_mm_ss");
		
		if(file.exists())
		{
			new File("C:\\Java Test"+"\\"+form.format(d)).mkdir();
			new File("C:\\Java Test"+"\\"+form.format(d)+"\\"+form1.format(d)).mkdir();
		}
		else
			System.out.println("File path not exist: "+ file.getPath());
		
		for(int i=0;i<=500;i++)
			System.out.print(i+"\t");
		Date d1= new Date();
//		long endTime=d1.getTime();
		
		Instant endTime=Instant.now();
		System.out.println();
		System.out.println("EndTime:"+endTime);
		Duration timeElapsed=Duration.between(startTime, endTime);
		System.out.println("Total elapsed time: "+ timeElapsed.toMillis()+"ms");

	}

}
