package ch.uzh.seals.dockalyzerwebserver.service;

import java.io.Serializable;

/**
 * Generic service interface, to be extended by specific services.
 */
public interface GenericService<T, ID extends Serializable> {

    Iterable<T> findAll();

    T findOne(ID id);

    void saveOrUpdate(T entity);

    void delete(ID id);

}
