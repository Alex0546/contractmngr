package alex_63.contractmngr.suppliers.service;

import alex_63.contractmngr.suppliers.model.Supplier;

import java.util.List;

public interface SupplierService {

    /**
     * Создает нового поставщика
     * @param supplier - поставщик для создания
     */
    void create(Supplier supplier);

    /**
     * Возвращает список всех поставщиков
     * @return список поставщиков
     */
    List<Supplier> readAll();

    /**
     * Возвращает поставщика по его ID
     * @param id - ID поставщика
     * @return - объект поставщика с заданным ID
     */
    Supplier read(int id);

    /**
     * Обновляет поставщика с заданным ID,
     * в соответствии с переданным поставщиком
     * @param supplier - поставщик, в соответствии с которым нужно обновить данные
     * @param id - id поставщика, которого нужно обновить
     * @return - true, если данные были обновлены, иначе false
     */
    boolean update(Supplier supplier, int id);

    /**
     * Удаляет поставщика с заданным ID
     * @param id - id поставщика, которого нужно удалить
     * @return - true если поставщик был удален, иначе false
     */
    boolean delete(int id);
}
