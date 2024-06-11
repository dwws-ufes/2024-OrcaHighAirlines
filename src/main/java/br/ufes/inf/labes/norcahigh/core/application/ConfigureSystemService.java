package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.norcahigh.core.application.exceptions.SystemAlreadyInstalledException;
import jakarta.ejb.Local;

@Local
public interface ConfigureSystemService {
    void installSystem() throws SystemAlreadyInstalledException;
}
