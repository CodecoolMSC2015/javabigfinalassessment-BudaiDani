package person;

public class Employee extends Person
{
	int salary;
	String jobTitle;

	public Employee(String name, String email, int salary, String jobTitle)
	{
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public Employee(String name, String email)
	{

	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString()
	{
		return "Name: " + getName() + "\nSalary:" + getSalary() + "\nJob Title: " + getJobTitle() + "\nEmail:"
				+ getEmail();
	}

}
