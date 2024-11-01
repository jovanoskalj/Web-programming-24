package mk.ukim.finki.aud.model;

import lombok.Data;

@Data
public class Manufacturer {
    private Long id;
    private String name;
    private  String address;

    public Manufacturer(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = (long) (Math.random() * 1000);
    }
}
