package newtest.newton.repository;

import newtest.newton.model.vanpool_user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<vanpool_user, Integer> {
}
