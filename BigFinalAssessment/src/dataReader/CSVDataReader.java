package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import person.Person;

public class CSVDataReader extends DataReader
{
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader()
	{
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader("\\Documentation\\persons.csv"));
		}
		catch (FileNotFoundException e2)
		{
			e2.printStackTrace();
		}

		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Person> personList = new ArrayList<>();

		try
		{
			while ((line = reader.readLine()) != null)
			{
				Person per = new Person();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext())
				{
					String data = scanner.next();
					if (index == 0)
						per.setName((data));
					else if (index == 1)
						per.setEmail(data);
					else if (index == 2)
						System.out.println(data);
				}
				index = 0;
				personList.add(per);
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}

		try
		{
			reader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException
	{
		new CSVDataReader();
	}

}

