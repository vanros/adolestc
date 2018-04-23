package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela ATIVIDADES
 * @generated
 */
@Entity
@Table(name = "\"ATIVIDADES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Atividades")
public class Atividades implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "local", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String local;

  /**
  * @generated
  */
  @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="DpjBW-OF3tAAAAAAAAAAb1Gu05b1u4khn07iKjkAIRIimmYfO4UYi7N1sN3iBS_l")
  
  private java.lang.String imagem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_grupoDeVida", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private GrupoDeVida grupoDeVida;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataeHorario;

  /**
   * Construtor
   * @generated
   */
  public Atividades(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Atividades setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém local
   * return local
   * @generated
   */
  
  public java.lang.String getLocal(){
    return this.local;
  }

  /**
   * Define local
   * @param local local
   * @generated
   */
  public Atividades setLocal(java.lang.String local){
    this.local = local;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public java.lang.String getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public Atividades setImagem(java.lang.String imagem){
    this.imagem = imagem;
    return this;
  }

  /**
   * Obtém grupoDeVida
   * return grupoDeVida
   * @generated
   */
  
  public GrupoDeVida getGrupoDeVida(){
    return this.grupoDeVida;
  }

  /**
   * Define grupoDeVida
   * @param grupoDeVida grupoDeVida
   * @generated
   */
  public Atividades setGrupoDeVida(GrupoDeVida grupoDeVida){
    this.grupoDeVida = grupoDeVida;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Atividades setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém dataeHorario
   * return dataeHorario
   * @generated
   */
  
  public java.util.Date getDataeHorario(){
    return this.dataeHorario;
  }

  /**
   * Define dataeHorario
   * @param dataeHorario dataeHorario
   * @generated
   */
  public Atividades setDataeHorario(java.util.Date dataeHorario){
    this.dataeHorario = dataeHorario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Atividades object = (Atividades)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
