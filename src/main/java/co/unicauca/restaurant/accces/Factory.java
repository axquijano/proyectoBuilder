/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.accces;

/**
 *
 * @authores Ana Ximena Quijano y Nathalia Ruiz Meneses
 */
public class Factory 
{
    public IProductRepository getRepository(String dishType)
    {
        IProductRepository objDishRepository = null;
        if("Oriental".equals(dishType))
        {
            objDishRepository = (IProductRepository) new OrientalRepositoryImplArrays();
        }
        else if("Italian".equals(dishType))
        {
            objDishRepository = (IProductRepository) new ItalianRepositoryImplArrays();
        }
        return objDishRepository;
    }
  
    
}
