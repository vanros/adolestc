package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("GrupoDeVidaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface GrupoDeVidaDAO extends JpaRepository<GrupoDeVida, java.lang.String> {

  /**
   * Obtém a instância de GrupoDeVida utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GrupoDeVida entity WHERE entity.id = :id")
  public GrupoDeVida findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de GrupoDeVida utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GrupoDeVida entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.grupoDeVida.id = :id")
  public Page<User> findUser(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE entity.grupoDeVida.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Adolescente> findAdolescenteGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE entity.grupoDeVida.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:idade is null OR entity.idade = :idade) AND (:dataDeNascimento is null OR entity.dataDeNascimento = :dataDeNascimento)")
  public Page<Adolescente> findAdolescenteSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, @Param(value="idade") java.lang.Integer idade, @Param(value="dataDeNascimento") java.util.Date dataDeNascimento, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE entity.grupoDeVida.id = :id")
  public Page<Adolescente> findAdolescente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Atividades entity WHERE entity.grupoDeVida.id = :id")
  public Page<Atividades> findAtividades(@Param(value="id") java.lang.String id, Pageable pageable);

}
