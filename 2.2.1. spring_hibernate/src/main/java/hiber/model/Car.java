package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @OneToOne
    private User user;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public Car(String model, int series) {
        this();
        this.model = model;
        this.series = series;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", series = " + series +
                '}';
    }
}