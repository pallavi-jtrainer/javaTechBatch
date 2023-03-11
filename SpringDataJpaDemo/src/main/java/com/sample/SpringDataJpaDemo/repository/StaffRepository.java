package com.sample.SpringDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.SpringDataJpaDemo.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{
	public Staff findByStaffId(long id);
	public Staff findByEmail(String email);
	public Staff findByContact(String ph);
	
	@Modifying
	@Query("update Staff o set o.contact = :ph where o.staffId = :id")
	public int updateContact(@Param("id") long id, @Param("ph") String ph);
	
	@Modifying
	@Query("update Staff o set o.passcode = :pass where o.staffId = :id")
	public int updatePasscode(@Param("id") long id, @Param("pass") String pass);
}
