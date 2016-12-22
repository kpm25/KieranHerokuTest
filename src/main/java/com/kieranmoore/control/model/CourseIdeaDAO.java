package com.kieranmoore.control.model;

import java.util.List;

/**
 * Created by Kieran on 12/14/2016.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);


}
