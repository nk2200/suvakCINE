package com.suvakcine.dao;

import com.suvakcine.db.TmdbApiClient;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MovieDAO {
    private TmdbApiClient apiClient = new TmdbApiClient();
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Map<String, Object>> getPopularMovies() throws IOException {
        String jsonResponse = apiClient.getPopularMovies();
        Map<String, Object> result = objectMapper.readValue(jsonResponse, Map.class);
        return (List<Map<String, Object>>) result.get("results");
    }

    public Map<String, Object> getMovieDetails(String movieId) throws IOException {
        String jsonResponse = apiClient.getMovieDetails(movieId);
        return objectMapper.readValue(jsonResponse, Map.class);
    }
}