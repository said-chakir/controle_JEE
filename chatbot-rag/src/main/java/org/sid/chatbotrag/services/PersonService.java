package org.sid.chatbotrag.services;

import org.sid.chatbotrag.Entity.Person;
import org.sid.chatbotrag.Entity.PersonRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {

}
