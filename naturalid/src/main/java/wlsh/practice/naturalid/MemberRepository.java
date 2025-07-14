package wlsh.practice.naturalid;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager entityManager;
    private final MemberSpringJpaRepository memberJpaRepository;

    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }

    public Optional<Member> findById(Long id) {
        return memberJpaRepository.findById(id);
    }

    public Optional<Member> findByEmail(String email) {
        return memberJpaRepository.findByEmail(email);
    }

    /**
     * NaturalId 전용 API를 이용한 조회 메서드
     */
    public Optional<Member> findByEmailWithNatural(String email) {
        return entityManager.unwrap(Session.class)
                .bySimpleNaturalId(Member.class)
                .loadOptional(email);
    }
}
