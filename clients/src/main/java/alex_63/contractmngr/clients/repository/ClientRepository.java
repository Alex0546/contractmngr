package alex_63.contractmngr.clients.repository;

import alex_63.contractmngr.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
