package yesithv.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "persona")
@Data
public class PersonaEntity {

    @Id
    private Integer idpersona;

    private Boolean activo;
    private Integer fktipodocumento;
    private Integer numerodocumento;
    private String nombresapellidos;
    private LocalDate fechanacimiento;
    private Integer fkgenero;
    private Boolean listanegra; // not use anymore
    private String telefonoprincipal;
    private String telefonoalterno;
    private Integer fkciudadresidencia;
    private Boolean contactotelefono; // not use anymore
    private Boolean contactomensajes; // not use anymore
    private Boolean contactoemail; // not use anymore
    private LocalDateTime fecharegistroasistente;
    private String password;
    private Boolean cambiopassword;
    private Boolean paciente;
    private Integer fktipopaciente;
    private Boolean asistente;
    private Boolean especialista;
    private Integer fktipoespecialista;
    private String registromedico;
    private Boolean administrador;
    private Integer fkpuntoatencion; // not use anymore
    private String direccionresidencia;
    private String email;
    private Integer fkrh;
    private Integer fkocupacion;
    private String redessociales;
    private Boolean recomgoogle;
    private Boolean recomfacebook;
    private Boolean recominstagram;
    private Boolean recomdoctoralia;
    private Boolean recompaciente;
    private Boolean recomespecialista;
    private Boolean recomotro;
    private String recomquien;
    private Integer fkactividadfisica;
    private String actividadcual;
    private Integer fkfuma;
    private Integer fkalcohol;
    private Integer fkalucinogenos;
    private Boolean almuerzarestaurante;
    private String quienpreparaalimentos;
    private Integer fkniveleducativo;
    private Integer fkestadocivil;
    private String antecedentespersonales;
    private String antecedentesfamiliares;
    private String patologiasasociadas;
    private Integer kgnosuyos;
    private String endonde;
    private Integer fkdiagnosticoinicial;
    private Integer fkdiagnosticoactual;
    private Float pesoidealmin;
    private Float pesoidealmax;
    private LocalDateTime fechaprimeringreso;
    private LocalDateTime fechaultimoingreso;
    private Integer fkestadoactual;
    private LocalDate ultimacita;
    private LocalDate proximacitasugerida;
    private String acudiente;
    private String agnosexfumador;
    private String agnosexalcoholico;
    private Boolean miperfil;
    private Boolean historiaclinica;
    private Boolean registraratencion;
}
