package com.ftc.ftcmongo.controller;

import com.ftc.ftcmongo.entity.Member;
import com.ftc.ftcmongo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping("/members/{id}")
    public Member findById(@PathVariable String id) {
        return memberRepository.findById(id).get();
    }

    @GetMapping("/members")
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @PostMapping("/members/html")
    public Member saveHtml(@ModelAttribute Member members) {
        return memberRepository.save(members);
    }

    @PostMapping("/members")
    public Member save(@RequestBody Member members) {
        return memberRepository.save(members);
    }

    @PostMapping("/members/{id}/modify/html")
    public Member updateHtml(@ModelAttribute Member member, @PathVariable String id) {
        Member modifyMember = memberRepository.findById(id).orElse(null);
        modifyMember.setUserName(member.getUserName());
        modifyMember.setEmail(member.getEmail());
        return memberRepository.save(modifyMember);
    }

    @PostMapping("/members/{id}/modify")
    public Member update(@RequestBody Member member, @PathVariable String id) {
        Member modifyMember = memberRepository.findById(id).orElse(null);
        modifyMember.setUserName(member.getUserName());
        modifyMember.setEmail(member.getEmail());
        return memberRepository.save(modifyMember);
    }

    @PostMapping("/members/{id}/delete")
    public boolean deleteById(@PathVariable String id) {
        memberRepository.deleteById(id);
        return true;
    }

    @PostMapping("/members/redirect")
    public void redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String redirectUri = "/redirect";
        response.sendRedirect(redirectUri);
    }
}
