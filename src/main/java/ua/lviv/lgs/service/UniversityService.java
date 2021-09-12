package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.University;

import java.util.List;

public interface UniversityService {

    University save(University university);

    University findById(Long id);

    University update(University university);

    void deleteById(Long id);

    List<University> findAll();

    List<University> findByLevel(String level);

    List<University> findByInstitut(int institut);

    List<University> findByStudent(int student);

    List<University> findByAdress(String adress);


}
