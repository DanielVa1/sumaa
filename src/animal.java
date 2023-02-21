public class animal {
    private String Specie;
    private String Name;
    private Integer Age;
    private String disiase;
    private Boolean vaccinated;

    public String getSpecie() {
        return Specie;
    }

    public void setSpecie(String specie) {
        Specie = specie;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getDisiase() {
        return disiase;
    }

    public void setDisiase(String disiase) {
        this.disiase = disiase;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
