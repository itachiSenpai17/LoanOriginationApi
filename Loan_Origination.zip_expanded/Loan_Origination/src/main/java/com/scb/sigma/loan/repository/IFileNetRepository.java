package com.scb.sigma.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.sigma.loan.entities.FileNet;

@Repository
public interface IFileNetRepository extends JpaRepository<FileNet,Long>{
	
}
