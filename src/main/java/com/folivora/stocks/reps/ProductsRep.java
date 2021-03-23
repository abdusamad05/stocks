package com.folivora.stocks.reps;

import com.folivora.stocks.domain.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRep extends CrudRepository<Products, Long> {

    List<Products> findByProductLike(String product);

}
