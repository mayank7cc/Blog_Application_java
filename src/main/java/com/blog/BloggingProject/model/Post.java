package com.blog.BloggingProject.model;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="Title")
    private String title;
    @Column(name="Content")
    private String content;
    @Column(name="Author")
    private String Author;

    public Post() {
    }

    public Post(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        Author = author;
    }

    public int getId()
    {return id;}
    public void setId(int id)
    {this.id = id;}
    public String getTitle()
    {return title;}
    public void setTitle(String title)
    {this.title = title;}
    public String getContent()
    {return content;}
    public void setContent(String content)
    {this.content = content;}
    public String getAuthor()
    {return Author;}
    public void setAuthor(String author)
    {this.Author = author;}

}
