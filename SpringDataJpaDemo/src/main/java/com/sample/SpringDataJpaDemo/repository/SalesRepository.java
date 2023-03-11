package com.sample.SpringDataJpaDemo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.SpringDataJpaDemo.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{
	public Sales findBySaleId(long id);
	public List<Sales> findAllBySaleDate(LocalDate date);
	
	@Query(value = "select * from sales where buyerid = :id", nativeQuery = true)
	public List<Sales> findAllByBuyer(@Param("id") long id);
	
	@Query(value = "select * from sales where staffid = :id", nativeQuery = true)
	public List<Sales> findAllByStaff(long id);
	
	@Query(value = "select * from sales where carId = :id", nativeQuery=true)
	public Sales findByCarId(@Param("id") long id);
}
