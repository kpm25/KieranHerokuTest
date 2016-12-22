package com.kieranmoore.control.model;

import com.github.slugify.Slugify;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kieran on 12/14/2016.
 */
public class CourseIdea {
    private String slug;
    private String title;
    private String creator;
    private Set<String> voters;

    public CourseIdea(String title, String creator) {
        voters = new HashSet<>();
        this.title = title;
        this.creator = creator;

           Slugify slugify = new Slugify();
           slug = slugify.slugify(title);

    }



    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public boolean addVoter(String voterUserName){
        return voters.add(voterUserName);
    }
    public int getVoteCount(){
        return voters.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseIdea that = (CourseIdea) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return creator != null ? creator.equals(that.creator) : that.creator == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        return result;
    }


    public String getSlug() {
        return slug;
    }




    public List<String> getVoters(){
        return new ArrayList<>(voters);
    }
}