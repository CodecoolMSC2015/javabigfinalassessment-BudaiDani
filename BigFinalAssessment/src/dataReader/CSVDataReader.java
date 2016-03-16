package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import person.Person;

public class CSVDataReader extends DataReader
{
	static String csvFilePath = ".\\Documentation\\persons.csv";
	public static void main(String[] args)
	{

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
			String line = null;
			try
			{
				line = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			String[] row = line.split(" ");

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public Set<Person> getPersons()
	{
		return null;

	}
}
