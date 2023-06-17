package com.vijay.addressbook.repository;

import com.vijay.addressbook.entity.Addreess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Addreess, Long> {

    List<Addreess> findByName(String name);

}
