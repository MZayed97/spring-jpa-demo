package data.jpa.project.demo.repo;

import data.jpa.project.demo.entity.Empolye;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<Empolye,Long> {
}
