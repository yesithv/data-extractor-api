package yesithv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "atencion")
@Data
public class AtencionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idatencion;

    private Boolean activo;
    private Boolean abierta;
    private LocalDateTime fecharegistro;
    private Integer fkpuntoatencion;
    private Integer fkciudadatencion;
    private Integer fkespecialidad;
    private Integer fkespecialista;
    private Integer fktipoatencion;
    private String observacionesregistro;
    private LocalDateTime fechaatencion;
    private Integer fkmotivoconsulta;
    private String descripcionmotivo;
    private Integer fkestadopaciente;
    private String antecedentespersonales;
    private String historiadietetica;
    private LocalDate fechalaboratorio;
    private String lecturalaboratorio;
    private String analisisnutricional;
    private String conclusionanalisis;
    private String prescripciondietaria;
    private Integer fkdiagnostico;
    private String tareas;
    private Float talla;
    private Float pesoactual;
    private Float IMC;
    private Integer fkdximc;
    private Float cintura;
    private Integer fkdxcintura;
    private Float cadera;
    private Float abdomenbajo;
    private Float brazo;
    private Float pierna;
    private Float pectoralesbusto;
    private Float pgrasascorporal;
    private Integer fkdxgcorporal;
    private Float pmusculo;
    private Integer fkdxmusculo;
    private Float pgrasaviseral;
    private Integer fkdxgvisceral;
    private Integer kcalbio;
    private Float edadcorporal;
    private Integer gestanteedad;
    private Integer gestantesemanas;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fkpaciente", referencedColumnName = "idpersona")
    private PersonaEntity paciente;
}
