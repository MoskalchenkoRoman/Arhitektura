package dz4.HomeWork4.src.Core;

import dz4.HomeWork4.src.Interfaces.ICarrierRepo;
import dz4.HomeWork4.src.Interfaces.ICashRepo;
import dz4.HomeWork4.src.Models.Carrier;
import dz4.HomeWork4.src.Models.Ticket;
import dz4.HomeWork4.src.Models.User;
import dz4.HomeWork4.src.Services.CarrierRepository;
import dz4.HomeWork4.src.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {


    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;
    private long cardNumber;
    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }



    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
    }


}
