package org.jboss.tools.example.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity

@Table(name = "ARTICLE", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))

@NamedQueries({ @NamedQuery(name = "findArticleAll", query = "SELECT a FROM Article a"), @NamedQuery(name = "findArticleByTitle", query = "SELECT a from Article a WHERE a.title = :title") })



public class Article implements Serializable {

private static final long serialVersionUID = 1L;

private int id;

private String title;
public Article() { }
@Id @Column(name = "ID", nullable = false)

@GeneratedValue(strategy = GenerationType.AUTO)

public int getId() {

return this.id;

}
public void setId(int id) {

this.id = id;

}
public String getTitle() {

return this.title;

}
public void setTitle(String title) {

this.title = title;

}
}