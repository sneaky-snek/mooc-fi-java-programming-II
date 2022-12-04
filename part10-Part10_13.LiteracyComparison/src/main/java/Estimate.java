
public class Estimate implements Comparable{

    /* theme, age group, gender, country, year, literacy
     percent */
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double percent;

    public Estimate(String theme, String ageGroup, String gender, String country, int year, double literacyPercent){
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = literacyPercent;
    }

    /* TESTING, should receive an array, and construct the object from it.
    parts[0]    parts[1]    parts[2]    parts[3]    parts[4]    parts[5]
    theme       ageGroup    gender      country     year        percent */
    public Estimate(String[] parts){
        parts[2] = parts[2].replaceAll("[(%)]", "");
       this.theme = parts[0].trim();
       this.ageGroup = parts[1].trim();
       this.gender = parts[2].trim();
       this.country = parts[3].trim();
       this.year = Integer.valueOf(parts[4].trim());
       this.percent = Double.valueOf(parts[5].trim());
    }


    @Override
    /* Adult literacy rate, population 15+ years, female (%),Niger,2015,11.01572 ---> Niger (2015), female, 11.01572 */
    public String toString(){
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }

    public Double getPercent(){
        return percent;
    }


    @Override
    public int compareTo(Object o) {
        Estimate obj = (Estimate) o;
        return this.compareTo(obj);
    }

    public int compareTo(Estimate compared){
        return this.getPercent().compareTo(compared.getPercent());
    }
}
