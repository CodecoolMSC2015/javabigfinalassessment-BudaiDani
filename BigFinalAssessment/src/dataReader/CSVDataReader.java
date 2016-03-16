package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import person.Person;

public class CSVDataReader extends DataReader
{
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader()
	{
		csvFilePath = ".\\Documentation\\persons.csv";
		BufferedReader br = null;
		String line = "";
		String splitBy = ",";

		try
		{
			br = new BufferedReader(new FileReader(csvFilePath));
			while ((line = br.readLine()) != null)
			{
				String[] csvLine = line.split(splitBy);

				System.out.println(csvLine[0] + "\t" + csvLine[1] + "\t" + csvLine[2]);
			}
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		new CSVDataReader();
	}
}
