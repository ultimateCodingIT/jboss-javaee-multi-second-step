package org.jboss.tools.example.service;


import javax.ejb.*;
import javax.persistence.*;

import org.jboss.tools.example.model.Article;

import java.util.*;
@Stateless

public class CatalogSessionBeanFacade {

@PersistenceContext(unitName = "em")

private EntityManager em;



@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)

public List<Article> getAllArticles() {

ArrayList<Article> articles = new ArrayList<Article>();

Query q = em.createNamedQuery("findArticleAll");

for (Object ed : q.getResultList()) {

articles.add((Article) ed);

}

return articles;

}



public void createTestData() {

Article article = new Article();



article.setTitle("nuovo articolo su ultimatecodingblog");

em.persist(article);

}

}

