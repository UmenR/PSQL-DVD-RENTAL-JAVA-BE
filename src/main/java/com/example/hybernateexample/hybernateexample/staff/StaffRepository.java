package com.example.hybernateexample.hybernateexample.staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface StaffRepository extends JpaRepository<Staff,Integer> {

    @Query(value = "SELECT * FROM Staff s WHERE s.active = true", nativeQuery=true)
    Collection<Staff> getAllInactive();
}
