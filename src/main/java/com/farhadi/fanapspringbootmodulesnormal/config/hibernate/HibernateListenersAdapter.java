package com.farhadi.fanapspringbootmodulesnormal.config.hibernate;

import org.hibernate.event.spi.*;
import org.hibernate.persister.entity.EntityPersister;
import org.springframework.stereotype.Service;

@Service
public class HibernateListenersAdapter implements PostInsertEventListener, PreInsertEventListener, PreUpdateEventListener, PostUpdateEventListener, PreDeleteEventListener, PostDeleteEventListener, PostLoadEventListener {
    @Override
    public void onPostDelete(PostDeleteEvent event) {
        System.out.println("onPostDelete");
    }

    @Override
    public void onPostInsert(PostInsertEvent event) {
        System.out.println("onPostInsert");
    }

    @Override
    public void onPostUpdate(PostUpdateEvent event) {
        System.out.println("onPostUpdate");
    }

    @Override
    public boolean requiresPostCommitHanding(EntityPersister persister) {
        return false;
    }

    @Override
    public void onPostLoad(PostLoadEvent event) {

    }

    @Override
    public boolean onPreDelete(PreDeleteEvent event) {
//        event.getSession()
        return true;
    }

    @Override
    public boolean onPreInsert(PreInsertEvent event) {
        return false;
    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent event) {
        return false;
    }
}
