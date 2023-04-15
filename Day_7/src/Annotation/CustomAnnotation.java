package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
}

class Sample{
	@MyAnnotation(value = 20)
	public void hello() {
		System.out.println("hello");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		Method m = s.getClass().getMethod("hello");
		MyAnnotation a = m.getAnnotation(MyAnnotation.class);
		System.out.println("The value is :"+a.value());

	}

}
