package com.aryang.gallery.backend.member.repository;

import com.aryang.gallery.backend.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
