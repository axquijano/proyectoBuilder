package co.unicauca.restaurant.services;

import co.unicauca.restaurant.domain.Dish;


/**
 *
 * @authores Ana Ximena Quijano y Nathalia Ruiz Meneses
 * 
 */ 

public class DishDirector {
  
  private DishBuilder builder;

  public DishDirector(DishBuilder builder) {
    this.builder = builder;
  }

  public Dish getDish() {
    return builder.getDish();
  }

  public void create() {
    boolean masPartes = true;
    builder.init();
    builder.setCore();
    while(masPartes){
        masPartes = builder.addPart();
    }
    builder.setSize();
}
}
