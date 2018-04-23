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
 * Classe que representa a tabela ADOLESCENTE
 * @generated
 */
@Entity
@Table(name = "\"ADOLESCENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Adolescente")
public class Adolescente implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idade;

  /**
  * @generated
  */
  @Column(name = "contato", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String contato;

  /**
  * @generated
  */
  @Column(name = "responsavel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String responsavel;

  /**
  * @generated
  */
  @Column(name = "contatoDoResponsavel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String contatoDoResponsavel;

  /**
  * @generated
  */
  @Column(name = "ingressante", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean ingressante;

  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sexo;

  /**
  * @generated
  */
  @Column(name = "observacoes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String observacoes;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="DpjBW-OF3tAAAAAAAAAAb1Gu05b1u4khn07iKjkAIRIimmYfO4UYi7N1sN3iBS_l")
  
  private java.lang.String foto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_grupoDeVida", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private GrupoDeVida grupoDeVida;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataDeNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataDeNascimento;

  /**
  * @generated
  */
  @Column(name = "batizadoNaIEADTC", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean batizadoNaIEADTC;

  /**
   * Construtor
   * @generated
   */
  public Adolescente(){
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
  public Adolescente setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Adolescente setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém idade
   * return idade
   * @generated
   */
  
  public java.lang.Integer getIdade(){
    return this.idade;
  }

  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public Adolescente setIdade(java.lang.Integer idade){
    this.idade = idade;
    return this;
  }

  /**
   * Obtém contato
   * return contato
   * @generated
   */
  
  public java.lang.String getContato(){
    return this.contato;
  }

  /**
   * Define contato
   * @param contato contato
   * @generated
   */
  public Adolescente setContato(java.lang.String contato){
    this.contato = contato;
    return this;
  }

  /**
   * Obtém responsavel
   * return responsavel
   * @generated
   */
  
  public java.lang.String getResponsavel(){
    return this.responsavel;
  }

  /**
   * Define responsavel
   * @param responsavel responsavel
   * @generated
   */
  public Adolescente setResponsavel(java.lang.String responsavel){
    this.responsavel = responsavel;
    return this;
  }

  /**
   * Obtém contatoDoResponsavel
   * return contatoDoResponsavel
   * @generated
   */
  
  public java.lang.String getContatoDoResponsavel(){
    return this.contatoDoResponsavel;
  }

  /**
   * Define contatoDoResponsavel
   * @param contatoDoResponsavel contatoDoResponsavel
   * @generated
   */
  public Adolescente setContatoDoResponsavel(java.lang.String contatoDoResponsavel){
    this.contatoDoResponsavel = contatoDoResponsavel;
    return this;
  }

  /**
   * Obtém ingressante
   * return ingressante
   * @generated
   */
  
  public java.lang.Boolean getIngressante(){
    return this.ingressante;
  }

  /**
   * Define ingressante
   * @param ingressante ingressante
   * @generated
   */
  public Adolescente setIngressante(java.lang.Boolean ingressante){
    this.ingressante = ingressante;
    return this;
  }

  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  
  public java.lang.String getSexo(){
    return this.sexo;
  }

  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public Adolescente setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }

  /**
   * Obtém observacoes
   * return observacoes
   * @generated
   */
  
  public java.lang.String getObservacoes(){
    return this.observacoes;
  }

  /**
   * Define observacoes
   * @param observacoes observacoes
   * @generated
   */
  public Adolescente setObservacoes(java.lang.String observacoes){
    this.observacoes = observacoes;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Adolescente setFoto(java.lang.String foto){
    this.foto = foto;
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
  public Adolescente setGrupoDeVida(GrupoDeVida grupoDeVida){
    this.grupoDeVida = grupoDeVida;
    return this;
  }

  /**
   * Obtém dataDeNascimento
   * return dataDeNascimento
   * @generated
   */
  
  public java.util.Date getDataDeNascimento(){
    return this.dataDeNascimento;
  }

  /**
   * Define dataDeNascimento
   * @param dataDeNascimento dataDeNascimento
   * @generated
   */
  public Adolescente setDataDeNascimento(java.util.Date dataDeNascimento){
    this.dataDeNascimento = dataDeNascimento;
    return this;
  }

  /**
   * Obtém batizadoNaIEADTC
   * return batizadoNaIEADTC
   * @generated
   */
  
  public java.lang.Boolean getBatizadoNaIEADTC(){
    return this.batizadoNaIEADTC;
  }

  /**
   * Define batizadoNaIEADTC
   * @param batizadoNaIEADTC batizadoNaIEADTC
   * @generated
   */
  public Adolescente setBatizadoNaIEADTC(java.lang.Boolean batizadoNaIEADTC){
    this.batizadoNaIEADTC = batizadoNaIEADTC;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Adolescente object = (Adolescente)obj;
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
