package apple.applespring.repository;

import java.util.List;
import java.util.Optional;

import apple.applespring.domain.Member;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(int id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    
}
