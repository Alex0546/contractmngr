package alex_63.contractmngr.clients.service;

import alex_63.contractmngr.clients.model.Client;

import java.util.List;

public interface ClientService {

    /**
     * Создает нового покупателя
     * @param client - покупатель для создания
     */
    void create(Client client);

    /**
     * Возвращает список всех покупателей
     * @return список покупателей
     */
    List<Client> readAll();

    /**
     * Возвращает покупателя по его ID
     * @param id - ID покупателя
     * @return - объект покупателя с заданным ID
     */
    Client read(int id);

    /**
     * Обновляет покупателя с заданным ID,
     * в соответствии с переданным покупателем
     * @param client - покупатель, в соответствии с которым нужно обновить данные
     * @param id - id покупателя, которого нужно обновить
     * @return - true, если данные были обновлены, иначе false
     */
    boolean update(Client client, int id);

    /**
     * Удаляет покупателя с заданным ID
     * @param id - id покупателя, которого нужно удалить
     * @return - true если покупателя был удален, иначе false
     */
    boolean delete(int id);
}
