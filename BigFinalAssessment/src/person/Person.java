package person;

import java.util.List;

public class Person
{
	String name;
	String email;
	List<Skill> skillset;

	public Person(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public Person()
	{
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List getSkills()
	{
		return skillset;
	}

	public void setSkill(List skillset)
	{
		this.skillset = skillset;
	}

	// public void addSkill(Skill)
	// {
	//
	// }

}