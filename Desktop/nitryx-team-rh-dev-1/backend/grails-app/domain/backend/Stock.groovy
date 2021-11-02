package backend

import java.time.LocalDateTime


class Stock {
    BigDecimal price
    Date price_date
    static belongsTo = [company: Company]
    static constraints = {
        price  nullable:false,  blanck:false
        price_date nullable:false,  blanck:false
        belongsTo nullable: false

    }
}
