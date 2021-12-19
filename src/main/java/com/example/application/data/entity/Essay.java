package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import javax.persistence.Entity;

@Entity
public class Essay extends AbstractEntity {

    private String title;
    private String prompt;
    private String fullEssay;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPrompt() {
        return prompt;
    }
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public String getFullEssay() {
        return fullEssay;
    }
    public void setFullEssay(String fullEssay) {
        this.fullEssay = fullEssay;
    }

}
