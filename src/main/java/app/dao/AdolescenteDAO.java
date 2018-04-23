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
@Repository("AdolescenteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AdolescenteDAO extends JpaRepository<Adolescente, java.lang.String> {

  /**
   * Obtém a instância de Adolescente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Adolescente entity WHERE entity.id = :id")
  public Adolescente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Adolescente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Adolescente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Adolescente> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:idade is null OR entity.idade = :idade) AND (:dataDeNascimento is null OR entity.dataDeNascimento = :dataDeNascimento)")
  public Page<Adolescente> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="idade") java.lang.Integer idade, @Param(value="dataDeNascimento") java.util.Date dataDeNascimento, Pageable pageable);
  
  /**
   * Foreign Key grupoDeVida
   * @generated
   */
  @Query("SELECT entity FROM Adolescente entity WHERE entity.grupoDeVida.id = :id")
  public Page<Adolescente> findAdolescentesByGrupoDeVida(@Param(value="id") java.lang.String id, Pageable pageable);

}
