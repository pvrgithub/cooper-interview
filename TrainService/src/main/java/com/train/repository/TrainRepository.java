package com.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.entities.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> 
{	 

}
