package alex_63.contractmngr.suppliers.controller;

import alex_63.contractmngr.suppliers.model.Supplier;
import alex_63.contractmngr.suppliers.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping(value = "/suppliers")
    public ResponseEntity<?> create(@RequestBody Supplier supplier) {
        supplierService.create(supplier);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/suppliers")
    public ResponseEntity<List<Supplier>> read() {
        final List<Supplier> clients = supplierService.readAll();

        return clients != null //&&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/suppliers/{id}")
    public ResponseEntity<Supplier> read(@PathVariable(name = "id") int id) {
        final Supplier supplier = supplierService.read(id);

        return supplier != null
                ? new ResponseEntity<>(supplier, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/suppliers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Supplier supplier) {
        final boolean updated = supplierService.update(supplier, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/suppliers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = supplierService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}