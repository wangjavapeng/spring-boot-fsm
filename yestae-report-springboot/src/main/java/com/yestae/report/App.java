package com.yestae.report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

import com.yestae.report.enums.Events;
import com.yestae.report.enums.States;

/**
 * 命令行方式使用状态机
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.yestae.report.mapper")
public class App implements CommandLineRunner{
	//只有一个实例
	@Autowired
    private StateMachine<States, Events> stateMachine;
	
	//状态机工厂，可以生成多个状态机实例
	@Autowired
    StateMachineFactory<States, Events> factory;
	
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    	StateMachine<States,Events> stateMachine2 = factory.getStateMachine("StateMachineFactory");
    	stateMachine2.start();
        System.out.println("--- coin ---");
        stateMachine2.sendEvent(Events.COIN);
        System.out.println("--- coin ---");
        stateMachine.sendEvent(Events.COIN);
        System.out.println("--- push ---");
        stateMachine.sendEvent(Events.PUSH);
        System.out.println("--- push ---");
        stateMachine2.sendEvent(Events.PUSH);
        stateMachine2.stop();
    }
    
}
