package com.ohgiraffers.section08.uses;

public class MemberFinder {

	public Member[] findAllMembers() {
		
		return MemberRepository.findAllMembers();
	}
}
