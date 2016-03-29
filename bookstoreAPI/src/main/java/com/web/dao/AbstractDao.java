/*package com.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao< T> {
 
   private Class< T > clazz;
 
   @PersistenceContext
//   @Autowired
   EntityManager entityManagerFactory;
 
   public EntityManager getEntityManager() {
	return entityManagerFactory;
}

public void setEntityManager(EntityManager entityManager) {
	this.entityManagerFactory = entityManager;
}

public void setClazz( Class< T > clazzToSet ){
      this.clazz = clazzToSet;
   }
 
   public T findOne( Long id ){
      return entityManagerFactory.find( clazz, id );
   }
   public List< T > findAll(){
      return entityManagerFactory.createQuery( "from " + clazz.getName() )
       .getResultList();
   }
 
   public void save( T entity ){
      entityManagerFactory.persist( entity );
   }
 
   public void update( T entity ){
      entityManagerFactory.merge( entity );
   }
 
   public void delete( T entity ){
      entityManagerFactory.remove( entity );
   }
   public void deleteById( Long entityId ){
      T entity = findOne( entityId );
      delete( entity );
   }
}*/