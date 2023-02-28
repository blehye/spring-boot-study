package apple.applespring.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import apple.applespring.domain.Member;

public class MemoryMemberRepository implements MemberRepository{
    
    private static Map<Integer, Member> store = new HashMap<>();
    private static int sequence = 0;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(int id) {
        store.get(id);
        return null;
    }

    @Override
    public Optional<Member> findByName(String name) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
    
}
