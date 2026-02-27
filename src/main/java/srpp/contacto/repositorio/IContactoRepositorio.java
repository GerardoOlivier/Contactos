
package srpp.contacto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import srpp.contacto.modelo.Contacto;

/**
 *
 * @author srpp
 */
public interface IContactoRepositorio extends JpaRepository<Contacto,Integer>{
    
}
