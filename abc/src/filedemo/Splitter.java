package filedemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//code for file splitting
class Splitter
{
	public static void main(String[] args) throws IOException
	{
		takeInput(args);
	}

	static void takeInput(String[] args) throws IOException
	{
		String str;
		//String assembledFileName;
		int splitLength;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		try
		{
			if(args.length==0)
			{
				System.out.println("Enter the filename:");
				str=br.readLine();
				//System.out.println("Enter the name of the file after assembling(without extension):");
				//assembledFileName=br.readLine();
				System.out.println("Enter the split size:");
				splitLength=Integer.parseInt(br.readLine());


				SplitFiles ob1=new SplitFiles(str,splitLength);

				/*
				 * SplitListOnly ob2=new SplitListOnly(str,assembledFileName);
				 * ob2.batchFileMaker();
				 */
			}
			else if(args.length>1)
			{
				System.out.println("Invalid arguments.");
				System.exit(1);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Problem in number format...");
			e.printStackTrace();
		}
	}
}