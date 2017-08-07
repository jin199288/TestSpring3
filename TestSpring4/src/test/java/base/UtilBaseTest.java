package base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UtilBaseTest {
	private ClassPathXmlApplicationContext context;
	private String springXmlPath;
	
	public UtilBaseTest() {		
	}

	public UtilBaseTest(String springXmlPath) {		
		this.springXmlPath = springXmlPath;
	}
	
	@Before
	public void befor(){
		if(StringUtils.isEmpty(springXmlPath)){
			springXmlPath = "classpath*:spring-*.xml";
		}
		context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
		context.start();
	}
	@After
	public void after(){
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId){
		return (T)context.getBean(beanId);		
	}
	protected <T extends Object> T getBean(Class<T> clazz){
		return (T)context.getBean(clazz);
	}
}
