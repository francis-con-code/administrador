package com.one.core.repository;

import com.one.core.model.Userf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userf,Long> {
}
