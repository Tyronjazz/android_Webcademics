package com.example.dictionary.Models;

import java.util.List;

public class Definitions {
    String explanation = "";
    String example = "";
    List<String> synonyms = null;
    List<String> antonyms = null;

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }

    public String getDefinition() {
        return explanation;
    }

    public void setDefinition(String definition) {
        this.explanation = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
