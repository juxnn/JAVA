package chap6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
//적용대상을 정해주는 @Target
@Retention(RetentionPolicy.RUNTIME)
//어느 범위까지 유지할 것인지 지정.
//어노테이션 정보를 어디서 얻을건지? 그걸 정해주는 것인지
public @interface p274_PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
