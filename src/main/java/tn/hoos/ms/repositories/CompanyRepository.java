package tn.hoos.ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import tn.hoos.ms.entities.Company;

@RepositoryRestController
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
