package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Adress {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String auteur;

    //GET
    public Long getId(){
        return id;
    }
    public Date getDateCreation(){
        return  creation;
    }
    public String getContent(){
        return content;
    }
    public String getAuteur(){
        return auteur;
    }

    //SET
    public void setId(Long id){
        this.id = id;
    }
    public void setDateCreation(Date creation){
        this.creation = creation;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

}
