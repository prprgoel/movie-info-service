package io.codezone.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Normalized;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieList {

    List<Movie> movies;
}
