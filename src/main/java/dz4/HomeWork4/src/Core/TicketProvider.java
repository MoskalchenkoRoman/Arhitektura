package dz4.HomeWork4.src.Core;

import dz4.HomeWork4.src.Interfaces.ITicketRepo;
import dz4.HomeWork4.src.Models.Ticket;
import dz4.HomeWork4.src.Services.TicketRepository;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {

    private ITicketRepo ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }


    /**
     * Метод получения билетов из базы данных
     *
     * @return список билетов
     * @throws RuntimeException
     */
    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }



    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public void getTickets(int ticket) {
    }
}
