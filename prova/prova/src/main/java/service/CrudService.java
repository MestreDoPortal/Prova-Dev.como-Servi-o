package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.model.Crud;
import com.example.prova.repository.CrudRepository;

@Service
public class CrudService {

    @Autowired
    private CrudRepository crudRepository;

    public Crud save(Crud crud) {
        return crudRepository.save(crud);
    }

    public List<Crud> getAllItens() {
        return crudRepository.findAll();
    }
    



}
