package com.etoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}

//查询从事同一种工作但不属于同一部门的员工信息

//select distinct a.* from emp a join emp b on a.job like b.job and a.deptno <> b.deptno;
//select distinct t1.empno,t1.ename,t1.deptno from emp t1 join emp t2 on t1.job like t2.job and t1.deptno<>t2.deptno;
//select * from emp where job in(select a.job from emp a join emp b on a.job = b.job and a.deptno <> b.deptno GROUP BY a.job);
