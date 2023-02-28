package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Autowired;

import hello.hellospring.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository{

    // private final JdbcTemplate jdbcTemplate;

    // @Autowired
    // public JdbcTemplateMemberRepository(DataSource dataSource) {
    //     jdbcTemplate = new JdbcTemplate(dataSource);
    // }

    @Override
    public Member save(Member member) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Member> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<Member> findByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    @Override
    public List<Member> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
