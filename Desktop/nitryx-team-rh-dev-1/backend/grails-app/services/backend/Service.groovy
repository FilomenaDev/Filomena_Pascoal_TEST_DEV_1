package backend

import grails.gorm.transactions.Transactional

import java.time.Duration
import java.time.LocalDateTime

@Transactional
class Service {

    def getStocks(Company company,int  numbersOfHoursUntilNow) {
        def QUOTE_HOUR=60L
        Stock stock
        def stock_quote= Duration.between(stock.price_date, LocalDateTime.now())

        stock_quote=stock_quote.plusHours(numbersOfHoursUntilNow)
        def result = """
        stock quote ${company.nameCompany} ${stock.price * stock_quote.toMinutes()}
        The total time, ${stock_quote.toMillis()}
        The number of quotes retrieved, ${QUOTE_HOUR * stock_quote.toMinutes()}
        """

        return result

    }
}
