package wlsh.practice.naturalid;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberSpringJpaRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);

    Optional<Member> findByName(String name);
}
