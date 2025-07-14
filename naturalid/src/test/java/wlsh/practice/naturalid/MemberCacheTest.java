package wlsh.practice.naturalid;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
record MemberCacheTest(
    MemberRepository memberRepository,
    EntityManager em
) {

    @Test
    void 쿼리가_한_번_발생해야_함1() throws Exception {
        // given
        Member member = memberRepository.save(new Member("email@email.com"));
        em.flush();
        em.clear();

        // when then
        memberRepository.findById(member.getId()).orElseThrow();
        memberRepository.findById(member.getId()).orElseThrow();
    }

    @Test
    void 단순_조회하는_경우_쿼리가_두_번_발생해야_함() throws Exception {
        // given
        String email = "email@email.com";
        Member member = memberRepository.save(new Member(email));
        em.flush();
        em.clear();

        // when then
        memberRepository.findById(member.getId()).orElseThrow();
        memberRepository.findByEmail(email).orElseThrow();
    }

    @Test
    void naturalId용_api로_조회하는_경우_쿼리가_한_번_발생해야_함() throws Exception {
        // given
        String email = "email@email.com";
        Member member = memberRepository.save(new Member(email));
        em.flush();
        em.clear();

        // when then
        memberRepository.findById(member.getId()).orElseThrow();
        memberRepository.findByEmailWithNatural(email).orElseThrow();
    }

    @Test
    void naturalId용_api로_조회하는_경우_쿼리가_한_번_발생해야_함2() throws Exception {
        // given
        String email = "email@email.com";
        Member member = memberRepository.save(new Member(email));
        em.flush();
        em.clear();

        // when then
        memberRepository.findByEmailWithNatural(email).orElseThrow();
        memberRepository.findByEmailWithNatural(email).orElseThrow();
    }
}
