package dataReader;

import java.util.Set;

import person.Person;
import web.SearchType;

public abstract class DataReader
{
	String searchCriteria;
	SearchType searchType;

	public Set<Person> getPerson()
	{
		return null;
	}

	public void setSearchcriteria(String searchCriteria)
	{
		return;
	}

	public void setSearchType(SearchType searchType)
	{
		return;
	}

}
