package com.dust.hello.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
