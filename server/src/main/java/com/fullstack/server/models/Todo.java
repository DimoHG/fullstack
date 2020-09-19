package com.fullstack.server.models;



import javax.persistence.*;


@Entity
public class Todo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Title")
	private String title;
	@Column(name = "Action")
	private String action;

	public Todo()
	{
	}

	public Todo(String title, String action)
	{
		this.title = title;
		this.action = action;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
