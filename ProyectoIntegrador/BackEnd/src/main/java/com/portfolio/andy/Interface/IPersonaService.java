
package com.portfolio.andy.Interface;

import com.portfolio.andy.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un obejto pero lo buscamos por ID
    public void deletePersona(long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
