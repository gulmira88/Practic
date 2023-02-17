import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String  LocatedCountry;
    private LocalDate founddationyear;

    public EducationCenter(String name, String locatedCountry, LocalDate founddationyear) {
        this.name = name;
        LocatedCountry = locatedCountry;
        this.founddationyear = founddationyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return LocatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        LocatedCountry = locatedCountry;
    }

    public LocalDate getFounddationyear() {
        return founddationyear;
    }

    public void setFounddationyear(LocalDate founddationyear) {
        this.founddationyear = founddationyear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", LocatedCountry='" + LocatedCountry + '\'' +
                ", founddationyear=" + founddationyear +
                '}';
    }
}





