package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		// MemberServiceImpl service = new MemberServiceImpl();
		MemberServiceImpl service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));

		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		String text;
		for(Member mem : list) {
		text = (mem.getId() + "," + mem.getName() + "," + mem.getEmail());
			System.out.println(text);
		}
		System.out.println(service.sumOf(3, 5));
	}
}
