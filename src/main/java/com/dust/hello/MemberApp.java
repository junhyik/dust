package com.dust.hello;

import com.dust.hello.member.Grade;
import com.dust.hello.member.Member;
import com.dust.hello.member.MemberService;
import com.dust.hello.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {

//        구현체로 할당
//        MemberServiceImpl memberService1 = new MemberServiceImpl();
//        Member member = new Member(1L, "memberA", Grade.VIP);
//        memberService1.join(member);

//        인터페이스로 할당 ( 다형성 )
//        MemberService memberService = new MemberServiceImpl();
//        Member member = new Member(1L, "memberA", Grade.VIP);
//        memberService.join(member);

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
        
    }
}
