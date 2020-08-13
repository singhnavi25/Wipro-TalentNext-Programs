package ioStreams.practices;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterExample // Same for PipedReader
{
	public static void main(String[] args) throws IOException 
	{
		final PipedReader read = new PipedReader();
		final PipedWriter write = new PipedWriter(read);

		Thread readerThread = new Thread(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					int data = read.read();
					while (data != -1) 
					{
						System.out.print((char) data);
						data = read.read();
					}
				} 
				catch (Exception ex) 
				{}
			}
		});

		Thread writerThread = new Thread(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					write.write("I love my country\n".toCharArray());
				} 
				catch (Exception ex) 
				{}
			}
		});

		readerThread.start();
		writerThread.start();
	}
}
