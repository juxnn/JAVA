package chap6;

import java.lang.reflect.Method;

public class p275_PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = p275_Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(p274_PrintAnnotation.class)) {
				p274_PrintAnnotation printAnnotation = method.getAnnotation(p274_PrintAnnotation.class);
				
				System.out.println("["+method.getName()+"]");
				
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new p275_Service());
				}catch(Exception e) {}
				System.out.println();
			}
		}
	}

}
