package com.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
