package Season;

public enum Month {
    JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING), APRIL(30,Seasons.SPRING), MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.FALL), OCTOBER( 31, Seasons.FALL), NOVEMBER(30, Seasons.FALL),
    DECEMBER(31, Seasons.WINTER);

    private static int Season;
    private int days;

    public static int getSeason() {
        return Season;
    }

    private Seasons seasons;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }

    Month(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }
}
