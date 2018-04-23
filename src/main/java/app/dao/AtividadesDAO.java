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
@Repository("AtividadesDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AtividadesDAO extends JpaRepository<Atividades, java.lang.String> {

  /**
   * Obtém a instância de Atividades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Atividades entity WHERE entity.id = :id")
  public Atividades findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Atividades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Atividades entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key grupoDeVida
   * @generated
   */
  @Query("SELECT entity FROM Atividades entity WHERE entity.grupoDeVida.id = :id")
  public Page<Atividades> findAtividadessByGrupoDeVida(@Param(value="id") java.lang.String id, Pageable pageable);

}
