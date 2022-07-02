package jpabook.jpashop1;

import jpabook.jpashop1.domain.Address;
import jpabook.jpashop1.domain.Member;
import jpabook.jpashop1.domain.Order;
import jpabook.jpashop1.repository.MemberRepository;
import jpabook.jpashop1.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Jpashop1Application {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(Jpashop1Application.class, args);

        Jpashop1Application jpashop1Application = new Jpashop1Application();

        MemberRepository memberRepository = jpashop1Application.applicationContext.getBean(MemberRepository.class);
        OrderRepository orderRepository = jpashop1Application.applicationContext.getBean(OrderRepository.class);

        Member member = new Member();
        Address address = new Address("seoul", "jongro", "12345");

        member.setName("park");
        member.setAddress(address);
        memberRepository.save(member);

        Order order = new Order();

    }

}
