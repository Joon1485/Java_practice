// MyDate(class)
public class MyDate 	// 이 프로그램의 핵심은 하나의 공통상위클래스인 Event클래스 타입의 배열 하나로 여러가지 객체들을 묶을 수 있음.
{	
	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d)
	{
		year = y;
		month = m;
		day = d;
	}

	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
}

--------------------------------------

	// Event(class)
public class Event 
{
	public String title;

	public Event(String title)
	{
		this.title = title;
	}
}

--------------------------------------

	// DeadlineEvent(class)
public class DeadlineEvent extends Event
{
	//public String title;	Event에서 상속받음
	public MyDate deadline;
	
	public DeadlineEvent(String title, MyDate date)
	{
		super(title);
		this.deadline = date;
	}

	public String toString()
	{ 
		return title + ", " + deadline.toString();
	}
}

--------------------------------------

	// DurationEvent(class)
public class DurationEvent extends Event 
{
	//public String title;	Event에서 상속받음
	public MyDate begin;
	public MyDate date;

	public DurationEvent(String title, MyDate begin, MyDate e)
	{
		super(title);
		this.begin = begin;
		date = e;
	}
}

--------------------------------------

	// OneDayEvent(class)
public class OneDayEvent extends Event
{
	//public String title;	Event에서 상속받음
	public MyDate date;
	
	public OneDayEvent(String title, MyDate date)
	{
		super(title);
		this.date = date;
	}

	public String toString()
	{ 
		return title + ", " + date.toString();
	}
}

--------------------------------------

	// Scheduler(class(main))
import java.util.Scanner;

public class Scheduler
{
	private int capacity = 10;
	public Event[] events = new Event[capacity];
