package com.learn.springframework.petclinic.map;

import com.learn.springframework.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<ID extends Long, T extends BaseEntity> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        if (object!= null){
            if (object.getId() == null){
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        }else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId = null;
        try {
            nextId =Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }

}
