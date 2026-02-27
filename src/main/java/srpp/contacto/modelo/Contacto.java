package srpp.contacto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author srpp
 */
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idContacto;
    private String nombreContacto;
    private String celular;
    private String email;
}
