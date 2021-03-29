package alex_63.contractmngr.suppliers.repository;

import alex_63.contractmngr.suppliers.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
