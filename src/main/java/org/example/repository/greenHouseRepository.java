package org.example.repository;

import org.example.model.greenHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface greenHouseRepository extends JpaRepository<greenHouse,String>{
}
