package br.uniamerica.lar.project.larpersistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.uniamerica.lar.project.larpersistence.repository.BaseRespository;
import br.uniamerica.lar.project.larpersistence.entitys.Usuario;

@Service
public class BaseService {

    @Autowired
    private BaseRespository baseRespository;

    @Transactional
    public void save(Usuario o) {
        baseRespository.save(o);
    }
    
}