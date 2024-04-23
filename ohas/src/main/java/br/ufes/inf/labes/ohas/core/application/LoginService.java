package br.ufes.inf.labes.ohas.core.application;

import br.ufes.inf.labes.ohas.core.application.exceptions.LoginFailedException;
import br.ufes.inf.labes.ohas.core.domain.User;
import jakarta.ejb.Local;

@Local
public interface LoginService {
  /**
   * Authenticates a user given her username and password. If the user is correctly authenticated,
   * she should be available as a User object through the getCurrentUser() method.
   *
   * @param username The username that identifies the user in the system.
   * @param password The password that authenticates the user.
   * @throws LoginFailedException If the username is unknown or the password is incorrect.
   */
  void login(String username, String password) throws LoginFailedException;

  /**
   * Obtains the currently logged-in user.
   *
   * @return The User object that represents the user that is currently logged in.
   */
  User getCurrentUser();
}
