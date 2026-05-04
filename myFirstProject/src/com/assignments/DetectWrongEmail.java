package com.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectWrongEmail {

	public static void main(String[] args) {
		List<String> mails = new ArrayList<>();
		Set<String> m = new HashSet<>();
		mails.add("abc@gmail.com");
		mails.add("sudha@gmail.com");
		mails.add("rupa@gmail.com");
		mails.add("surya@gmailcom");
		mails.add("rupa.gmail.com");
		mails.add("rupa@gmail.com");
		
		System.out.println("Duplicates & Invalid Mail Ids: ");
		for (int i = 0; i < mails.size(); i++) {
			if (mails.get(i).contains("@gmail.com")) {
				if (!m.add(mails.get(i))) {
					System.out.println(mails.get(i));
				}
			} else {
				System.out.println(mails.get(i));
			}
		}

	}

}
