package com.yourcompany.zoo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.perfspy.aspect.AbstractPerfSpyAspect;


@Aspect
public class PerfSpyDemoAsepct extends AbstractPerfSpyAspect {
	
	@Pointcut("execution(* com.yourcompany.zoo..*.*(..) )")
	public void withinCflowOps() {
	}

	@Pointcut("cflow(execution(*  com.yourcompany.zoo.animal.Animal.playTricks(..)  ) )")
	public void cflowOps() {
	}

	public static void main(String[] args){

		System.out.println("Boom");

	}

}
