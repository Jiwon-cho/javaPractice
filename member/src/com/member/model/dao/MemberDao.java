package com.member.model.dao;

import com.member.model.vo.Member;

public class MemberDao {
	private Member m1;
	private Member m2;
	private Member m3;

	public boolean insertMember(Member m) {
		boolean flag = true;
		if (m1 == null) {
			// s1변수가 비어있다
			m1 = m;
		} else if (m2 == null) {
			m2 = m;

		} else if (m3 == null) {
			m3 = m;
		} else {
			flag = false;
		}
		return flag;
	}

}
