package Alumini.Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Alumini.Management.entity.Alumini;

public interface AluminiRepository extends JpaRepository<Alumini,Integer> 
{
	List<Alumini> findByNameContaining(String name);
	List<Alumini> findBygrdYearContaining(String grdYear);
}
