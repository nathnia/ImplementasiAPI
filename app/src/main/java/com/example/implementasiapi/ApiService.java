package com.example.implementasiapi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeams(@Query("l") String league);

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsBySportAndCountry(@Query("s") String sport, @Query("c") String country);

}
