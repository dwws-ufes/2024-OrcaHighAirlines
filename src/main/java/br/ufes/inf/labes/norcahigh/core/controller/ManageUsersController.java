package br.ufes.inf.labes.norcahigh.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.norcahigh.core.application.ManageUsersService;
import br.ufes.inf.labes.norcahigh.core.domain.Role;
import br.ufes.inf.labes.norcahigh.core.domain.User;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.util.List;

@Named
@ViewScoped
public class ManageUsersController extends CrudController<User> {

  @EJB
  private ManageUsersService manageUsersService;

  /** List of existing roles, used to populate a radio button field of the CRUD form. */
  private final List<Role> roles = List.of(Role.values());

  @Override
  protected CrudService<User> getCrudService() {
    return manageUsersService;
  }

  public List<Role> getRoles() {
    return roles;
  }

}
