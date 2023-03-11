package com.sample.SpringDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.SpringDataJpaDemo.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
	//select * from owner where ownerid = id
	public Owner findByOwnerId(long id);
	public Owner findByEmail(String email);
	public Owner findByContact(String ph);
	
	@Modifying
	@Query("update Owner o set o.contact = :ph where o.ownerId = :id")
	public int updateContact(@Param("id") long id, @Param("ph") String ph);
	
	@Modifying
	@Query("update Owner o set o.passcode = :pass where o.ownerId = :id")
	public int updatePasscode(@Param("id") long id, @Param("pass") String pass);
	
	@Modifying
	@Query("update Owner o set o.address = :addr where o.ownerId = :id")
	public int updateAddress(@Param("id") long id, @Param("addr") String addr);
}
