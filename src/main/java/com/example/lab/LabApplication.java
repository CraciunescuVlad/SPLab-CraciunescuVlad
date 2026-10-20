package com.example.lab;

import com.example.lab.difexample.ClientComponent;
import com.example.lab.difexample.SingletonComponent;
import com.example.lab.difexample.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LabApplication.class, args);

        // 1. Prototype/Transient: la fiecare getBean se creeaza o instanta noua
        TransientComponent transientBean1 = context.getBean(TransientComponent.class);
        transientBean1.operation();

        TransientComponent transientBean2 = context.getBean(TransientComponent.class);
        transientBean2.operation();

        // 2. Singleton: returneaza aceeasi instanta unica
        SingletonComponent singletonBean1 = context.getBean(SingletonComponent.class);
        singletonBean1.operation();

        SingletonComponent singletonBean2 = context.getBean(SingletonComponent.class);
        singletonBean2.operation();

        // 3. ClientComponent: instantiat o singura data (singleton implicit)
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        ClientComponent cByName = (ClientComponent) context.getBean("clientComponent");
        cByName.operation();
    }
}