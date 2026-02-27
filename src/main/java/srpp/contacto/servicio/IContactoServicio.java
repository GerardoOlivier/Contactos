package srpp.contacto.servicio;

import java.util.List;
import srpp.contacto.modelo.Contacto;

/**
 *
 * @author srpp
 */
public interface IContactoServicio {
    
    public List<Contacto> listarContacto();
    public Contacto buscarContactoId(Integer idContacto);
    public void guardarContacto(Contacto contacto);
    public void eliminarContacto(Contacto contacto);
}
