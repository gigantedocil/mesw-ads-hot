/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.repositories;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 * @param <T>
 */
public abstract class AbstractBaseRepository<T> implements IRepository<T> {

    private final List<T> repository = new ArrayList<>();

    @Override
    public boolean add(T object) {
        repository.add(object);
        return exists(object);
    }

    @Override
    public boolean remove(T object) {
        repository.remove(object);
        return !exists(object);
    }

    @Override
    public boolean exists(T object) {
        return repository.contains(object);
    }

    @Override
    public List<T> retrieveAll() {
        return repository;
    }
}
