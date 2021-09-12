package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UniversityRepository;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University findById(Long id) {
        return universityRepository.getById(id);
    }

    @Override
    public University update(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(Long id) {
        universityRepository.deleteById(id);

    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public List<University> findByLevel(String level) {
        return universityRepository.findByLevel(level);
    }

    @Override
    public List<University> findByInstitut(int institut) {
        return universityRepository.findByInstitut(institut);
    }

    @Override
    public List<University> findByStudent(int student) {
        return universityRepository.findByStudent(student);
    }

    @Override
    public List<University> findByAdress(String adress) {
        return universityRepository.findByAdress(adress);
    }
}
