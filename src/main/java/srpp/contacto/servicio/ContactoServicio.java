package srpp.contacto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srpp.contacto.modelo.Contacto;
import srpp.contacto.repositorio.IContactoRepositorio;

/**
 *
 * @author srpp
 */
@Service
public class ContactoServicio implements IContactoServicio{
    @Autowired
    private IContactoRepositorio contactoRepositorio;
    @Override
    public List<Contacto> listarContacto() {
        return contactoRepositorio.findAll();
    }
    
    @Override
    public Contacto buscarContactoId(Integer idContacto) {
       return contactoRepositorio.findById(idContacto).orElse(null);
    }

    @Override
    public void guardarContacto(Contacto contacto) {
       contactoRepositorio.save(contacto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepositorio.delete(contacto);
    }
    
}
