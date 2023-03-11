package com.sample.SpringDataJpaDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.SpringDataJpaDemo.entity.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long>{
	public Cars findByCarId(long id);
	public List<Cars> findAllByModel(String model);
	public List<Cars> findAllByFuelType(String fuelType);
	public List<Cars> findAllByBrand(String brand);
	public List<Cars> findAllByColor(String color);
		
	@Query(value="select * from cars where ownerid = :id", nativeQuery = true)
	public List<Cars> findAllByOwnerId(@Param("id") long id);
	
	@Query("select c from Cars c where c.price > :min and c.price < :max")
	public List<Cars> findAllBetweenPrice(@Param("min") double min, @Param("max") double max);
	
	@Modifying
	@Query("update Cars c set c.price = :price where c.carId = :id")
	public int updatePrice(@Param("id") long id, @Param("price") double price);
	
}
