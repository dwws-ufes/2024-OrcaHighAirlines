package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.norcahigh.core.domain.User;
import jakarta.ejb.Local;

@Local
public interface ManageUsersService extends CrudService<User> {
}
