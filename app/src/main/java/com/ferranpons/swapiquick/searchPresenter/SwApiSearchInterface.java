package com.ferranpons.swapiquick.searchPresenter;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface SwApiSearchInterface {

	@GET("/root/{id}")
	Observable<RootResponse> getAllData(@Query("id") String id);

	@GET("/people/{id}")
	Observable<PeopleResponse> getPeople(@Query("id") String id);

	@GET("/films/{id}")
	Observable<FilmResponse> getFilms(@Query("id") String id);

	@GET("/starships/{id}")
	Observable<StarShipResponse> getStarships(@Query("id") String id);

	@GET("/vehicles/{id}")
	Observable<VehicleResponse> getVehicles(@Query("id") String id);

	@GET("/species/{id}")
	Observable<SpecieResponse> getSpecies(@Query("id") String id);

	@GET("/planets/{id}")
	Observable<PlanetResponse> getPlanets(@Query("id") String id);

	class RootResponse {
	}

	class PeopleResponse {
		@SerializedName("name")
		String name;

		@SerializedName("birth_year")
		String birthYear;

		@SerializedName("eye_color")
		String eyeColor;

		@SerializedName("gender")
		String gender;

		@SerializedName("hair_color")
		String hairColor;

		@SerializedName("height")
		String height;

		@SerializedName("mass")
		String mass;

		@SerializedName("skin_color")
		String skinColor;

		@SerializedName("homeworld")
		String homeworld;

		@SerializedName("films")
		List<FilmResponse> films;

		@SerializedName("species")
		List<SpecieResponse> species;

		@SerializedName("starships")
		List<StarShipResponse> starships;

		@SerializedName("vehicles")
		List<VehicleResponse> vehicles;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}

	class FilmResponse {
		@SerializedName("title")
		String title;

		@SerializedName("episode_id")
		int episode_id;

		@SerializedName("opening_crawl")
		String opening_crawl;

		@SerializedName("director")
		String director;

		@SerializedName("producer")
		String producer;

		@SerializedName("release_date")
		String release_date;

		@SerializedName("species")
		List<SpecieResponse> species;

		@SerializedName("starships")
		List<StarShipResponse> starships;

		@SerializedName("vehicles")
		List<VehicleResponse> vehicles;

		@SerializedName("characters")
		List<Character> characters;

		@SerializedName("planets")
		List<PlanetResponse> planets;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}

	class StarShipResponse {
		@SerializedName("name")
		String name;

		@SerializedName("model")
		String model;

		@SerializedName("starship_class")
		String starship_class;

		@SerializedName("manufacturer")
		String manufacturer;

		@SerializedName("cost_in_credits")
		String cost_in_credits;

		@SerializedName("length")
		String length;

		@SerializedName("crew")
		String crew;

		@SerializedName("passengers")
		String passengers;

		@SerializedName("max_atmosphering_speed")
		String max_atmosphering_speed;

		@SerializedName("hyperdrive_rating")
		String hyperdrive_rating;

		@SerializedName("MGLT")
		String MGLT;

		@SerializedName("cargo_capacity")
		String cargo_capacity;

		@SerializedName("consumables")
		String consumables;

		@SerializedName("films")
		List<FilmResponse> films;

		@SerializedName("pilots")
		List<PeopleResponse> pilots;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}

	class VehicleResponse {
		@SerializedName("name")
		String name;

		@SerializedName("model")
		String model;

		@SerializedName("vehicle_class")
		String vehicle_class;

		@SerializedName("manufacturer")
		String manufacturer;

		@SerializedName("length")
		String length;

		@SerializedName("cost_in_credits")
		String cost_in_credits;

		@SerializedName("crew")
		String crew;

		@SerializedName("passengers")
		String passengers;

		@SerializedName("max_atmosphering_speed")
		String max_atmosphering_speed;

		@SerializedName("cargo_capacity")
		String cargo_capacity;

		@SerializedName("consumables")
		String consumables;

		@SerializedName("films")
		List<FilmResponse> films;

		@SerializedName("pilots")
		List<PeopleResponse> pilots;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}

	class SpecieResponse {
		@SerializedName("name")
		String name;

		@SerializedName("classification")
		String classification;

		@SerializedName("designation")
		String designation;

		@SerializedName("average_height")
		String average_height;

		@SerializedName("average_lifespan")
		String average_lifespan;

		@SerializedName("eye_colors")
		String eye_colors;

		@SerializedName("hair_colors")
		String hair_colors;

		@SerializedName("skin_colors")
		String skin_colors;

		@SerializedName("Language")
		String language;

		@SerializedName("homeworld")
		String homeworld;

		@SerializedName("people")
		List<PeopleResponse> people;

		@SerializedName("films")
		List<FilmResponse> films;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}

	class PlanetResponse {
		@SerializedName("name")
		String name;

		@SerializedName("diameter")
		String diameter;

		@SerializedName("rotation_period")
		String rotation_period;

		@SerializedName("orbital_period")
		String orbital_period;

		@SerializedName("gravity")
		String gravity;

		@SerializedName("population")
		String population;

		@SerializedName("climate")
		String climate;

		@SerializedName("terrain")
		String terrain;

		@SerializedName("surface_water")
		String surface_water;

		@SerializedName("residents")
		List<PeopleResponse> residents;

		@SerializedName("films")
		List<FilmResponse> films;

		@SerializedName("url")
		String url;

		@SerializedName("created")
		String created;

		@SerializedName("edited")
		String edited;
	}
}
