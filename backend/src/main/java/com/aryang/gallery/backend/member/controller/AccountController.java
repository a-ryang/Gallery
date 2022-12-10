package com.aryang.gallery.backend.member.controller;

import com.aryang.gallery.backend.member.entity.Member;
import com.aryang.gallery.backend.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final MemberRepository memberRepository;

    @PostMapping("/api/account/login")
    public int login(
            @RequestBody Map<String, String> params
    ) {
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        if (member != null) {
            return member.getId();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
