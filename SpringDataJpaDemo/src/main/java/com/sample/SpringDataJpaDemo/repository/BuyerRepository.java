package com.sample.SpringDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.SpringDataJpaDemo.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long>{
	public Buyer findByBuyerId(long id);
	public Buyer findByEmail(String email);
	public Buyer findByContact(String ph);
	
	@Modifying
	@Query("update Buyer o set o.contact = :ph where o.buyerId = :id")
	public int updateContact(@Param("id") long id, @Param("ph") String ph);
	
	@Modifying
	@Query("update Buyer o set o.passcode = :pass where o.buyerId = :id")
	public int updatePasscode(@Param("id") long id, @Param("pass") String pass);
	
	@Modifying
	@Query("update Buyer o set o.address = :addr where o.buyerId = :id")
	public int updateAddress(@Param("id") long id, @Param("addr") String addr);
}
