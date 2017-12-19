package pl.javastart.filmueb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.filmueb.model.userRelated.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
