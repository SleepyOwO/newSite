package web.newsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.newsite.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
