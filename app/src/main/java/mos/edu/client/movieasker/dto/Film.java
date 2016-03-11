package mos.edu.client.movieasker.dto;

public class Film {

    private int idFilm;
    private String posterUrl;
    private String alternativeName;
    private String originalName;
    private int year;
    private String description;
    private byte duration;
    private String slogan;
    private long budget;
    private long worldFees;

    protected Film() {}

    public Film(String alternativeName, int year) {
        this.alternativeName = alternativeName;
        this.year = year;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getDuration() {
        return duration;
    }

    public void setDuration(byte duration) {
        this.duration = duration;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public long getWorldFees() {
        return worldFees;
    }

    public void setWorldFees(long worldFees) {
        this.worldFees = worldFees;
    }

}
