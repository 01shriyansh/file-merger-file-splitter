import java.io.*;
class FileSplitter
{
	public static void main(String args[])throws IOException
	{
		Console con=System.console(); 
		
		System.out.print("  Enter the file name  :");  
		String name=con.readLine();
		System.out.println();

		System.out.print("  Enter the size of file :");
		int size=Integer.parseInt(con.readLine());
		System.out.println();
		
		FileInputStream fis =new FileInputStream(name);
		
		File f=new File(name);
		int count,ch;
		String str;
		int n=(int)f.length();
		n=(n/size);
		for(int i=0;i<n+1;i++)
		{
			str=(i+1)+"";
			FileOutputStream fos =new FileOutputStream(str+"."+name);
			count=0;
			while(count<=size&&((ch=fis.read())!=-1))
			{
				count++;
				fos.write(ch);
			}
			fos.close();
		}
				
		fis.close();		
			 
		
	}
}