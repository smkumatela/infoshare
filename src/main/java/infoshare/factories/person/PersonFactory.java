package infoshare.factories.person;


import infoshare.app.util.DomainState;
import infoshare.app.util.security.KeyGenerator;
import infoshare.domain.person.Person;

import java.util.Map;

/**
 * Created by hashcode on 2015/08/16.
 */
public class PersonFactory {

    public static Person getPerson(Map<String, String> stringVals,
                                   Map<String, Boolean> boolVals) {
        Person person = new Person.Builder()
                .id(KeyGenerator.getEntityId())
                .org(stringVals.get("org"))
                .firstName(stringVals.get("firstName"))
                .middleName(stringVals.get("middleName"))
                .lastName(stringVals.get("lastName"))
                .authvalue(stringVals.get("authvalue"))
                .emailAddress(stringVals.get("emailAddress"))
                .enabled(boolVals.get("enabled"))
                .accountNonExpired(boolVals.get("accountNonExpired"))
                .accountNonLocked(boolVals.get("accountNonLocked"))
                .credentialsNonExpired(boolVals.get("credentialsNonExpired"))
                .state(DomainState.ACTIVE.name())
                .build();
        return person;
    }
}

     