package com.claudiagomes.crud.repositories;

import com.claudiagomes.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
