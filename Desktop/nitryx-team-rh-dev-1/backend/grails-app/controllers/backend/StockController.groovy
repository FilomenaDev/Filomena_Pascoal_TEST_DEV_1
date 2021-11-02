package backend

class StockController {

    static scaffold = Stock
    static allowedMethods = [save: 'POST', update: 'PUT', delete: 'DELETE']

    def show(Stock stock) {
        respond stock
    }
}
