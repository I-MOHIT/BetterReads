package com.mohit.betterreads.search;

import java.util.List;

public class SearchResult {
    private int numFound;
    private List<SearchResultBook> docs;
    
    public int getNumFound(){
        return numFound;
    }

    public void setNumFound(int numFound){
        this.numFound = numFound;
    }

    

    /**
     * @return List<SearchResultBook> return the docs
     */
    public List<SearchResultBook> getDocs() {
        return docs;
    }

    /**
     * @param docs the docs to set
     */
    public void setDocs(List<SearchResultBook> docs) {
        this.docs = docs;
    }

}
