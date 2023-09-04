package OOPs;

import java.util.Arrays;

public class Practice_6 {
    public static void main(String[] args) {

    Movie m1 = new Movie("KGF", "Raja Mauli", "3 statr");
    Movie m2 = new Movie("RRR", "Raja Mauli", "2 statr");
    Movie m3 = new Movie("3 Idiots", "RajKumar", "4 statr");
    Movie m4 = new Movie("Asur", "Raja Mauli");
    Movie m5 = new Movie("3 Idiot", "RajKumar");


        Movie[] movies = {m1,m2,m3,m4,m5};
        Movie[] arr = Movie.get5StarMovies(movies);
        for(Movie i: arr){
            if(i==null) {
                return;
            }
            System.out.println(i.title);
        }

    }
}


class Movie{
    public String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 Star";

    }

    public static Movie[] get5StarMovies(Movie[] movies){
        Movie[] ans = new Movie[movies.length];
        int temp = 0;
        for(Movie i : movies){
            if(i.rating.equals("5 Star")){
                ans[temp++] = i;
            }
        }
        return ans;
    }
}