package alex_63.contractmngr.suppliers.service;

import alex_63.contractmngr.suppliers.model.Supplier;
import alex_63.contractmngr.suppliers.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public void create(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> readAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier read(int id) {
        return supplierRepository.getOne(id);
    }

    @Override
    public boolean update(Supplier supplier, int id) {
        if (supplierRepository.existsById(id)) {
            supplier.setId(id);
            supplierRepository.save(supplier);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        if (supplierRepository.existsById(id)) {
            supplierRepository.deleteById(id);
            return true;
        }
        return false;
    }
}