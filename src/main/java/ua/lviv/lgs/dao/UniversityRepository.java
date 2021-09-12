package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ua.lviv.lgs.domain.University;

import java.util.List;


public interface UniversityRepository extends JpaRepository<University, Long>, CrudRepository<University,Long> {

    List<University> findByLevel(String level);

    List<University> findByInstitut(int institut);

    List<University> findByStudent(int student);

    List<University> findByAdress(String adress);
}
