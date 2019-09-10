import java.io.*;
class FileMerger
{
	public static void main(String args[])throws IOException
	{
		Console con=System.console();
		System.out.print("  Specify the file to be retrived  :");
		String name=con.readLine();
		
		FileOutputStream fos=new FileOutputStream(name);
		
		int ch;
		String str;
		
		for(int i=0;;i++)
		{
			str=(i+1)+"";
			File f =new File(str+"."+name);
			if(!f.exists())
			break;
			FileInputStream fis =new FileInputStream(str+"."+name);
			while((ch=fis.read())!=-1)
			fos.write(ch);
			fis.close();
		}
		fos.close();

	}
}