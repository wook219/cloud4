package ex.Q5;

import java.util.List;
import java.util.stream.Collectors;

public class MovieAnalyzer {

    public static double calculateAverageRating(List<Movie> movies) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        double avg = movies.stream()
                .flatMap(movie -> movie.getReviews().stream())
                .mapToInt(Review::getRating)
                .average()
                .orElse(Double.NaN);

        return avg;
    }

    public static List<Movie> findMoviesWithRatingAbove(List<Movie> movies, int rating) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        return movies.stream()
                .filter(movie -> movie.getReviews().stream()
                        .mapToInt(Review::getRating)
                        .average()
                        .orElse(-1) >= rating)
                .collect(Collectors.toList());
    }
}
