/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.accces;

import co.unicauca.restaurant.domain.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authores Ana Ximena Quijano y Nathalia Ruiz Meneses
 */
public class ItalianRepositoryImplArrays implements IProductRepository
{
    public static List<Product> products;
    
    public ItalianRepositoryImplArrays()
    {
         products = new ArrayList<>();
        initialize();
    }
     private void initialize()
     {
        products.add(new Product(1, "Arancini", 5500d));
        products.add(new Product(2, "Carpaccio", 6000d));
        products.add(new Product(3, "Espagueti a la puttanesca", 3800d));
        products.add(new Product(4, "Gambas", 4600d));
        products.add(new Product(5, "Albondigas a la italiana", 6500d));
        products.add(new Product(6, "Pollo picante cacciatore", 7000d));
    }
     
    @Override
    public List<Product> findAll() 
    {
        return products;
    }

    @Override
    public Product findById(Integer id) 
    {
        for(Product prod:products){
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    @Override
    public boolean create(Product newProduct)
    {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) 
        {
                //Ya existe
                return false;
        }
        products.add(newProduct);
        return true;
    }

    @Override
    public boolean update(Product newProduct) 
    {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) 
        {
            prod.setName(newProduct.getName());
            prod.setPrice(newProduct.getPrice());
        return true;
        }
    return false;
    }

    @Override
    public boolean delete(Integer id) 
    {
        for (Product prod : products)
        {
                if (prod.getId() == id) 
                {
                    products.remove(prod);
                    return true;
                }
        }
        return false;
    }
}
