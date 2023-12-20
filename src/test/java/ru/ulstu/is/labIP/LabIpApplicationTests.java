package ru.ulstu.is.labIP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ulstu.is.labIP.calculator.service.CalcService;

@SpringBootTest
class LabIpApplicationTests {
	/*@Test
	void contextLoads() {
	}*/

	@Autowired
	CalcService calcService;

	@Test
	void testCalcMult() {
		final int res = calcService.action(2,4,"mult");
		Assertions.assertEquals(8, res);
	}

	@Test
	void testCalcMinus() {
		final int res = calcService.action(2,4,"minus");
		Assertions.assertEquals(-2, res);
	}

	@Test
	void testCalcPlus() {
		final int res = calcService.action(2,4,"plus");
		Assertions.assertEquals(6, res);
	}

	@Test
	void testCalcErrorWired() {
		Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> calcService.action(2,4,"div"));
	}
}
