package br.ufes.inf.labes.ohas.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.ohas.core.domain.User;
import jakarta.ejb.Local;

@Local
public interface ManageUsersService extends CrudService<User> {
}
