package myAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	public void printStr(JoinPoint joinPoint, Object ret) throws Throwable{ //첫번째로 위치
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + "--advice--" + (String) ret);
	}
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행시간 : " + (finish - start) + " ms");
		}
	}
}
