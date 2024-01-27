package tests;

import model.StudentLogic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Student;
/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Jan 27, 2024
 */
public class TestStudentLogic {

	StudentLogic stuLog = new StudentLogic();
	Student student = new Student("Jim");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAgeIsOverSixteen() {
		student.setAge(17);
		assertTrue(stuLog.isStudentAge(student));
	}
	
	@Test
	public void testAgeisNotOverSixteen() {
		student.setAge(14);
		assertFalse(stuLog.isStudentAge(student));
	}
}
