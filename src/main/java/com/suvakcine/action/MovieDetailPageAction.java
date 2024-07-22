package com.suvakcine.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import com.suvakcine.dao.MovieDAO;

public class MovieDetailPageAction implements SubakcineAction {

    @Override
    public String pro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String movieId = request.getParameter("id");
        MovieDAO movieDao = new MovieDAO();
        Map<String, Object> movieDetails = movieDao.getMovieDetails(movieId);
        request.setAttribute("movie", movieDetails);
        return "/WEB-INF/views/movieDetailPage.jsp";
    }
}
