package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity;
import jakarta.ejb.Local;

@Local
public interface CityCuriosityDAO extends BaseDAO<CityCuriosity> {
}
