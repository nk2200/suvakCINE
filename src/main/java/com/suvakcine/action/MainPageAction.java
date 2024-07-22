package com.suvakcine.action;

import com.suvakcine.dao.MovieDAO;
import com.suvakcine.dao.TVShowDAO;
import com.suvakcine.dao.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MainPageAction implements SubakcineAction {

    @Override
    public String pro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MovieDAO movieDao = new MovieDAO();
        List<Map<String, Object>> popularMovies = movieDao.getPopularMovies();

        TVShowDAO tvShowDao = new TVShowDAO();
        List<Map<String, Object>> popularTVShows = tvShowDao.getPopularTVShows();

        PersonDAO personDao = new PersonDAO();
        List<Map<String, Object>> popularPeople = personDao.getPopularPeople();

        request.setAttribute("popularMovies", popularMovies);
        request.setAttribute("popularTVShows", popularTVShows);
        request.setAttribute("popularPeople", popularPeople);

        return "/WEB-INF/views/mainPage.jsp";
    }
}
