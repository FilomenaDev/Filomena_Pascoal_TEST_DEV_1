package backend

import java.time.LocalDateTime

class BootStrap {
    CompanyService companyService
    StockService stockService

    def init = { servletContext ->
        def company = Company.saveAll(new Company(nameCompany: 'Google',segment: 'Software'))
        def company1 = Company.saveAll(new Company(nameCompany: 'Coca-cola',segment: 'Refrigerante'))
        def company2 = Company.saveAll(new Company(nameCompany: 'Ford',segment: 'Veiculo'))

         new Stock(price: 80,price_date: LocalDateTime.now(),belongsTo:company).save()
    }

    def destroy = {
    }
}
