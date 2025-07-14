package wlsh.practice.naturalid;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
record MemberTest(
        MemberRepository memberRepository,
        EntityManager em
) {
    @Test
    void naturalIdTest() throws Exception {
        // given
        memberRepository.save(new Member("email@email.com"));
        memberRepository.save(new Member("email@email.com"));

        // when


        // then

    }
}
