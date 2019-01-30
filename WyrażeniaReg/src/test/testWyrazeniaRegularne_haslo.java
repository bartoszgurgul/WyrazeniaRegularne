package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWyrazeniaRegularne_haslo {

	@Test
	void testCheckPassword() {
		String[] str = {
				"start",
				"start123",
				"Start_12",
				"12345678"};
		assertEquals(main.WyrazeniaRegularne_haslo.checkPassword("Start1"), false);
	}

}
