package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Jan 27, 2024
 */
public class TestStudent {

	StudentLogic stuLog = new StudentLogic();
	Student student = new Student("Michael");
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTitleNotNull() {
	   assertNotNull(student.printName( ));
	}

}
