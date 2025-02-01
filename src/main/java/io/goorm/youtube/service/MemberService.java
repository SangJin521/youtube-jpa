package io.goorm.youtube.service;

import io.goorm.youtube.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberService {

    public List<Member> findAll();

    public Member login(Member member);

    public Optional<Member> find(Long seq);

    public boolean existsById(String seq);

    public Member save(Member member);

    public Member update(Member member);

    public Member updateUseYn(Long memberSeq);

}
