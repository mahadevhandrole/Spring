package org.vs.SpringSecurity.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
//






//import org.vs.HRMProject.Entity.Student_info;

//@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource(collectionResourceRel = "Student_infoes", path="student_info")
public interface Student_info_Repository extends JpaRepository<org.vs.SpringSecurity.entity.Student_info, Integer> 
{
Page<org.vs.SpringSecurity.entity.Student_info> findByid(@RequestParam("id") int id, Pageable pageable); 
Page<org.vs.SpringSecurity.entity.Student_info> findByNameContaining(@RequestParam("name") String name,Pageable pageable);
Page<org.vs.SpringSecurity.entity.Student_info> findByStatusContaining(@RequestParam("status") String status,Pageable pageable);

}
