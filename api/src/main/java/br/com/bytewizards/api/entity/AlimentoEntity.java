package br.com.bytewizards.api.entity;

import br.com.bytewizards.api.entity.enums.TipoAlimento;
import br.com.bytewizards.api.entity.enums.UnidadeMedida;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="TB_ALIMENTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_ALIMENTO")
    private Long id;

    @Column(name="NM_ALIMENTO")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_ALIMENTO")
    private TipoAlimento tipo;

    @Column(name="QUANTIDADE_ALIMENTO")
    private Double quantidade;

    @Column(name="UNIDADE_MEDIDA")
    private UnidadeMedida unidadeMedida;

    @Column(name="VALIDADE_ALIMENTO")
    private LocalDate dataValidade;

    @Column(name="ATIVO")
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name="ID_ONG")
    private OngEntity ong;

    @ManyToOne
    @JoinColumn(name="ID_DOADOR")
    private DoadorEntity doador;




}