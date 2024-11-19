package com.example.MEXXONhardware.Repo;

import com.example.MEXXONhardware.DB.ITAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITAdminRepo extends JpaRepository<ITAdmin, Long> {

}
