package br.uniamerica.lar.project.larpersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.uniamerica.lar.project.larpersistence.entitys.Usuario;

@Repository
public interface BaseRespository extends JpaRepository<Usuario, Long>{}