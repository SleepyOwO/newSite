package web.newsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.newsite.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}