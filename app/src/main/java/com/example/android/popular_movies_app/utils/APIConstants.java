package com.example.android.popular_movies_app.utils;

/**
 * APIConstants.java
 * Purpose: Store all the constants used in the project related to THE MOVIE DB API
 *
 * @author Harshita Kasera
 */
public final class APIConstants {
    public static final String BASE_URL = "http://api.themoviedb.org/";
    public static final String APP_KEY_QUERY_PARAM = "api_key";
    public static final String SORT_POPULARITY = "popularity.desc";
    public static final String SORT_RATING = "vote_average.desc";
    public static final String SORT_FAV = "favourites";
    public final static String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/";
    public final static String IMAGE_SMALL_SIZE = "w185";
    public final static String RATING_MAX = "10";
    public final static int MAX_CHAR_DISPLAY = 120;
    public final static String YOUTUBE_PREFIX = "vnd.youtube:";
}
