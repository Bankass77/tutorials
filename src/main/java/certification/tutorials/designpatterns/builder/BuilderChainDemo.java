package certification.tutorials.designpatterns.builder;

import certification.tutorials.designpatterns.builder.chain.Account;

public class BuilderChainDemo {

	public static void main(String[] args) {

		Account account = Account.newBuilder().setToken("hello").setUserId("habr").build();
		System.out.println(account);

	}

}
