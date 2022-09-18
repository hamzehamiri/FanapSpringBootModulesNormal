package com.farhadi.fanapspringbootmodulesnormal.config.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

//@Component
public class HibernateListenersConfigurer {
    private static final Logger log = LoggerFactory.getLogger(HibernateListenersConfigurer.class);

    @Resource
    private EntityManagerFactory emf;

    @Resource
    private HibernateListenersAdapter listener;

    @PostConstruct
    public void registerListeners() {
        HibernateEntityManagerFactory hibernateEntityManagerFactory = (HibernateEntityManagerFactory) emf;
        SessionFactory sf = hibernateEntityManagerFactory.getSessionFactory();
        EventListenerRegistry registry = ((SessionFactoryImpl) sf).getServiceRegistry().getService(EventListenerRegistry.class);

        registry.getEventListenerGroup(EventType.PRE_INSERT).appendListener(listener);
        registry.getEventListenerGroup(EventType.POST_COMMIT_INSERT).appendListener(listener);
        registry.getEventListenerGroup(EventType.PRE_UPDATE).appendListener(listener);
        registry.getEventListenerGroup(EventType.POST_COMMIT_UPDATE).appendListener(listener);
        registry.getEventListenerGroup(EventType.PRE_DELETE).appendListener(listener);
        registry.getEventListenerGroup(EventType.POST_COMMIT_DELETE).appendListener(listener);
        registry.getEventListenerGroup(EventType.POST_LOAD).appendListener(listener);
    }
}
