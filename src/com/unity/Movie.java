package com.unity;

public class Movie {

    private String title;
    private int likes;
    private int price;
    private Gener gener;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public Movie(String title, int likes, int price) {
        this.title = title;
        this.likes = likes;
        this.price = price;
    }

    public Movie(String title, int likes, int price, Gener gener) {
        this.title = title;
        this.likes = likes;
        this.price = price;
        this.gener = gener;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes() {
        this.likes = likes;
    }

    public int getPrice() {
        return price;
    }

    public Gener getGener() {
        return gener;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                ", price=" + price +
                ", gener=" + gener +
                '}';
    }
}

