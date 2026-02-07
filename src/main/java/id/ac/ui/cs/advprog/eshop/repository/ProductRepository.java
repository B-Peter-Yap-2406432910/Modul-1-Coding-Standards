package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    private HashMap<String,Product> productHashMap = new HashMap<>();
    private int idCounter = 0;

    public Product create(Product product){
        product.setProductID(Integer.toString(idCounter));
        productData.add(product);
        productHashMap.put(product.getProductID(), product);
        idCounter++;
        return product;
    }

    public Iterator<Product> findAll(){
        return productData.iterator();
    }

    public Product findProduct(String productID){
        return productHashMap.get(productID);
    }

    public Product delete(Product product){
        productData.remove(product);
        productHashMap.remove(product.getProductID());
        return product;
    }
}
