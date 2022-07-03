package jpabook.jpashop1;

import jpabook.jpashop1.domain.Address;
import jpabook.jpashop1.domain.Member;
import jpabook.jpashop1.domain.Order;
import jpabook.jpashop1.domain.item.Book;
import jpabook.jpashop1.domain.item.Item;
import jpabook.jpashop1.repository.ItemRepository;
import jpabook.jpashop1.repository.MemberRepository;
import jpabook.jpashop1.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Jpashop1Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ac;

    public static void main(String[] args) {
        SpringApplication.run(Jpashop1Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        MemberRepository memberRepository =ac.getBean(MemberRepository.class);
        ItemRepository itemRepository = ac.getBean(ItemRepository.class);

        Member member = new Member();
        Address address = new Address("seoul", "jongro", "12345");

        member.setName("park");
        member.setAddress(address);
        memberRepository.save(member);

        Book item = new Book();
        item.setName("곽책");
        item.setPrice(10000);
        item.setStockQuantity(100);
        item.setAuthor("김욱상");
        item.setIsbn("21345");
        itemRepository.save(item);
    }
}
