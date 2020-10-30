
package co.unicauca.restaurant.dishApp;

import co.unicauca.restaurant.services.DishDirector;
import co.unicauca.restaurant.domain.Dish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *@authores Ana Ximena Quijano y Nathalia Ruiz Meneses
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        DishDirector director;
        int opc=0;
        do{
            System.out.println("------------------------------------ ");
            System.out.println("               OPCIONES              ");
            System.out.println("------------------------------------ ");
            System.out.println("    1. Menu Oriental ");
            System.out.println("    2. Menu Italiano ");
            System.out.println("    3. Salir ");
            System.out.println("------------------------------------ ");
            System.out.println("");
            System.out.println("Escoga el menu de preferencia: ");
            opc=Integer.parseInt(num.readLine());
            switch(opc)
            {
                case 1:
                    director = new DishDirector(new OrientalDishBuilder());
                    director.create();
                    Dish myDish = director.getDish();
                    myDish.getPrice();
                    System.out.println("El plato le cuesta: "+ myDish.getPrice());
                    break;
                case 2:
                    director = new DishDirector(new ItalianDishBuilder());
                    director.create();
                    Dish objDish = director.getDish();
                    System.out.println("El plato le cuesta: "+ objDish.getPrice());
                    break;
            }
                       
        }
        while (opc != 3);
  } 
}
