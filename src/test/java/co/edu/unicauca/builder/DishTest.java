package co.edu.unicauca.builder;


import co.unicauca.restaurant.dishApp.*;
import co.unicauca.restaurant.domain.*;
import co.unicauca.restaurant.services.*;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test; 



/**
*
* @authores Ana Ximena Quijano y Nathalia Ruiz Meneses
*/
public class DishTest {

    public DishTest() {
    }
    
     /**
     * Test para el plato Oriental 
     * @throws java.text.ParseException
     */
    @Test
    public void Oriental()throws ParseException
    {
        System.out.println("Oriental Dish");
        //Elementos del plato
        OrientalDish platoOriental;
        platoOriental = new OrientalDish(0.0);
        platoOriental.setBase(new Product(1, "Shop Suey", 5000d));
        platoOriental.addOption(new Product(4, "Pollo Agridulce", 5800d));
        platoOriental.setSize(Size.FAMILY);
        
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        orientalBuilder.setDish(platoOriental);
       
        DishDirector director = new DishDirector(orientalBuilder);
        //director.create();
        Dish dish = director.getDish();
        assertEquals(32400, dish.getPrice());     
   }
   
   /**
     * Test para el plato Italian
     * @throws java.text.ParseException
     */
    @Test
    public void Italian()throws ParseException
    {
        System.out.println("Oriental Dish");
        //Elementos del palto
        ItalianDish platoItalian;
        platoItalian = new ItalianDish(0.0);
        platoItalian.setBase(new Product(2, "Carpaccio", 6000d));
        platoItalian.addOption(new Product(5, "Albondigas a la italiana", 6500d));
        platoItalian.addOption(new Product(6, "Pollo picante cacciatore", 7000d));
        platoItalian.setSize(Size.PERSONAL);
        DishBuilder ItalianBuilder = new ItalianDishBuilder();
        ItalianBuilder.setDish(platoItalian);
       
        DishDirector director = new DishDirector(ItalianBuilder);
        
        Dish dish = director.getDish();
        assertEquals(19500, dish.getPrice());    
        
        //Cambiano el tamaño 
        platoItalian.setSize(Size.DOUBLE);
        ItalianBuilder.setDish(platoItalian);
        dish = director.getDish();
        assertEquals(35100, dish.getPrice());
        
        
   }
}
