
package co.unicauca.restaurant.services;

import co.unicauca.restaurant.accces.IProductRepository;
import co.unicauca.restaurant.domain.Dish;

/**
 *
 * @authores Ana Ximena Quijano y Nathalia Ruiz Meneses
 */
public abstract class DishBuilder {
    
    protected Dish myDish;
    protected IProductRepository myRepository;
    
    public Dish getDish() {
        return myDish;
    }
    
    public void setDish(Dish dish) {
        this.myDish = dish;
    }
    
    public abstract DishBuilder init();

    public abstract DishBuilder setCore();

    public abstract boolean addPart();

    public abstract DishBuilder setSize();
    
}
