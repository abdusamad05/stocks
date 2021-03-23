package com.folivora.stocks.domain;


import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String product;
    @Temporal(TemporalType.DATE)

    private Date addDate;
    private Long price;

    public Products() {
    }

    public Products(String product, Date addDate, Long price) {
        this.product = product;

        this.addDate = addDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


}
