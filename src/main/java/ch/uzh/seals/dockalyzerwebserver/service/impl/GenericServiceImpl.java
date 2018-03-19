package ch.uzh.seals.dockalyzerwebserver.service.impl;

import ch.uzh.seals.dockalyzerwebserver.service.GenericService;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 *
 */
public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

    private CrudRepository<T, ID> crudRepository;

    GenericServiceImpl(CrudRepository<T, ID> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @SuppressWarnings("unused")
    GenericServiceImpl() {}

    @Override
    public Iterable<T> findAll() {
        return this.crudRepository.findAll();
    }

    @Override
    public T findOne(ID id) {
        return this.crudRepository.findOne(id);
    }

    @Override
    public void saveOrUpdate(T entity) {
        this.crudRepository.save(entity);
    }

    @Override
    public void delete(ID id) {
        this.crudRepository.delete(id);
    }

}
