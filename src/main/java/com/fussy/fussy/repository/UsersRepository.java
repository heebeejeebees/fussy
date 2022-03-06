package com.fussy.fussy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fussy.fussy.model.UsersModel;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, UUID> {

}
