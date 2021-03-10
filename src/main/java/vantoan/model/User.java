package vantoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 30, message = "name must be 2 to 30 character")
    private String name;
    @NotNull
    @Pattern(regexp = "[0-9]{10}", message = "phone must be 10 number")
    private String phone;
    @NotNull
    @Size(min = 2, max = 30, message = "adress must be 2 to 30 character")
    private String address;

    public User() {
    }

    public User(@NotNull @Size(min = 2, max = 30, message = "name must be 2 to 30 character") String name, @NotNull @Pattern(regexp = "[0-9]{10}") String phone, @NotNull @Size(min = 2, max = 30, message = "adress must be 2 to 30 character") String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
