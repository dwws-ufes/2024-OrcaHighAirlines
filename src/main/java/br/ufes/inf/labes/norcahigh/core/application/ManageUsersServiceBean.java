package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.application.validation.CrudException;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.Role;
import br.ufes.inf.labes.norcahigh.core.domain.User;
import br.ufes.inf.labes.norcahigh.core.persistence.UserDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageUsersServiceBean extends CrudServiceImpl<User> implements ManageUsersService {

    @EJB
    private UserDAO userDAO;

    @Override
    public BaseDAO<User> getDAO() {
        return userDAO;
    }

    @Override
    public void validateCreate(User entity) throws CrudException {
        // Validation rule 1: cannot have two users with the same email.
        try {
            // Tries to find an existing user with the same email.
            User existing = userDAO.retrieveByEmail(entity.getEmail());
        } catch (PersistentObjectNotFoundException e) {
            // This is the expected result: the rule is being followed. All is OK.
            return;
        } catch (MultiplePersistentObjectsFoundException e) {
            // This is very unexpected! Will continue to throw a CRUD exception.
            // There should be at least a log here, but this is just an example.
        }

        // Rule 1 violated. Throw a CRUD exception.
        CrudException exception =
                addFieldValidationError(null, "A user cannot be created due to validation errors.",
                        "emailField", "manageUsers.error.emailExists");
        throw exception;
    }

    @Override
    public void validateUpdate(User entity) throws CrudException {
        // Validation rule 1: cannot have two users with the same email.
        try {
            // Tries to find an existing user with the same email.
            User existing = userDAO.retrieveByEmail(entity.getEmail());
            if (entity == existing) return;
        } catch (PersistentObjectNotFoundException e) {
            // This is the expected result: the rule is being followed. All is OK.
            return;
        } catch (MultiplePersistentObjectsFoundException e) {
            // This is very unexpected! Will continue to throw a CRUD exception.
            // There should be at least a log here, but this is just an example.
        }

        // Rule 1 violated. Throw a CRUD exception.
        CrudException exception =
                addFieldValidationError(null, "A user cannot be updated due to validation errors.",
                        "emailField", "manageUsers.error.emailExists");
        throw exception;
    }

    @Override
    public void validateDelete(User entity) throws CrudException {
        // Validation rule 1: cannot delete an administrator.
        if (entity.getRole() == Role.ADMIN)
            throw addGlobalValidationError(null, "A user cannot be deleted due to validation errors.",
                    "manageUser.error.cannotDeleteAdmin", entity.toString());
    }

}
