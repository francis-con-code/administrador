package com.one.core.repository;

import com.one.core.model.Userf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Userf,Long> {
    @Query("SELECT u FROM Userf u WHERE u.name = :name and u.email = :email")
    Optional<Userf> findByEmailAndName(@Param("email")String email,@Param("name") String name);
}
