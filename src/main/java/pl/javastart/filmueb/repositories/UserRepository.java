package pl.javastart.filmueb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.filmueb.model.userRelated.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
