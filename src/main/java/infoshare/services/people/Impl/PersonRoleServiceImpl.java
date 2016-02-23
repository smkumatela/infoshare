/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoshare.services.people.Impl;



import infoshare.domain.PersonRole;
import infoshare.restapi.people.PersonRoleAPI;
import infoshare.services.people.PersonRoleService;

import java.util.Set;

/**
 * @author BONGANI
 */
public class PersonRoleServiceImpl implements PersonRoleService {

    @Override
    public PersonRole save(PersonRole entity) {
        return PersonRoleAPI.save(entity);
    }

    @Override
    public PersonRole update(PersonRole entity) {
        return PersonRoleAPI.save(entity);
    }

    @Override
    public void delete(PersonRole entity) {
        PersonRoleAPI.save(entity);
    }

    @Override
    public Set<PersonRole> findPersonRoles(String personId) {
        return PersonRoleAPI.findAll(personId);
    }

}
