import org.junit.Assert;
import org.junit.Test;

import myJenkinPackage.JenkinsTestDemo;

public class JenkinsTest {

	@Test
	public void test1() {
		int a = 15; int b = 10; 
		int expectedResult = 25;
		
		JenkinsTestDemo objgitclassUnderTest= new JenkinsTestDemo();
		
		int result = objgitclassUnderTest.add(a, b);
		
		//Assert
		Assert.assertEquals(expectedResult, result);
	}
}
